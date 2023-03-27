//알파코드 :          이름 :
//아래 프로그램은 컴파일 오류가 발생한다.
//오류가 발생하는 이유를 잘 생각해 보고,
//컴파일과 프로그램의 실행이 정상적으로 되도록 프로그램을 수정하시오.
//단, main() 메서드는 수정하지 마시오.

package q14;

class AAA {
	public AAA() {
		System.out.println("AAA 클래스의 기본 생성자가 호출되었씁니다.");
	}
	public AAA(String str) {
		System.out.println(str + " : 생성자 호출");
	}
}

class BBB extends AAA {
	public BBB(String str) {
//		super();
		System.out.println(str + " : 생성자 호출");
	}
}

public class AbstractionTest {
	//main() 메서드는 수정하지 마시오.
	public static void main(String[] args) {
		BBB b = new BBB("BBB");
	}
}
