package ch07.sec05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapStudent {

	public static void main(String[] args) {
		// 학생 이름과 Student 객체를 쌍으로 저장하는 HashMap 컬렉션 생성
		HashMap<String, Student> map = new HashMap<String, Student>();
		// 3 명의 학생 저장
		map.put("황기태", new Student(1, "010-111-1111")); 
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-3333"));
		Scanner scan = new Scanner(System.in);
		
		//HashMap 출력
		Set<String> keySet = map.keySet();
		for(String key:keySet) {
			System.out.printf("key=%s value=%s \n",key,map.get(key).toString());
		}
		System.out.println("================================================");
		
		Iterator<String> ir = keySet.iterator();
		while(ir.hasNext()) {
			String key = ir.next();
			System.out.printf("key=%s value=%s \n",key,map.get(key).toString());
		}
		
		
		while(true) {
		System.out.print("검색할 이름?");
		String name = scan.nextLine(); // 사용자로부터 이름 입력
		if(name.equals("exit"))
		break; // while 문을 벗어나 프로그램 종료
		Student student = map.get(name); // 이름에 해당하는 Student 객체 검색
		if(student == null)
		System.out.println(name + "은 없는 사람입니다.");
		else
		System.out.println("id:" + student.getId() + ", 전화:" + student.getTel());
		}
		System.out.println("The end");

	}

}
