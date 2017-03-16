import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BmpProgram {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/images.bmp");
		
		byte[] fileHeader = new byte[14];
		fis.read(fileHeader);
		
		byte[] bmpHeader = new byte[92];
		fis.read(bmpHeader);
		fis.close();
		
		// 파일크기
	/*	int fileSize = 	(((int)fileHeader[5]) << 24) | 
					(((int)fileHeader[4])  << 16) |
					(((int)fileHeader[3])  << 8) |	
					(((int)fileHeader[2]));
		
		System.out.println(fileSize);*/
		
		// 이미지 너비
		int Width = (((int)bmpHeader[7] << 24 & 0xff000000) | 
					((int)bmpHeader[6] << 16 & 0x00ff0000) | 
					((int)bmpHeader[5] << 8 & 0x00ff00) | 
					((int)bmpHeader[4] & 0x000000ff));
		
				System.out.println(Width);
			
		
	}

}
