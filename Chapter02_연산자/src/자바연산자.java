/*
 * - 연산자 - 피연산자
 * 
 *    10 + 20
 *    --   --
 *    |     |
 *    ----------피연산자
 *    
 *		피연산자 1개 - 단항연산자
 *			   2개 - 이항연산자
 *			   3개 - 삼항연산자
 *
 *		1)단항연산자
 *			ㄴ증강연산자 (++한개증가, --한개감소) -> 반복문
 *				int a=10;
 *				++a; > a=11
 *			ㄴ부정연산자 (boolean만 사용 가능)
 *				boolean b=false;
 *				b=!b; > true
 *			ㄴ형변환연산자 
 *				UpCasting(자동 형변환) - (int) 'A' > 작은데이터형을 큰데이터형으로
 *				DownCasting(강제 형변환) - (int) 10.5 > 큰데이터형을 작은데이터형으로
 *			기타 - (~:반전연산자(양수>음수 / 음수>양수)), ., []
 *
 *
 *		2)이항연산자
 *			ㄴ산술연산자 (+, -, *, /, %)
 *				+ : 산술 연산, 문자열 결합
 *				5+6=11
 *				"5"+6 = "56"
 *				5+"7"+6 = "576"
 *				7+7+"7" = "147"
 *				데이터형 자동 변경
 *				--------------
 *				int + double > double
 *				int + long > long
 *				long + double > double
 *
 *				char + char > int
 *				byte + byte > int
 *				char + byte > int
 *				--------------
 *			1)정수 / 정수 = 정수
 *				10/3 > 3	
 *				5/2 > 2
 *			2) 0으로 나눌 경우애는 오류 발생
 *				> 단위테스트 (Junit)
 *				% 나누고 나머지
 *				10%3 > 1
 *				9%4 > 1
 *				10%2 > 0
 *			
 *				>부호
 *				5%2 > 1
 *				-5%2 > -1
 *				5%-2 > 1
 *				-5%-2 > -1
 *				
 *				부호는 왼쪽편 부호를 따라 간다
 *
 *
 *		안중요ㄴ쉬프트연산자 (<<, >>) 비트이동 연산자
 *				10<<2 > 40 (10*2^2)
 *				11<<3 > 88 (11*2^3)
 *				10>>2 > 10
 *
 *
 *		안중요ㄴ비트연산자 (&, |, ^)
 *				&(*)  |(+)  ^(다른비트)
 *				--------------------------------
 *						&(*)	|(+)	^
 *				--------------------------------
 *				0 0		0		0		0
 *				--------------------------------
 *				0 1		0		1		1
 *				--------------------------------
 *				1 0		0		1		1
 *				--------------------------------
 *				1 1		1		1		0
 *				--------------------------------
 *
 *				10 & 14					10 & 14					10 & 14
 *				-------					-------					-------
 *				 1010					 1010					 1010
 *				 1110					 1110					 1110
 *				------- &				-------|				-------^
 *				 1010	>	10			 1110	>	14			 0100	>	4
 *
 *
 *			ㄴ비교연산자 (==, !=, <, >, <=, >=)
 *				결과값 : boolean (T/F)
 *					Ex.) 6==7 false / 6!=7 true / 6<7 true / 6>=7 false ...
 *				정수/실수/문자/논리(==, !=) 가능 > 문자열은 계산 불가
 *								  -----
 *	 .---------------------.		ㄴ> equals(), compare()
 *	 |   		같다  같지않다|
 *	 |  	자바  ==     != |
 *	 |	   오라클  =		<> |
 *	 | 자바스크립트 ===   !== |
 *   '---------------------'
 *
 *
 *			ㄴ논리연산자 (&&, ||)
 *				&& : 직렬연산자
 *				|| : 병렬연산자
 *				------------
 *				(조건)&&(조건)
 *				----	----
 *				  |		 |
 *				  --------
 *					결과			   &&		 ||
 *			--------------------------------------
 *				true	true	  true		true
 *			--------------------------------------
 *				true 	false	  false		true
 *			--------------------------------------
 *				false	true	  false		true
 *			--------------------------------------
 *				false	false	  false		false
 *			--------------------------------------
 *				&& : 범위나 기간 포함  Ex.) 90부터 100까지 A 예약기간			
 *										score>=90 && score<=100
 *				|| : 범위를 벗어난 경우
 *
 *
 *			ㄴ대입연산자 (=, +=, -=, <중요       *=, /=, %=, ...)
 *						  ------------------------------
 *									복합 대입 연산자
 *				int a=10;
 *					<---- 뒤에서 앞으로
 *				int a=10;
 *				int b=20;
 *				int c=a+b;
 *				
 *				int a=10;
 *				a++; - 한개 증가
 *
 *				int a=10;
 *				a+=10
 *				-----
 *				a=a+10 > a=20
 *
 *				int a=100; 					int a=100;
 *				a+=20;						a-=10;
 *				a=a+20						a=a-10
 *				a=120						a=90
 *
 *
 *
 *		3)삼항연산자
 */
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(0));//이진법 변환 코드

	}
// "" = 문자열, ''= 문자
}
