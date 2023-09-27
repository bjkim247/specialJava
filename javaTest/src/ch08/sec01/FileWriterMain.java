package ch08.sec01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterMain {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			
			fw = new FileWriter("C:\\javatest10\\javaTest.txt");
//			FileInputStream fr = new FileInputStream("C:\\javatest10\\javaTest.txt");
//			InputStreamReader isr = new InputStreamReader(fr);
			while(true) {
				String inputData = scan.nextLine();
				if(inputData.length() == 0) {
					break;
				}
				fr.write(inputData, 0, inputData.length());
				if(data == -1) {
					break;
				}
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		scan.close();
		fw.
		System.out.println("The end");

	}

}
