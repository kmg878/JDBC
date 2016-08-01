package kr.ac.sungkyul.bookmall.dao.test;

import java.util.List;
import java.util.Scanner;

import kr.ac.sungkyul.bookmall.dao.BookDao;
import kr.ac.sungkyul.bookmall.vo.BookVo;

public class BookMall {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		System.out.print("대여 하고 싶은 책의 번호를 입력하세요:");
		int num = key.nextInt();
		
		BookDao dao = new BookDao();
//		dao.updateStatus((long)num,1);
		
		System.out.println("*****도서 정보 출력하기******");
		displayBookInfo(dao);
		
	}
		public static void displayBookInfo(BookDao dao ) {
			 dao = new BookDao();
			List<BookVo> list = dao.getList();
			
			for(BookVo vo :list){
				System.out.println(vo);
			}
		}
		
		

}
