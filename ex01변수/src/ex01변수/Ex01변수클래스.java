package ex01변수;

import java.util.Scanner;

public class Ex01변수클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//-주석:실행하는 코드가 아닌 메모 작성용
		//-Java에서의 영역
		//:중괄호 한쌍 중에서 열리는 중괄호 부터
		// 닫히는 중괄호를 만나기 전까지의 부분
		//-글래스 생성시, 첫번째 체크박스=main
		// 메인 안쪽{}에 코드를 작성한다.
		//-저장하는 단축키 ctrl s(언제나 저장하는 습관) 
		//-실행하는 단축키 ctrl f11
		//-글자 키우는 단축키:ctrl shift +
		//-글자 줄이는 단축키:ctrl -
		//-코드 한줄 작성이 끝나면 ;(세미콜론)!
		//-결과창:콘솔창
		//-출력하고 싶은  텍스트는 ()안에 넣기!
		System.out.print("Hello world!");
		// print:해당 코드 실행 후,개행X
		// println:해당 코드 실행 후, 개행O
		// syso 작성 후, ctrl space
		System.out.println("자동완성 단축키");
		System.out.println("이번에는 될까?");
		// 입력을 해보자(콘솔창을 통해서 입력 받기)
		// 1.입력받게 해주는 도구 Scanner가져오기
		// 	S대문자 주의!!,ctrl space에서 import!
		Scanner sc= new Scanner(System.in);
		// 2.우리가 붙여준 이름 sc를 호출해서 입력받기!
		// 출력문 println다음에 입력 받으면 개행되서 입력됨
		System.out.print("나이을 입력해주세요 >>");
		// sc.next():문자를 입력받는 기능(행위)
		// sc.nextInt():정수를 입력 받는 기능(행위)
		// = 더이상 같다라는 의미 X,
		// =을 기준으로 오른쪽의 데이터를 왼쪽에 넣는다
		// 정수를 영어로 integer!
		int box=sc.nextInt();
		System.out.println(box);

	}

}
