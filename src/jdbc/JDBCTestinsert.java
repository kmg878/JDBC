package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTestinsert {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		 
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2.
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "skudb", "skudb");
			
			//3.statement 생성
			 stmt = conn.createStatement();
			
			//4.SQL문 실행
			String sql ="insert into author values(6,'맹자',null)";
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count+"개의 row가 입력되었습니다");
		    
		   
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패 :" + e);
		}catch (SQLException e){
			System.out.println("error : "+e);
		}finally{
			try {
				//6.자원 정리
				
				
				if(stmt !=null){
					stmt.close();
				}
				if(conn !=null){
					conn.close();
				}
			
			}catch (SQLException e) {
				System.out.println("error:"+e);
			}
		}


	}

}
