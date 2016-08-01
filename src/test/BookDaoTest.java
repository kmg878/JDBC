package test;

import java.util.List;



public class BookDaoTest {

	public static void main(String[] args) {
		testBookDaoGetList();
//		testBookDaoInsert();

	}
	
	public static void testBookDaoGetList(){
		BookDao dao = new BookDao();
		List<BookVo> list = dao.getList();
		
		for( BookVo vo : list ) {
			System.out.println( vo );
		}		
	}
	public static void testBookDaoInsert(){
		BookDao dao = new BookDao();

		BookVo vo = new BookVo();
		vo.setTitle( "트와일라잇" );
		vo.setRate( 1 );
		vo.setStatus(0); //재고 있음
		vo.setPrice(6000);
		vo.setAuthorNo( 1L );
		vo.setCategoryNo(1L);
		dao.insert(vo);
		
		
	}

}
