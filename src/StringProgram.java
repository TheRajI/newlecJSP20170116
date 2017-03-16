import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) throws IOException {
			FileInputStream fis = new FileInputStream("res/script.txt");
			Scanner scan = new Scanner(fis);
			Scanner input = new Scanner(System.in);
			
						
			System.out.print("입력할 단어 : ");
			String text = input.next();
						
			int num=0;
			while(scan.hasNext()){
				String line = scan.nextLine();
				num++;
				//출력될때 라인번호 출력하기
				//사용자에게 단어입력받아서 라인번호포함 문장 출력하기
				
				if(line.indexOf(text) >= 0){
					
					System.out.println(num+"번째 열 : "+line.replace(text, "["+text+"]"));					
				}

			}
			
			
						
			scan.close();
			fis.close();
	}
}




/*			String name1 =new String("아이유");
String name2 ="아이유";

System.out.println(name1 == name2);
System.out.println(name1.equals(name2));

String fileName = "photo.jpg";

int a = fileName.indexOf(".")+1;
int b = fileName.length();
// System.out.println(fileName.indexOf("."));
// System.out.println(fileName.substring(a,b));
String data = "강호동,이경규,설현";
String[] names = data.split(",");
String aa = names[0]+","+names[1];
// String aa = names[0].concat(names[1]);
System.out.println(names[2]);
System.out.println(aa);

System.out.println(names.length);*/