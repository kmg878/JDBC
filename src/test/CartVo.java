package test;

public class CartVo {
	private Integer count;
	private Long bookNo;
	private Long memberNo;
	private Integer price;
	private String bookName;
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Long getBookNo() {
		return bookNo;
	}
	public void setBookNo(Long bookNo) {
		this.bookNo = bookNo;
	}
	public Long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CartVo [count=" + count + ", price=" + price + ", bookName=" + bookName + "]";
	}

	
	
	
}