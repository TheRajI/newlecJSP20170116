import java.util.Scanner;

public class SJchangeNum{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);   
      System.out.println("Enter the radix base you want to convert");
      int a = input.nextInt();
      System.out.println("Enter the code "+ a);
      String b = input.next();
      b = b.toUpperCase();
      System.out.println("Enter the radix base you want to convert into");
      int d = input.nextInt();
      int c = b.length();
      int e=0; long total = 0;
      for (int i=0;i<c;i++) {
         if (a <= 10) {
            e = Integer.parseInt(b.substring(c-i-1,c-i));
         }
         else {
            char tt = b.charAt(c-i-1);
            int asc = (int)tt;
            if (asc < 65) {
               e = Integer.parseInt(b.substring(c-i-1,c-i));
            }
            else {
               e = asc-55;
            }
         }
         total += ((long)Math.pow(a,i) * e);
      }
      long j = total; long ttotal = 0; long pop=0; int num=0;
      String ttotal2 = "";
      if (d <= 10) {
         while(j >= d) {
               num++;
               pop = j % d;
               ttotal += pop * (long)Math.pow(10, num-1);
               j /=d;
         }   
         ttotal += j*(long)Math.pow(10, num);
         System.out.println(d + "radix : " + ttotal);
      }
      else {
         while(j >= d) {
            num++;
            pop = j % d;
            if (pop >= 10) { 
               char ttl = (char)(pop+55);
               ttotal2 = ttl + ttotal2;
            }
            else {
               ttotal2 = Long.toString(pop) + ttotal2;
            }
            j /=d;
         }
         if (j >= 10) {
            char ttl2 = (char)(j+55);
            ttotal2 =  ttl2 + ttotal2;
         }
         else{
            ttotal2 = Long.toString(j) + ttotal2;
         }
         System.out.println(d + "radix : " + ttotal2);
      }
   }
}