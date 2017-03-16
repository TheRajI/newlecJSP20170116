

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LottoProgram {

   public static void main(String[] args) throws IOException {

      FileInputStream fis = new FileInputStream("res/data.khw");
      Scanner scan = new Scanner(fis);

      // ���� �迭 ����/����
      int[] num = new int[6];

      // ���� �迭�� �ζ� ��ȣ�� �ε�
      
      for(int i=0;i<6;i++){
         num[i] = scan.nextInt();
      }
      fis.close();
      scan.close();
      
      //���
      //32 6 20 12 39 26 19
               
      //����
      for (int i = 0; i < num.length; i++) 
         for(int j=0;j<i;j++)
            if (num[i] < num[j]) {
               int temp;
               temp = num[i];
               num[i] = num[j];
               num[j] = temp;
            }
      
      // ���
      for(int i=0;i<6;i++)
         System.out.printf("%-4d", num[i]);
      
 
   }
}