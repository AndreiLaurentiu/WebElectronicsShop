package models;

import java.util.Date;

public class ProductReview {
	private int idReview;
	private User user;
	private int rating;
	private Date reviewDate;
	private String comment;
	
	public ProductReview(int idReview, User user, int rating, Date reviewDate, String comment) {
		this.idReview = idReview;
		this.user = user;
		this.rating = rating;
		this.reviewDate = reviewDate;
		this.comment = comment;
	}
	
	public int getId() {
        return idReview;
    }
    
    public User getUser() {
        return user;
    }
    
    public int getRating() {        
        return rating;
    }    
    
    public Date getReviewDate() {
        return reviewDate;
    }    
        
    public String getReviewText() {
        return comment;
    }
}
	
