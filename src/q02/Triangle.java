//알파코드 :          이름 :
//아래와 같이 삼각형 모양의 문자열들을 화면에 출력하는 프로그램을 완성하시오.
//6으로 구성된 행이 없음을 주의할 것!

//1
//22
//333
//4444
//55555
//7777777
//88888888
//999999999

package q02;

public class Triangle {
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j<= i ; j ++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
