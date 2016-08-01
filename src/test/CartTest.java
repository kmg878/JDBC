package test;

import java.util.List;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testCartDaoInsert();
		testCartDaoGetList();

	}
	public static void testCartDaoGetList(){
		CartDao dao = new CartDao();
		List<CartVo> list = dao.getList();
		
		for( CartVo vo : list ) {
			System.out.println( vo );
		}		
	}
	
	public static void testCartDaoInsert(){
		CartDao dao = new CartDao();
		CartVo vo = new CartVo();
		vo.setCount(1);
		vo.setBookNo(1L);
		vo.setMemberNo(1L);
		vo.setPrice(6000);
		dao.insert(vo);
		
		
		
	}

}
