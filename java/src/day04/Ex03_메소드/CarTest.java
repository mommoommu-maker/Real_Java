package day04.Ex03_메소드;

public class CarTest {

	public static void main(String[] args) {
		//객체 생성
		Car car = new Car();
		car.model = "제네시스";
		//car.speed = 130;
		
		car.setSpeed(200);
		System.out.println("Model : "+car.model);
		System.out.println("Speed : "+car.getSpeed());
		
		car.setSpeed(-50);
		System.out.println("Speed : "+car.getSpeed());
		
		car.setSpeed(400);
		System.out.println("Speed : "+car.getSpeed());
		
		car.setSpeed(130);
		System.out.println("Speed : "+car.getSpeed());
	}
}
