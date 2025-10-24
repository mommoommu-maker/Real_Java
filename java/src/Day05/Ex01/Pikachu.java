package Day05.Ex01;

public class Pikachu {
	
	//변수
	public int energy;
	public String type;
	
	//기본 생성자
	public Pikachu() {
		/*energy = 100;
		type = "전기";*/
		this(100,"전기");
	}
	
	//메소드(생성자) 오버로딩
	public Pikachu(int energy) {
		this(energy,"전기");
		//this(energy,"전기"); == this. energy = energy;
	}
	
	//메소드(생성자) 오버로딩
	public Pikachu(int energy, String type) {
		this.energy = energy;
		this.type = type;
	}

	//메소드
	public String aAttack() {
		return "십만볼트";
	}
	

	public String bAttack() {
		return "전광석화";
	}

	@Override
	public String toString() {
		return "Pikachu [energy=" + energy + ", type=" + type + "]";
	}
	
	
}