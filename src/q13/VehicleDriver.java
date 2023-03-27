//알파코드 :          이름 :
//주워진 클래스를 아래와 같이 수정하되 결과가 이전과 동일하도록 수정하시오. 
//
//	1. Vehicle 클래스에 대해서 캡슐화(Encapsulation) 시킨다.private
//	2. VehicleDriver 클래스를 수정한다.
//
//작성할 Vehicle 생성자는 파라메터(Parameter)의 개수가 2개이며, 
//생성자 안에서 맴버변수 modelName, maxSpeed을 초기화 한다.
//반드시 numOfLimit 맴버변수는 setter(세터) 메서드를 이용하여 초기화 해야 한다.
//(파라메터 2개가 아닌 다른 생성자는 만들지 말 것)

package q13;

//클래스를 캡슐화 시키시오.
class Vehicle {
	private String modelName;
	private int maxSpeed;
	private int numOfLimit;
	
	
	
	public Vehicle(String modelName, int maxSpeed) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
	}



	public String getModelName() {
		return modelName;
	}



	public void setModelName(String modelName) {
		this.modelName = modelName;
	}



	public int getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	public int getNumOfLimit() {
		return numOfLimit;
	}



	public void setNumOfLimit(int numOfLimit) {
		this.numOfLimit = numOfLimit;
	}



	void displayInfo() {
		System.out.println("모델명 : " + modelName);
		System.out.println("최고속력 : " + maxSpeed);
		System.out.println("탑승정원 : " + numOfLimit);
	}
}

//캡슐화된 Vehicle 클래스를 처리하도록 수정하시오.
public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v = new Vehicle("보잉747", 1400);
//		v.setModelName("보잉747");
//		v.setMaxSpeed(1400);
		v.setNumOfLimit(250);
		
		v.displayInfo();
	}
}
