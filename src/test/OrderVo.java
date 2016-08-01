package test;

public class OrderVo {
	private Long orderNo;
	private Integer totalPrice;
	private String place;
	private Long memberNo;
	
	private String name;
	private String email;
	
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(Long memberNo) {
		this.memberNo = memberNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "OrderVo [totalPrice=" + totalPrice + ", place=" + place + ", name=" + name + ", email=" + email + "]";
	}
	
	
	

}
