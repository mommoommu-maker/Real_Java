package day06.Ex02_인터페이스;

public class Drone implements RemoteControl {
int speed;

@Override
public void turnOn() {
	System.out.println("드론 전원을 킵니다.");
	
}

@Override
public void turnOff() {
	System.out.println("드론 전원을 끕니다.");
	
}
	
	public void setSpeed(int speed) {
		//최대 속려을 초과하지 못하게 지정
		if(speed>RemoteControl.MAX_SPEED) {
			this.speed = RemoteControl.MAX_SPEED;
			System.err.println("최대 속력입니다.");
			
			System.out.println("최대 속력 입니다");}
			else if(speed<RemoteControl.MIN_SPEED) {
				this.speed = RemoteControl.MIN_SPEED;
				System.err.println("최저 속력입니다.");
			}
			
			else this.speed = speed;
			System.out.println("현재 속도 : "+this.speed);
		}
}
