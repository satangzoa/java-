//알파코드 :          이름 :
//아래 코드는 컴파일시 오류가 발생한다.
//정상적으로 컴파일되고 실행되도록 프로그램을 수정하시오.  

package q05;


public class MyTest {
	public static void main(String[] args) {
		int sum = 0;
		int inx;
		for (inx = 1 ; inx <= 10 ; inx++) {
			 sum = sum + inx;
		}
		//inx는 for문 안에만 존재한다.
		System.out.println("1부터 " + (inx - 1) + "까지 더한 합 : " + sum); // 이 줄의 코드는 수정하지 마시오. 
	}
}
