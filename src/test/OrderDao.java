package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderDao {
	
	public int insert( OrderVo vo ) {
		int count = 0;
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//1. 드라이버 로딩
			Class.forName( "oracle.jdbc.driver.OracleDriver" );
			
			//2. 연결 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "skudb", "skudb");
			
			//3. statement 준비
			String sql =
            "insert into orders values(seq_orders.nextval,?, ?,?)";
			pstmt = conn.prepareStatement(sql);
			
			//4. 바인딩
			pstmt.setInt( 1, vo.getTotalPrice() );
			pstmt.setString( 2, vo.getPlace() );
			pstmt.setLong( 3, vo.getMemberNo() );
			
			
			//5. query 실행
			count = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			System.out.println( "드라이버 로딩 실패 :" + e  );
		} catch (SQLException e ){
			System.out.println( "error:" + e );
		} finally {
			try {
				//6. 자원정리
				if( pstmt != null ) {
					pstmt.close();
				}
				
				if( conn != null ) {
					conn.close();
				}
			} catch( SQLException e ) {
				System.out.println( "error:" + e );
			}
		}
		
		return count;
	}
	
	public List<OrderVo> getList() {
		List<OrderVo> list = new ArrayList<OrderVo>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//1. 드라이버 로딩
			Class.forName( "oracle.jdbc.driver.OracleDriver" );
			
			//2. 연결 얻어오기
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "skudb", "skudb");
			
			//3. statement 생성
			stmt = conn.createStatement();
			
			//4. SQL문 실행
			String sql =
					"select b.name, b.email ,a.total_price,a.place from orders a, member b where b.member_no = a.member_no";
			rs = stmt.executeQuery(sql);
			
			//5. 결과 처리
			while( rs.next() ) {
				String name =rs.getString(1);
				String email =rs.getString(2);
				Integer totalPrice=rs.getInt(3);
				String place =rs.getString(4);
				

				OrderVo vo = new OrderVo();
				vo.setName(name);
				vo.setEmail(email);
				vo.setTotalPrice(totalPrice);
				vo.setPlace(place);
				
				list.add( vo );
			}
		} catch (ClassNotFoundException e) {
			System.out.println( "드라이버 로딩 실패 :" + e  );
		} catch (SQLException e ){
			System.out.println( "error:" + e );
		} finally {
			try {
				//6. 자원정리
				if( rs != null ) {
					rs.close();
				}
				
				if( stmt != null ) {
					stmt.close();
				}
				
				if( conn != null ) {
					conn.close();
				}
			} catch( SQLException e ) {
				System.out.println( "error:" + e );
			}
		}		
		
		return list;
	}

}
