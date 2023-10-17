package com.sist.main;
/*
		재사용 기법
		---------> 기존의 클래스를 사용 (라이브러리)
		라이브러리는 상속보다 포함이 더 많음
		--------
			| 상속을 할 수 없는 클래스 = 종단클래스
			종단 클래스 : public final class ClassName
			----------------------------------------
			=> java.lang <220p>
				String, Math, System, StringBuffer...
				=> 변경할 수 없음 (완제품)
		=> 상속 (is-a)
		=> 포함 (has-a)
		-------------------------- 클래스를 비교할 수 있음
		class A
		{
			int a,b,c,d,e,f;
		}
		class B
		{
			int a,b;
		}
		
		A > B (크기를 잴 수가 없음 = 오류발생)
		
		class A
		{
		}
		class B extends A
		{
		}
		범위 => 공통성 
		A > B	long(8) < float(4) => 수표현
				   1	  1.000000
				   
			식물
			 |
			나무
			 |
		-----------
		|		  |
	  침엽수		 활엽수
	  ----------------
	  	class A
	  	class B
	  	{
	  		A a;
	  	}
	  	=> 포함 클래스 (A<B)
	  	
	  	=> 포함 : 변경없이 있는 그대로 사용
	  	=> 상속 : 변경이 필요한 부분 => 오버라이딩
	  	
	  		ex)
	  			윈도우 => 자동차 모양으로 윈도우 변경해서 사용
	  						ㄴ 상속
	  						class Login extends JFrame
	  						{
	  						}
	  			윈도우 => 사각형으로 사용
	  						ㄴ 포함
	  						class Login
	  						{
	  							jFrame fr=new JFrame();
	  							// 메소드에 선언 => 포함 클래스가 아님
	  							public void display()
	  							{
	  								JFrame fr=new JFrame(); // 지역변수
	  							}
	  						}
	  						
	  						Login log=new Login();
	  						log.fr.메소드()
	  						
	  						=> 포함 클래스가 많다
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
