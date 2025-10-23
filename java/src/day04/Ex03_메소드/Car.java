package day04.Ex03_메소드;

public class Car {
		//생성자 - 기본 생성자
	String model;
	private int speed;
	
	public Car() {
		this("모델명없음",0);
	}

	//모델 매개변수 생성자
	public Car(String model) {
		this.model = model;
	}
	
	//전체 매개변수 생성자
	public Car(String model, int speed) {
		this.model = model;
		this.speed = speed;
	}

	/*getter & setter
	 	-getter :변수 값 가져오는 메소드
	 	-setter :변수 값 지정하는 메소드
	 	alt + shift + S : R
	 */

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		if(speed<0) {
			speed=0;
			//syserr : ctrl + space
			System.err.println("속도는 음수가 될 수 없습니다.");
		}
		
		if(speed>=300) {
			speed=300;
			System.out.println("최대 속도는 300km/h 입니다.");
		}
		this.speed = speed;
	}
	
}
