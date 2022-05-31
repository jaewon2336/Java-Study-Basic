package site.metacoding.ex03.protoss;

public class Zealot {
	
	private final String name; // 이름 : final 최초에 한번 받고 변경 불가 (상수)
	
	// 태어나기도 전에 정해져있다. heap에서 관리하지 못함
	// 공격력과 방어력이 upgrade되면 하나의 질럿이 아닌 전체 질럿이 변경되기 때문에 static으로 관리
	// static은 생성자 초기화와 아무런 상관이 없다
	private static int power = 10; // 공격력
	private static int armor = 10; // 방어력
	
	private int hp; // 체력
	private int sh; // 보호막
	
	// 상대방의 상태 변경
	public void attack() {}
	
	public void powerUpgrade() {
		power++;
		System.out.println("공격력이 1 증가하였습니다.");
	}
	
	public void armorUpgrade() {
		armor++;
		System.out.println("방어력이 1 증가하였습니다.");
	}
	
	public Zealot(String name) {
		super();
		this.name = name;
		
		// 어차피 정해져있는 것은 초기화 시켜주자
		this.hp = 100; 
		this.sh = 100;
	}
	
	
}
