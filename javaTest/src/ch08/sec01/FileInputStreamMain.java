package ch08.sec01;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileInputStreamMain {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			
			FileReader fr = new FileReader("C:\\javatest10\\javaTest.txt");
//			FileInputStream fr = new FileInputStream("C:\\javatest10\\javaTest.txt");
//			InputStreamReader isr = new InputStreamReader(fr);
			while(true) {
				int data = fr.read();
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("The end");

	}

}
