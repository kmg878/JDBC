package kr.ac.sungkyul.hr.app;

import java.util.List;
import java.util.Scanner;

import kr.ac.sungkyul.hr.dao.EmployeeDao;
import kr.ac.sungkyul.hr.vo.EmployeeVo;

public class HRApp {
	public static void main(String[] args){
		//searchByName();
		searchBySalary();
	}
	public static void searchBySalary(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("임금 (최저  최고 )>>");
		int minSalary =scanner.nextInt();
		int maxSalary =scanner.nextInt();
		
		System.out.println(minSalary+","+maxSalary);
		EmployeeDao dao = new EmployeeDao();
		List<EmployeeVo> list = dao.getList(minSalary,maxSalary);
		/*코드작성*/
		System.out.println("==========================");
		for(EmployeeVo vo :list){
			System.out.println(vo);
		}
		
		
		
		scanner.close();
	}
	public static void searchByName(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 입력>>");
		String name = scanner.nextLine();
		
		EmployeeDao dao = new EmployeeDao();
		List<EmployeeVo> list =dao.getList(name);
		
		System.out.println("==========================");
		for(EmployeeVo vo :list){
			System.out.println(vo);
		}
		scanner.close();
	}

}
