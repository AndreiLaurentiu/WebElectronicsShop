package daos;

import java.util.LinkedList;

import models.ProductReview;

public class ProductReviewDao {
private LinkedList<ProductReview> listProductReviews = new LinkedList<>();
	
	public void save(ProductReview ProductReview) {
        listProductReviews.add(ProductReview);
    }
	
	public void delete(int index) {
		listProductReviews.remove(index);
	}
	
	public LinkedList<ProductReview> getAll() {
        return listProductReviews;
    }

}
