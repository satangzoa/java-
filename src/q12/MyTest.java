//알파코드 :          이름 :
//아래 2가지 요구사항을 만족하도록 코드를 수정하시오.
//
// 1. Child 클래스를 super(부모)클래스로 하는 sub(자식)클래스를 만들지 못하도록 할 것 final
// 2. Parent 클래스의 m1() 메서드를 sub(자식) 클래스에서 재정의(overriding)하지 못하도록 할 것
// 힌트 : 자바 키워드(keyword)들 중 하나를 이용하여 처리한다.

package q12;

class Parent {
	public final void m1() {
		System.out.println("Parent의 m1() 메서드가 호출되었습니다.");
	}
}

final class Child extends Parent {
	public void m2() {
		System.out.println("Child의 m2() 메서드가 호출되었습니다.");
	}
}

public class MyTest {
	public static void main(String[] args) {
		Parent p = new Child();
		p.m1();
	}
}
