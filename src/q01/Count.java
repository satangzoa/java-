//알파코드 :          이름 :
//1부터 1000사이의 숫자 중에서 3으로 나누어 나머지가 0이거나(or) 9로 나누어 나머지가 0인 숫자가
//몇 개인지 개수를 세고, 그 결과를 화면에 출력하는 프로그램을 작성하시오.

package q01;

public class Count {
	public static void main(String[] args) {
		int count =0;
		for(int i = 1; i <=1000; i++) {
			if(i % 3 == 0 || i % 9 == 0)
				count++;
		}
	System.out.println(count);
	}
}
