import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream("res/script.txt");
			Scanner scan = new Scanner(fis);
			Scanner input = new Scanner(System.in);
			
						
			System.out.print("�Է��� �ܾ� : ");
			String text = input.next();
						
			int num=0;
			while(scan.hasNext()){
				String line = scan.nextLine();
				num++;
				//��µɶ� ���ι�ȣ ����ϱ�
				//����ڿ��� �ܾ��Է¹޾Ƽ� ���ι�ȣ���� ���� ����ϱ�
				
				if(line.indexOf(text) >= 0){
					
					System.out.println(num+"��° �� : "+line.replace(text, "["+text+"]"));					
				}

			}
			
			
						
			scan.close();
			fis.close();
	}
}




/*			String name1 =new String("������");
String name2 ="������";

System.out.println(name1 == name2);
System.out.println(name1.equals(name2));

String fileName = "photo.jpg";

int a = fileName.indexOf(".")+1;
int b = fileName.length();
// System.out.println(fileName.indexOf("."));
// System.out.println(fileName.substring(a,b));
String data = "��ȣ��,�̰��,����";
String[] names = data.split(",");
String aa = names[0]+","+names[1];
// String aa = names[0].concat(names[1]);
System.out.println(names[2]);
System.out.println(aa);

System.out.println(names.length);*/