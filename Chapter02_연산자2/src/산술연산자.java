/*	<배울 내용들>
 * 	1. 실행 순서
 * 		ㄴ자바 파일명과 클래스명 동일/대소문자 구분
 * 				컴퓨터가 인식하는 언어
 * 				javac(컴파일) > 0,1							 java(인터프리터)
 *  	A.java 파일 생성 =================> A.class(배포파일명) ================> 실행
 * 		   -----                             ㄴ바이너라코드
 * 			ㄴ 원시소스(프로그래머)  		   모든 운영체제에 호환
 * 				ㄴ> 이클립스 : javac+java => ctrl+F11
 * 
 * 	2. 소스 코딩의 주의점
 * 		1) 대소문자 구분
 * 		2) 명령문 끝나고 ;
 * 		3) 주석 처리
 * 		4) 들여쓰기 => { + 엔터
 * 
 * 	3. 자바개발자 약속
 * 		1) 변수 / 클래스 / 메소드 / 상수 / 인터페이스
 * 			-변수, 메소드 : 소문자 시작 => 다른 단어는 첫자 대문자
 * 					Ex.)fileName, file_name
 * 			-상수 : 모든 알파벳 대문자
 * 					Ex.)MAX, MIN...
 * 			-클래스, 인터페이스 : 첫자는 대문자
 * 					Ex.)MainClass
 * 
 * 	***프로그램 (데이터 관리)
 * 		데이터 저장
 * 			ㄴ메모리	>	프로그램 종료와 동시에 사라짐
 * 			 한개의 데이터 관리 => 변수
 * 				ㄴ> 기본형으로 메모리 크기 결정
 * 					정수
 * 					byte(1byte) / int(4byte) / long(8byte)
 * 					문자
 * 					char(2byte)
 * 					실수
 * 					float(4byte) / double(8byte)
 * 					논리
 * 					boolean(1byte)
 * 			 여러개의 데이터 관리 => 배열/클래스 (사용자 정의 => 참조형)
 * 					int + double + char
 * 			-----------------
 * 			ㄴ파일
 * 			ㄴRDBMS(오라클)
 * 			----------------- 영구적인 저장장치
 * 
 * 	4. 변수 / 연산자 / 제어문 / 데이터 모아 관리 / 재사용 / 예외처리
 * 		> 라이브러리를 이용한 조립식 
 * 	5. 응용 : 네트워크, 파일 이용
 * 	--------------------------------------------------------------------------
 * 	오라클 (21c) : CURD (추가, 수정, 삭제, 검색)
 * 	--------------------------------------------------------------------------^필수
 * 	브라우저 연동 : HTMLS/CSS3/Javascript
 * 								ㄴ Jquery (Ajax)
 * 								ㄴ VueJs  (Vuex)
 * 								ㄴ ReactJs (Redux)
 * 							옵션 ㄴ TypeScript/NodeJs-실시간 상담
 * 
 * 	JSP : Back-end + Front-end 둘을 연결
 *  ㄴ MVC (SpringMVC > 직접 Spring 제작)
 *  DataBase 연동 > MyBatis / JPA
 *  Spring
 *  Spring - Boot : ThymeLeaf
 *  AWS (ArmoredWebService) > PaaS > EC2 
 *  --------------------------------------------------------------------------
 *  Python : 데이터 분석, 시각화
 *  		 Pandas / Numpy / MatplotLab
 *  		 옵션 : 머신러닝 / 딥러닝
 *  
 *  변수 : 메모리에 한개 데이터를 저장하는 공간의 별칭
 *  	  ----- 주소
 *  
 *  			변수명 설정
 *  			---------
 *  			1. 알파벳 시작 (대소문자 구분) , 한글
 *  			2. 숫자 사용 가능 (앞에 사용 금지)
 *  			3. 키워드 사용 불가
 *  			4. 공백 없이 사용
 *  			5. 특수문자 가능 (_ , $)
 *  			6. 기타사항 => 압축 (3~7자)
 *  		----------------------------------------
 *  		변수 선언 방식
 *  		-데이터형 변수명;
 *  		
 *  		변수의 초기화
 *  		-변수명=값;
 *  
 *  		변수의 활용	
 *  		변수명=값 (수정) => 자동으로 {}을 벗어나면 삭제됨
 *  		
 *  		변수의 종류 => 지역변수 = {}안에만 사용하는
 *  														ㄱ
 *  		데이터를 저장 => 데이터를 가공 => 가공된 데이터 출력
 *  						ㄴ연산자/제어문			ㄴ화면에 출력			===> 컴포넌트
 *							 ----------메소드
 *		   ㄴ
 *		1. 산술연산자
 *			+ , - , * , / , %
 *			1) 연산은 같은 데이터형끼리만 연산됨
 *				Ex)10.5 + 10 => 20.5
 *				  double  int
 *							ㄴdouble로 변경 (자동 형변환) > 10.0
 *					10.5 + (double)10 => 강제 형변환
 *
 *					<====================자동형변환======================
 *				byte < char/short(C언어호환, 잘안씀) < int < long < float < double
 *					=======================강제형변환====================>
 *
 *				***int 이하 데이터형 (byte, char, short)
 *					==> 연산이 되면 결과값은 int
 *							char + char = int
 *							byte + byte = int
 *			2) + : 산술 처리, 문자열 결합
 *					= '' 문자
 *					= "" 문자열
 *					Ex)
 *						7+"7"+7 => "77"+7 => "777"
 *						7+7+"7" => 14+"7" => "147"
 *						7+"7"+7-5 => "777"-5 => 오류 => 7-5에 ()처리로 해결
 *						7+"7"+7*2 => "77"+14 => "7714"
 *
 *				산술 => 왼쪽에서 오른쪽으로 연산
 *						*,/,%는 +,-보다 우선순위
 *							ㄴ우선순의 변경은 ()
 *				
 *				/ : 정수/정수=정수
 *					10/3 = 3
 *					5/2 = 2
 *					0으로 나누면 오류 발생
 *
 *				% : 부호가 왼쪽부호가 남는다
 *						- % + => -
 *						- % - => -
 *						+ % - => +
 *						+ % + => +
 *
 *				형변환
 *				int a='A'; => a=65
 *				double d=10; => d=10.0
 *				
 *				왼쪽 <= 오른쪽
 */

// 3개 점수 (1~100) => 총합 , 평균
public class 산술연산자 {

	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		//				0.0~0.99*100 => 0.0~99.0
		//					0~99 +1 => 1~100
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		int score=a+b+c;
		double avg=score/3;
		System.out.println("a="+a+",b="+b+",c="+c);
		System.out.println("총점:"+score);
		System.out.printf("평균:%.2f\n",avg); // \n을 붙여야 다음 줄에 출력
		/* [printf]
		 * 실수 : %f		%.2f	%.3f 	....
		 * 정수 : %d
		 * 문자 : %c
		 * 문자열 : %s
		 */
		System.out.println("======================="); //println 은 줄마다 출력 (세로)
		System.out.print("aaa"); //print 는 붙어서 출력 (가로)
		System.out.print("bbb");
	}

}
