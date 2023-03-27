//알파코드 :          이름 :
//아래 프로그램을 실행시키면 같은 내용이 여러 줄 출력된다.
//각 Car 개체의 modelNo가 순차적으로 증가되는 서로 다른 내용을 갖도록 Car클래스를 수정하시오. 
//힌트 : serialNo는 모든 개체들이 서로 공유하는 맴버변수이어야 함
//실행 예
//BENZ NO1
//BENZ NO2
//BENZ NO3
//BENZ NO4

package q10;

class Car {
	private static int serialNo;
	private String modelNo;
	
	
	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	//생성자는 이미 완성된 코드이므로 수정하지 마시오.
	public Car() {
		serialNo++;
		modelNo = "BENZ NO" + serialNo;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
}



public class MyTest {
	//main() 메서드는 수정하지 마시오.
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car();
		
		System.out.println(c1.getModelNo());
		
		System.out.println(c2.getModelNo());

		System.out.println(c3.getModelNo());
//		
		System.out.println(c4.getModelNo());
	}
}


