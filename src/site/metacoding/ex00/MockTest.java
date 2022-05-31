package site.metacoding.ex00;

// Object는 실체화(인스턴스화 = new)가 가능해야함, 클래스는 오브젝트의 설계도
abstract class 요리사 {
	abstract public void 요리();	// 오버라이드됨(무효화)
}

// 요리사
class 임꺽정 extends 요리사 {
	
	public void 요리() { // 재정의
		System.out.println("요리를 시작합니다. 케이크가 만들어졌습니다.");
	}
}

// 사장
class 장보고 {
	요리사 p1; // 의존성 (결합)
	
	public 장보고(요리사 p1) {
		this.p1 = p1;
	}
	
	public void 계산() {
		System.out.println("계산을 합니다.");
	}
}

class Mock임꺽정 extends 요리사 {

	@Override
	public void 요리() {
		// 내용 구현 필요 X 실행할것도 아니니까!
		// 가짜 객체 내부를 구현하는게 stub (메서드의 행동 정의)
	}
}

public class MockTest { // 장보고 테스트할건데 요리사랑 결합되어있으니까 mock 채워주기 테스트

	public static void main(String[] args) {
		// 원코드
//		임꺽정 p1 = new 임꺽정();
//		장보고 s = new 장보고(p1);
//		
//		s.p1.요리();
		
		// 추상화 본코드
//		요리사 p = new 임꺽정();
//		장보고 s = new 장보고(p);
//		
//		s.p1.요리();
		
		// 테스트 코드
		장보고 s = new 장보고(new Mock임꺽정());
		s.계산();
	}

}
