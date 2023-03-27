//알파코드 :          이름 :
//아래 프로그램을 수행하면 12 + 34 = 1234가 출력된다.
//1234대신에 두 수의 합인 46이 출력되도록 아래 코드를 수정하시오.
//힌트(Hint) : Integer 클래스를 사용할 것!

package q19;

public class AddTest {
	public static void main(String[] args) {
		String val1 = "12";	//이 줄을 수정하지 마시오
		String val2 = "34";	//이 줄을 수정하지 마시오
		
		
		System.out.print(val1 + " + " + val2 + " = "); //이 줄을 수정하지 마시오
		//아래 코드를 수정하시오.
		
		System.out.println(Integer.parseInt(val1) + Integer.parseInt(val2));
		System.out.println();
	}
	
}