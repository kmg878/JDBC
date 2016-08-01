package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	

	//입력
		public int insert( MemberVo vo ) {
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
	            "insert into member values(seq_member.nextval, ?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				
				//4. 바인딩
				pstmt.setString( 1, vo.getName() );
				pstmt.setString(2, vo.getPhoneNumber());
				pstmt.setString(3,vo.getEmail());
				pstmt.setString(4,vo.getPassword());
				
				
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
		
		public List<MemberVo> getList() {
			List<MemberVo> list = new ArrayList<MemberVo>();

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
						"select member_no,name,phone_no,email,password from member ";
				rs = stmt.executeQuery(sql);
				
				//5. 결과 처리
				while( rs.next() ) {
					Long memberNo = rs.getLong( 1 );
					String name =rs.getString(2);
					String phoneNo =rs.getString(3);
					String email =rs.getString(4);
					String password=rs.getString(5);

					MemberVo vo = new MemberVo();
					vo.setMemberNo(memberNo);
					vo.setName(name);
					vo.setPhoneNumber(phoneNo);
					vo.setEmail(email);
					vo.setPassword(password);
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
