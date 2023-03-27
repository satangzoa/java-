//알파코드 :          이름 :
//method1() 메서드를 호출한 결과가 잘 출력할 수 있도록 컴파일 오류를 수정하시오.

package q11;

public class MethodTest {
	//아래 method1() 메서드를 수정하지 마시오.
	public  String method1() {
		String str = "";
		
		for (int inx = 'A' ; inx <= 'Z' ; inx++) {
			str = str + (char)inx;
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		//아래에 코드를 작성하시오.
		MethodTest mt = new MethodTest();
		System.out.println(mt.method1());
		
		System.out.println( new MethodTest().method1());
	}
}





