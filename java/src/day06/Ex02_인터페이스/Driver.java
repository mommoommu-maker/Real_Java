package day06.Ex02_인터페이스;

public class Driver {
public static void main(String[] args) {
	//인터페이스를 구현한 클래스 객체 만드는 방법
	//인터페이스타입 객체명 = new 구현클래스();
	
	//RC카
	RemoteControl carRc = new RcCar();
	carRc.turnOn();//시동 걸기
	carRc.parking(false); //주행 모드
	carRc.setSpeed(20); //가속
	carRc.parking(true); //주차
	carRc.turnOff(); //
	System.out.println();
	
	RemoteControl.changeBattery();
	System.out.println();
	
	//드론
	RemoteControl droneRc = new Drone();
	droneRc.turnOn();
	droneRc.parking(false);
	droneRc.setSpeed(15);
	droneRc.parking(true);
	droneRc.turnOff();
	System.out.println();
	}
}
