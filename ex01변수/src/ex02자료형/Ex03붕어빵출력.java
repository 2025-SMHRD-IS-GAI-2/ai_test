package ex02자료형;

import java.util.Scanner;

public class Ex03붕어빵출력 {

	public static void main(String[] args) {
	// 1.입력받는 도구 가져오기
	//s의 대소문자 구분!import(strl space)
		//Scanner sc = new Scanner(System.in);
	// 2."구매 희망하는 팥붕 개수"출력
		//System.out.print("구매 희망하는 팥붕 개수>>");
	// 3.팥붕 개수 입력받아서 변수 num에 저장
		//int num=sc.nextInt();
	// ->팥붕 개수 입력받아, 변수 num선언하여 할당!
	// 4.num 출력!
		//System.out.println(num);
	Scanner sc = new Scanner(System.in);
	System.out.print("구매 희망하는 팥붕 개수>>");
	int num=sc.nextInt();
	System.out.println("붕어빵의 개수:"+num+"개입니다.");
	
	// 변수:데이터를 담아두는 공간
	// 1)변수 선언
	// 자료형 변수명 ;
	int box ;
	// 2)변수 할당(=데이터를 담는 행위)
	box = 3;
	// *초기화:변수 선언 후, 처음으로 할당하는 행위!
	// *변수를 선언하면서 동시에 할당
	int box2 = 5;
	// 상수:데이터를 1번 넣으면 더이상 변경X
	final int box3 = 10;
	//box3=4;
	//변수명 명명 규칙
	//1.키워드(예약어) int,final..사용불가
	//2.대,소문자 구분 + 길이 제한 없음
	//3.숫자로 시작하면 안 된다.
	//4.특수문자 중에서 사용 가능한건?
	//	$ _만 사용 가능하다!
	// 코딩 컨벤션
	// :문법적 오류는 아니지만 개발자들사이에서
	// 지켜주는 규칙
	// 자료형(data type)
	// 1)기본/기초/원시 자료형
	// 2)레퍼런스 자료형(참조 자료형)
	
	// 기본 자료형의 8가지
	// boolean:논리형,true/false
	// char:문자형,'A' 문자 1개만 저장, 홑따옴표
	// byte,short,"int",long
	// float, "double"
	
	
	// String : 레퍼런스 자료형, 문자 1개 이상 저장
	// 			쌍따옴표를 이용해서 저장!
	
	
	
	

	}

}
