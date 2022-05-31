package site.metacoding.ex01;

// heap, stack, static(클래스 종속 키워드)
class Lion {
	private int 배상태 = 0;
	
	public int get배상태() {
		return 배상태;
	}
	
	public void eat() { // 재귀 메서드

		int happy = 0; // 지역 변수
		배상태++;
		happy = happy + 10;
		
		if (배상태 >= 100) {
			
		} else {
			eat();
		}
	}
}

public class StackOverFlowEx01 {

	public static void main(String[] args) {
		// Lion을 new 할(메모리에 띄울) 책임은 누구도 없다 -> main
		Lion lion = new Lion();
		lion.eat();
		System.out.println("아 배불러 : " + lion.get배상태());
	}
}