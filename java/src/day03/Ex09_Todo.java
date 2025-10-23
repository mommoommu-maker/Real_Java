package day03;

import java.util.Scanner;

/*
	 할 일 목록 프로그램!
	 최대 10개의 할 일을 관리할 수 있는 프로그램이다!
	 
	 1.할일추가
	 2.할일목록
	 3.상태변경
	 
	 >상태를 enum으로 정의하여 관리<
	 Status(상태) : 시작 전/진행 중/완료
	 */
enum Status{
		TODO("시작 전"),
		ING("진행 중"),
		DONE("완료");
	
	//상수 선언
	private final String status; //상태의 값을 저장하는 상수
	
		Status(String status) {// 이 친구가 생성자!
			this.status=status;
			/*생성자를 통해 상수의 값을 지정
			 this : 자기자신을 가리킴! 여기서는 enum Status 가리키는거지
			 */
		}
		public String getValue() {
			return status;
		}
		
	}

class Todo{
	String name; //할 일
	Status status; //할 일의 상태
	public Todo(String name, Status status) { //art + shift + s = source메뉴
		this.name = name;
		this.status = status;
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

	
	//ToString
	@Override
	public String toString() {
		//return "Todo [name=" + name + ", status=" + status + "]";
		return "Todo [name=" + name + ", status=" + status.getValue() + "]";
	}
}
	public class Ex09_Todo {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Todo[] todoList = new Todo[10]; //최대 10개의 할일
			int count = 0; //할일 개수
			
			
		while(true) {
			System.out.println("################ 할일 목록 프로그램 ################");
			System.out.println("1. 할일 추가");
			System.out.println("2. 할일 목록");
			System.out.println("3. 상태 변경");
			System.out.println("0. 프로그램 종료");
			System.out.println("메뉴 선택 :");
			int menuNo=sc.nextInt()	;
			sc.nextLine(); //남은 엔터 제거
		
			if(menuNo==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		switch (menuNo) {
			case 1: 
				System.out.print("할일 : ");
				String name = sc.nextLine();
				Todo todo = new Todo(name,Status.TODO); //할일 객체 생성
				todoList[count++] = todo; //할일 추가 / 이거 이해안됌..
				//count++; //할일 개수 증가
				
				System.out.println("할일을 추가하였습니다.");
				System.out.println(todo);
				System.out.println();
				break;
				
				case 2: //할일목록
				System.out.println("========== 할일 목록 ==========");
				for(int i =0; i<todoList.length; i++) {
					if(todoList[i]==null) continue; //반복 돌다가 conti만나면 처음으로 이동
					System.out.println((i+1)+" . "+todoList[i]);
				}
				System.out.println();
				break;
			case 3://상태변경
					System.out.println("할일 번호 : ");
					int index = sc.nextInt()-1; //입력 받은건 이 친구가 가져가는데..
					//enter는 남겨졋어..ㅠ
					sc.nextLine(); //그래서 enter delete
					
					Status[] statusList = Status.values();
					for (Status status : statusList) {
						System.out.println((status.ordinal()+1)+" .  "+status.getValue());
					}
					
					//변경할 상태 번호 입력
					System.out.println("번호 : ");
					int statusNo = sc.nextInt();
					sc.nextInt();
					Status updateStatus = statusList[statusNo-1]; //입력한 번호의 상태
					todoList[index].setStatus(updateStatus); //지정한 할일의 상태 변경
					System.out.println("할 일의 상태를 "+updateStatus.getValue()+"(으/로) 변경하였습니다.");
					break;
			default:
					System.out.println("0~3 사이의 올바른 번호를 입력해주세요.");
				break;
			}
			}
			sc.close();
		}
}
