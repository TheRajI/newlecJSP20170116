package oop.array;

import java.util.Scanner;

public class Exam { //����ȭ : ���������� ��������� �׷�ȭ 

   // ����ȭ
   private int kor;      // Ŭ�����ȿ����� ���� X(������ ��������°� �ƴ϶� �����ϴ°�(û����)) , �Լ� �ȿ����� ���� 
   private int eng;
   private int math;


   
/*   public void setKor(int kor)
   {
      this.kor= kor;
   }
   */

public static int inputMenu() {
      
      int menu;
      
      System.out.println("��������������������������������������������������������������������������������");
      System.out.println("��                ���� �޴�                          ��");
      System.out.println("��������������������������������������������������������������������������������");

      System.out.println(" 1.���� �Է� ");
      System.out.println(" 2.���� ��� ");
      System.out.println(" 3.���� ");
      System.out.print(" ���� >  ");
      
      Scanner scan = new Scanner(System.in);
      
      menu = scan.nextInt();
      
      return menu;
   }
   public void input() {

         //this ������ ���

/*         System.out.println("��������������������������������������������������������������������������������");
         System.out.println("��                �����Է�                            ��");
         System.out.println("��������������������������������������������������������������������������������");
*/
         Scanner scan = new Scanner(System.in);
         do {   
            System.out.print(" ���� : ");
            kor = scan.nextInt();

            if (kor < 0 || kor > 100)
               System.out.println("������ ������ 0~100�����Դϴ�.");
         } while (kor < 0 || kor > 100);

         do {
            System.out.print(" ���� : ");
            eng = scan.nextInt();
            if (eng < 0 || eng > 100)
               System.out.println("������ ������ 0~100�����Դϴ�.");
         } while (eng < 0 || eng > 100);

         do {
            System.out.print(" ���� : ");
            math = scan.nextInt();
            if (math < 0 || math > 100)
               System.out.println("������ ������ 0~100�����Դϴ�.");
         } while (math < 0 || math > 100);
         System.out.println(" ������������������������������������������������������������������������������");

      
         
        
      }

   public void print() {

      int total = kor + eng + math;
      float avg = total / 3;

/*      System.out.println("��������������������������������������������������������������������������������");
      System.out.println("��                �������                                     |");
      System.out.println("��������������������������������������������������������������������������������");
*/
      System.out.printf(" ���� :%d\n", kor);
      System.out.printf(" \t���� : %d\n", eng);
      System.out.printf(" \t\t���� : %d\n", math);
      System.out.printf(" \t\t\t���� : %d\n", total);
      System.out.printf(" \t\t\t\t��� : %.2f\n", avg);
      System.out.println(" ������������������������������������������������������������������������������");

   }


  
   
}