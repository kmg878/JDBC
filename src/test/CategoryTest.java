package test;

import java.util.List;



public class CategoryTest {
	public static void main(String[] args) {
		//testCategoryDaoInsert();
		testCategoryDaoGetList();

	}

	public static void testCategoryDaoGetList() {
		CategoryDao dao = new CategoryDao();
		List<CategoryVo> list = dao.getList();

		for (CategoryVo vo : list) {
			System.out.println(vo);
		}

	}
	
	public static void testCategoryDaoInsert(){
		CategoryDao dao = new CategoryDao();

		CategoryVo vo = new CategoryVo();
		vo.setGenre( "인문" );
		
		
		dao.insert(vo);
		
	}
}
