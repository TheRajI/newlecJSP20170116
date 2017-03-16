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
			System.out.println("��������������������������������������������������������������������������������");
			System.out.println("��                ���� �޴�                          	   ��");
			System.out.println("��������������������������������������������������������������������������������");

			System.out.println(" 1.ȸ�� ���� ");
			System.out.println(" 2.�Խñ� ���� ");
			System.out.println(" 3.���� ");
			System.out.print(" ���� >  ");

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

				System.out.println("��������������������������������������������������������������������������������");
				System.out.println("��                ȸ�� ����                          	   ��");
				System.out.println("��������������������������������������������������������������������������������");
				System.out.println("���̵�		�̸�		��ȭ��ȣ");
				for (Member m : list) {

					System.out.printf("%s\t\t%s\t\t%s\n", m.getId(), m.getName(), m.getPhone());
				}

				System.out.println();
				System.out.println("(1).�߰� (2).���� (3).���� (4).�����޴�  ");
				System.out.print(" ���� >  ");
				String ipt2 = scan.nextLine();
				switch (ipt2) {
				case "1":
					
					System.out.printf("���̵� : ");
					String id = scan.nextLine();
					System.out.printf("�̸� : ");
					String name = scan.nextLine();
					System.out.printf("��ȭ��ȣ : ");
					String phonenum = scan.nextLine();
					
					t.setId(id);
					t.setName(name);
					t.setPhone(phonenum);
					
					memberDao.add(t);
					
					System.out.println("��� �Ǿ����ϴ�.");
					
					break;
				case "2":
					
					
					System.out.printf("������ ���̵� �Է��ϼ��� : ");
					String id2 = scan.nextLine();
					
					
					System.out.println("���泻���� �Է��ϼ���.");
									
					System.out.printf("�̸� : ");
					String name1 = scan.nextLine();
					
					
					System.out.printf("��ȭ��ȣ : ");
					String phonenum1 = scan.nextLine();
					
					t.setId(id2);		
					t.setName(name1);
					t.setPhone(phonenum1);
					
					
					memberDao.update(t);
					
					System.out.println("���� �Ǿ����ϴ�.");
					
					break;
					
				case "3":
					System.out.printf("������ ���̵� �Է��Ͻø�˴ϴ�^^ : ");
					String id3 = scan.nextLine();
					
					t.setId(id3);
					
					memberDao.delete(t);
					
					System.out.println("���� �Ǿ����ϴ�.");
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
