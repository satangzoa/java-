//알파코드 :          이름 :
//아래 프로그램을 실행시키면 "Java는 멋진 언어이다!"가 아닌 "Java"가 출력된다.
//아래에 제공된 Java 클래스를 활용해서 "Java는 멋진 언어이다!"가 출력할 수 있도록
//프로그램을 수정하시오.

package q09;

//수정되는 코드에서 사용할 클래스
class Java {
	public String name;
}

public class CallTest {
	public static void main(String[] args) {
//		String name = "Java"; //Java 클래스를 이용하도록 수정하시오.
		Java j = new Java();
		j.name = "Java";
		
		
		new CallTest().chanageValue(j);
		
		System.out.println(j.name); //Java 개체의 내용을 출력하도록 수정하시오.
	}
	
	//Java 개체를 파라메터(parameter)로 받아 처리하도록 수정하시오.
	//단, 리턴(return)문을 사용해서는 안됨.
	private void chanageValue(Java j) {
		j.name = j.name + "는 멋진 언어이다!";
		
	}
	
}



