package test;

public class BookVo {
	private Long no;
	private String title;
	private Integer rate;
	private Integer status;
	private Integer price;
	private Long authorNo;
	private Long categoryNo;
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Long getAuthorNo() {
		return authorNo;
	}
	public void setAuthorNo(Long authorNo) {
		this.authorNo = authorNo;
	}
	public Long getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}
	@Override
	public String toString() {
		return "BookVo [no=" + no + ", title=" + title + ", rate=" + rate + ", status=" + status + ", price=" + price
				+ ", authorNo=" + authorNo + ", categoryNo=" + categoryNo + "]";
	}
	
	

}
