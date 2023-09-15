/*
 * 	자바
 * 	---		
 * 		1. 데이터 저장
 * 				변수 : 한개만 저장 (메모리 공간)
 * 				ㄴ>변수 : 프로그램에 따라 변경이 가능
 * 				ㄴ>상수 : 고정 (final)
 * 		2. 저장 방법 : 메모리 크기 (기본형, 데이터형)
 * 				정수
 * 				ㄴ>1byte(-128~127) =>byte
 * 					ㄴ>네트워크 (송수신), 파일업로드, 다운로드, Web
 * 				ㄴ>int : 4byte(32bit) default > 모든 켬퓨터는 모든 숫자를 int로 인식
 * 				ㄴ>long : 62bit (큰 숫자를 저장) : 금융권..
 * 				--------------------정수
 * 				정수 저장 => 10
 * 				int 메모리공간 = 10
 * 					-------> {} 종료시, 프로그램 종료 => 사라짐
 * 				실수
 * 				ㄴ>double : 64bit => 15자리 소수점 저장이 가능
 * 				문자
 * 				ㄴ>char : (0~65535) => 각 문자마다 고유번호를 가지고 있다
 * 							컴퓨터는 무조건 0,1(2진법)
 * 					=> 'A' => 65
 * 					   'a' => 92
 * 					   '0' => 48
 * 				논리
 * 				ㄴ>boolean : 1byte => 저장할 수 있는값 : true/false
 * 				---------------------------------
 * 				데이터 가공
 * 				--------> 점수 입력 (국,영,수) => 평균, 총점, 등수
 * 				웝 => 조회수 증가 , 인기순위
 * 					  hit=hit+1  sort
 * 						=> 연산자, 제어문
 * 						   -----------> 가공단계 (재사용 = 메소드)
 * 												------------> 컴포넌트 / 클래스
 * 
 * 		연산자
 * 			산술연산자 (+ , - , * , / , % )
 * 				ㄴ1. 주의점
 * 						-형변환 (연산처리 => 같은 데이터형이어야 연산된다)
 * 							int + char + double = double (자동 형변환)
 * 							int + (int)char + (int)double = (강제 형변환)
 * 				 2. + (산술=>문자열 결합)
 * 						-연산처리시 문자열이 존재하면 => 결과값은 문자열
 * 							7+7+7+7+"" => "28"
 *  			 3. /
 						- 정수 / 정수 = 정수 , 정수 / 실수 = 실수
 						0으로 나눈때 오류 발생
 				 4. %
 				 	 	- 왼쪽부호가 남는다
 				 	 			(+ , -)
 				 5. 기타
 				 		int + double = double
 				 		char + int = int
 				 		-----------------
 				 		char + char = int
 				 		byte + byte = int
 				 		char + byte = int
 				 		----------------- > 산술 규칙
 				 		
 			단항연산자
 				1. 증감연산자 (++, --)
 					1) 전치연산자
 						++a : 먼저 증가 => 다른 연산 수행
 							int b = ++a;
 							      - --
 							      2  1
 					2) 후치연산자
 						a++ : 먼저 다른 연산 수행 => 1개 증가
 							int b = a++
 								  -  --
 								  1  2
 						**** a는 무조건 1증가 (순서 차이)
 						**** 적용
 								int a=10;
 								System.out.println("a="+ a++)
 				부정연산자 (!)
 				반대효과
 				=> boolean 결과값
 					true=>false , false=>true
 					a%2==0 => a%2==1 , a%2!=0 (a%2==0)
 				
 				형변환 연산자
 				(데이터형)
 					<====================자동형변환======================
 *				byte < char/short(C언어호환, 잘안씀) < int < long < float < double
 *					=======================강제형변환====================>
 *						(int)'A' , (double)10
 *						(int)10.5 => 소수점 제거 => 10
 *						==> 클래스 형변환
 *
 *			-------- boolean (true/false)
 *						제어문=> 조건문, 반복문
 *				비교연산자 (문자열은 비교할 수 없다)
 *					정수/실수/문자/논리 
 *				1) == 같다
 * 				2) != 같지 않다
 * 				3) < 작다
 * 				4) > 크다
 * 				5) <= 작거나 같다
 *				6) >= 크거나 같다
 *		
 *				논리연산자
 *					&&(포함)		||(포함이 안된 경우)
 *						사용법
 *						(조건)&&(조건)
 *							=>여기부터 여기까지
 *								a>=1 && a<=100
 *								a>='A' && a<='Z'
 *								------	  ------
 *								  |			 |
 *								  ------------
 *										|
 *									  결과값
 *								true && true => true
 *								true && false => false
 *								false && true => false
 *								false && false => false
 *
 *								a<'A' || a>'Z'
 *								------	  ------
 *								  |			 |
 *								  ------------
 *										|
 *									  결과값
 *								true || true => true
 *								true || false => true
 *								false || true => true
 *								false || false => false
 *
 *				대입연산자
 *					= : a=10
 *					+= : a+=10 => 기존의 a에 10을 더한다
 *						 ----> a=a+10
 *					-= : a-=10 => 기존의 a에 10을 뺀다
 *						 ----> a=a-10
 *
 *				삼항연산자 : if~else
 *					두개의 값을 지정한다 => 조건에 따라 1개의 값을 가지고 온다
 *					(조건)?값1:값2
 *					 ---
 *					  ㄴ> true => 값1
 *						  false => 값2
 */			
public class 자바정리_특징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
			System.out.println("a="+ ++a);

	}

}
