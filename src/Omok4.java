import java.util.Scanner;

public class Omok4 {

   public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      int enter_x = 0, enter_y = 0, swi = 0, restart=0;

      // ������ �׸���

      char board[][] = new char[30][30];

         
      
      do{
      
      
         for (int y = 0; y < 15; y++)
            for (int x = 0; x < 20; x++) {
               if (x == 0 && y == 0)
                  board[y][x] = '��';
               else if (x == 19 && y == 0)
                  board[y][x] = '��';
               else if (x == 0 && y == 14)
                  board[y][x] = '��';
               else if (x == 19 && y == 14)
                  board[y][x] = '��';
               else if (y == 0)
                  board[y][x] = '��';
               else if (x == 19)
                  board[y][x] = '��';
               else if (x == 0)
                  board[y][x] = '��';
               else if (y == 14)
                  board[y][x] = '��';
               else
                  board[y][x] = '��';
            }
   
         for (int y = 0; y < 15; y++) {
            for (int x = 0; x < 20; x++)
               System.out.printf("%c", board[y][x]);
            System.out.println();
         }
   
         
         // ���� ��ǥ �Է�, ����
         
         int w=0;
         
         gameover: while(true){
            
            
               
            do {
               swi=0;
               
               System.out.println(">�����Է�(X Y)");
               System.out.println("�����Է� ������(X= 0~19 , Y= 0~14)�Դϴ�");
               System.out.println("���� �����ϱ�� (20 20)�Դϴ�");            
      
               enter_x = scan.nextInt();
               enter_y = scan.nextInt();

               //���ν���
               if(enter_x == 20 && enter_y == 20){
                  restart=1;                  
                  break gameover;
                  
               }
               
                              
               char white = '��', black = '��';
               
               //�ߺ� �˻�                        
               if((enter_x < 0 || enter_x >= 20) || (enter_y < 0 || enter_y >= 15)){
                  swi = 1;
                  System.out.println("�� �ڸ����� �� ���� �����ϴ�\n");
               }                  
               
               else if   (board[enter_y][enter_x]==white||board[enter_y][enter_x]==black)
                  System.out.println("<<�̹� �� �ڸ��Դϴ�.>>");   
               
               else if ((enter_x >= 0 && enter_x < 20) && (enter_y >= 0 && enter_y < 15)) {
                              
                  if(w==0){
                     board[enter_y][enter_x]= white ;
                     w=1;                  
                  }   
                  
                  else if(w==1){
                     board[enter_y][enter_x]= black ;
                     w=0;               
                  }            
                  
               }            
                        
               
            }while (swi == 1);
                              
            for (int y = 0; y < 15; y++) {
               for (int x = 0; x < 20; x++)
                  System.out.printf("%c", board[y][x]);
                  System.out.println();
               }
            
            //�¸� ���� 
            char white = '��', black = '��';
            
            for(int y=0;y<15;y++){
               for(int x=0;x<20;x++){
                  if((x>=2&&x<=17)&&(y>=2&&y<=12)){
                     if((board[y][x-2]==white&&board[y][x-1]==white&&board[y][x]==white&&board[y][x+1]==white&&board[y][x+2]==white)||
                        (board[y-2][x]==white&&board[y-1][x]==white&&board[y][x]==white&&board[y+1][x]==white&&board[y+2][x]==white)||
                        (board[y-2][x-2]==white&&board[y-1][x-1]==white&&board[y][x]==white&&board[y+1][x+1]==white&&board[y+2][x+2]==white)||
                        (board[y+2][x-2]==white&&board[y+1][x-1]==white&&board[y][x]==white&&board[y-1][x+1]==white&&board[y-2][x+2]==white)){
                        System.out.println("���� �¸��Դϴ�.");
                        break gameover;
                     }
                     
                  
                     else if((board[y][x-2]==black&&board[y][x-1]==black&&board[y][x]==black&&board[y][x+1]==black&&board[y][x+2]==black)||
                              (board[y-2][x]==black&&board[y-1][x]==black&&board[y][x]==black&&board[y+1][x]==black&&board[y+2][x]==black)||
                              (board[y-2][x-2]==black&&board[y-1][x-1]==black&&board[y][x]==black&&board[y+1][x+1]==black&&board[y+2][x+2]==black)||
                              (board[y+2][x-2]==black&&board[y+1][x-1]==black&&board[y][x]==black&&board[y-1][x+1]==black&&board[y-2][x+2]==black)){
                        System.out.println("���� �¸��Դϴ�.");
                        break gameover;
                     }
                  }
						
						else if((x>=0&&x<=1)&&y>=2){
							if(board[y-2][x]==white&&board[y-1][x]==white&&board[y][x]==white&&board[y+1][x]==white&&board[y+2][x]==white){
								System.out.println("���� �¸��Դϴ�.");
								restart=0;
								break gameover;
							}
							else if(board[y-2][x]==black&&board[y-1][x]==black&&board[y][x]==black&&board[y+1][x]==black&&board[y+2][x]==black){
								System.out.println("���� �¸��Դϴ�.");
								restart=0;
								break gameover;
							}
						}
						
						else if((y>=0&&y<=1)&&x>=2){
							if(board[y][x-2]==white&&board[y][x-1]==white&&board[y][x]==white&&board[y][x+1]==white&&board[y][x+2]==white){
								System.out.println("���� �¸��Դϴ�.");
								restart=0;
								break gameover;
							}
							else if(board[y][x-2]==black&&board[y][x-1]==black&&board[y][x]==black&&board[y][x+1]==black&&board[y][x+2]==black){
								System.out.println("���� �¸��Դϴ�.");
								restart=0;
								break gameover;
							}
						}
					}
				}				
			}
			
			
		}while(restart==1);
		
	}

}
