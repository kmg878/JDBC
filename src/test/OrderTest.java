package test;

import java.util.List;

public class OrderTest {
	public static void main(String[] args){
//		testOrderDaoInsert();
		testOrderDaoGetList();
	}
	public static void testOrderDaoGetList(){
		OrderDao dao = new OrderDao();
		List<OrderVo> list = dao.getList();
		
		for( OrderVo vo : list ) {
			System.out.println( vo );
		}		
	}
	public static void testOrderDaoInsert(){
		OrderDao dao = new OrderDao();
		OrderVo vo = new OrderVo();
		vo.setTotalPrice(6000);
		vo.setPlace("서울시관악구");
		vo.setMemberNo(1L);
		dao.insert(vo);
		
		
		
	}

}
