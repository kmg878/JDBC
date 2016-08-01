package test;

import java.util.List;

public class MemberTest {

	public static void main(String[] args) {
		//testMemberDaoInsert();
		testMemberDaoGetList();
	

	}
	public static void testMemberDaoGetList() {
		MemberDao dao = new MemberDao();
		List<MemberVo> list = dao.getList();

		for (MemberVo vo : list) {
			System.out.println(vo);
		}

	}
	
	public static void testMemberDaoInsert(){
		MemberDao dao = new MemberDao();

		MemberVo vo = new MemberVo();
		vo.setName( "전유리" );
		vo.setPhoneNumber("010-1234-1234");
		vo.setEmail("jeon@gmail.com");
		vo.setPassword("1234");
		
		
		
		
		
		
		dao.insert(vo);
		
	}

}
