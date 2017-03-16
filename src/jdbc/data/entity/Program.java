package jdbc.data.entity;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdbc.dao.mysql.MySQLMemberDao;
import jdbc.dao.oracle.OracleMemberDao;
import jdbc.data.dao.MemberDao;

public class Program {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		

		// ============================ Controller //
		// =====================================

		end: while (true) {
			System.out.println("┌──────────────────────────────────────┐");
			System.out.println("│                메인 메뉴                          	   │");
			System.out.println("└──────────────────────────────────────┘");

			System.out.println(" 1.회원 관리 ");
			System.out.println(" 2.게시글 관리 ");
			System.out.println(" 3.종료 ");
			System.out.print(" 선택 >  ");

			Scanner scan = new Scanner(System.in);
			String ipt = scan.nextLine();

			switch (ipt) {

			case "1": {
				MemberDao memberDao = new MySQLMemberDao();
				List<Member> list = new ArrayList<>();
				
				list = memberDao.getList(ipt);
				Member t = new Member();
			

				memberDao.add(t);
				System.out.println("----------------------------------------------");
				// ================================= View //
				// ======================================

				System.out.println("┌──────────────────────────────────────┐");
				System.out.println("│                회원 관리                          	   │");
				System.out.println("└──────────────────────────────────────┘");
				System.out.println("아이디		이름		전화번호");
				for (Member m : list) {

					System.out.printf("%s\t\t%s\t\t%s\n", m.getId(), m.getName(), m.getPhone());
				}

				System.out.println();
				System.out.println("(1).추가 (2).수정 (3).삭제 (4).상위메뉴  ");
				System.out.print(" 선택 >  ");
				String ipt2 = scan.nextLine();
				switch (ipt2) {
				case "1":
					
					System.out.printf("아이디 : ");
					String id = scan.nextLine();
					System.out.printf("이름 : ");
					String name = scan.nextLine();
					System.out.printf("전화번호 : ");
					String phonenum = scan.nextLine();
					
					t.setId(id);
					t.setName(name);
					t.setPhone(phonenum);
					
					memberDao.add(t);
					
					System.out.println("등록 되었습니다.");
					
					break;
				case "2":
					
					
					System.out.printf("수정할 아이디를 입력하세요 : ");
					String id2 = scan.nextLine();
					
					
					System.out.println("변경내용을 입력하세요.");
									
					System.out.printf("이름 : ");
					String name1 = scan.nextLine();
					
					
					System.out.printf("전화번호 : ");
					String phonenum1 = scan.nextLine();
					
					t.setId(id2);		
					t.setName(name1);
					t.setPhone(phonenum1);
					
					
					memberDao.update(t);
					
					System.out.println("수정 되었습니다.");
					
					break;
					
				case "3":
					System.out.printf("삭제할 아이디만 입력하시면됩니다^^ : ");
					String id3 = scan.nextLine();
					
					t.setId(id3);
					
					memberDao.delete(t);
					
					System.out.println("삭제 되었습니다.");
					break;
				case "4":
				default:
					break;
				}

				break;
			}
			case "2": {

			}
			case "3": {
				break end;
			}

			}
		}
		// ================================= Model //
		// ======================================

	}

	
}
