//알파코드 :          이름 :
//아래 프로그램을 수행시키면 화면에 "안녕하세요?" 라고 출력될 수 있도록 코드를 완성하시오.

package q20;

public class PolymorphismTest {
	//아래 main 메서드를 수정하지 마시오.
	public static void main(String[] args) {
		MyInterface mi = new MyClass();
		mi.display();
	}
}

//아래에 있는 코드에 이어서 작성하고, 필요하다면 새로운 클래스를 아래에 생성하시오.
interface MyInterface {
	void display();
}

 class MyClass implements MyInterface {

	@Override
	public void display() {
		System.out.println("안녕하세요?");
	}
	
}
 
 