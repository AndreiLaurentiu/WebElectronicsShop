package services;

import java.util.LinkedList;

import daos.ProductReviewDao;
import models.ProductReview;

public class ServiceProductReview {
private ProductReviewDao productReviewDao = new ProductReviewDao();
	
	public void addReview(ProductReview review) {
		productReviewDao.save(review);
    }
	
	public void printListReviews() {
		productReviewDao.getAll().forEach(System.out::println);
    }
	
	public void removeReviewByIndex(int index) {
		productReviewDao.delete(index);
    }
    
   public LinkedList<ProductReview> getReviews(){
	   return productReviewDao.getAll();
	   }

}
