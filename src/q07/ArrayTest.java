//알파코드 :          이름 :
//아래 코드에서 getArray() 메서드를 완성하여 화면에 5050이 출력되도록 할 것. 

package q07;

public class ArrayTest {
	//main() 메서드는 수정하지 마시오.
	public static void main(String[] args) {
		int[] arr = getArray(100);
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		
		System.out.println("1부터 100까지의 합 : " + sum);
	}
	
	//1. 각각의 원소의 형이 int이고 num개의 원소를 가지는 배열을 생성하고, 
	//2. 각각의 원소가 순차적으로 1부터 100까지의 값을 갖도록 초기화 하고,
	//3. 배열의 주소를 리턴(return)하시오.
	static int[] getArray(int num) {
		
		int[] arr = new int[num]; //처음 생각한게 맞았음
	
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			
		}
		return arr;
		
	}
}






