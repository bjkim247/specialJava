package ch07.sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList 선언
		String[] strArray = new String[10];
		ArrayList<String> strList = new ArrayList<String>();
		// 추가 및 가져와서 출력하기
		for (int i = 0; i < 5; i++) {
			int no = (int) (Math.random() * (100 - 1 + 1) + (1));
			strArray[i] = new String("홍길동" + no);
			strList.add(new String("홍길동" + no));
		}
		printArrayList(strArray, strList);
		
		
		//ArrayList >> Iterator변환해서 출력하기
		System.out.println("=================Iterator======================");
		Iterator<String> iterator = strList.iterator();
		while(iterator.hasNext()) {
			String data = iterator.next();
			System.out.printf("%s",data);
		}
		
		//해당되는 객체가 존재하는 확인
		boolean isFind = false;
		int indexOf = -1;
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i] != null && strArray[i].equals("저길동1")) {
				isFind = true;
				indexOf = 1;
				break;
			}
		}
		System.out.printf("배열에 저길동이 %s \n",(isFind == true)? "있어요":"없어요");
		System.out.printf("배열에 저길동이 위치는 %d \n", indexOf);
		System.out.printf("List에 저길동이 %s \n", (strList.contains("저길동") == true)?"있어요":"없어요");
		System.out.printf("List에 저길동이 위치는 %d \n", strList.indexOf("저길동"));
		
		//Arraylist -> toArray 배열로 변환
		System.out.println("================================================");
		Object[] obj = strList.toArray();
		for(Object data :obj ) {
			System.out.printf("%s ",data.toString());
		}
		
		
		
		//배열을 ArrayList
		System.out.println();
		List<String> list = Arrays.asList(strArray);
		for(String data:list) {
			System.out.printf("%s ",(data != null)? data.toString():null);
		}
		
		for (int i = 0; i < strList.size(); i++) {
			System.out.printf("strArray[%d]=%s \t", i, strArray[i]);
			System.out.printf("strList[%d]=%s \n", i, strArray[i]);
		}
		// 삽입(2번째 위치 삽입)
		strArray[1] = new String("저길동");
		strList.add(1, new String("저길동"));
		
		
		System.out.println("================================================");
		for (int i = 0; i < strList.size(); i++) {
			System.out.printf("strArray[%d]=%s \t", i, strArray[i]);
			System.out.printf("strList[%d]=%s \n", i, strList.get(i));
		}
		//삭제(2번째 위치 삭제) 출력하기
		strArray[1] = null;
		strList.remove(1);
		System.out.println("===========================================");
		printArrayList(strArray, strList);
		
		//전체클리어
		for(int i=0;i<strArray.length;i++) {
			strArray[i] = null;
		}
		strList.clear();
		System.out.printf("strArray.length = %d \n",strArray.length);
		System.out.printf("strList.size() = %d \n",strList.size());
		
		//isEmpty()
		boolean isEmpty = true;
		for(int i=0;i<strArray.length;i++) {
			if(strArray[i] != null) {
				isEmpty = false;
			}
		}
		System.out.println();
		if(isEmpty == true) {
			System.out.printf("배열이 비어있어요");
		}else {
			System.out.printf("배열에 값이 있어요");
		}
		
		
 		System.out.println("The end");
	}

	private static void printArrayList(String[] strArray, ArrayList<String> strList) {
		for (int i = 0; i < strList.size(); i++) {
			System.out.printf("strArray[%d]=%s \t", i, strArray[i]);
			System.out.printf("strList[%d]=%s \n", i, strList.get(i));
		
	}
	}
}
