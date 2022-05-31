package site.metacoding.ex02;

class UtilTest {
	
	// catch 제어권은 메서드가 갖고있음
	public static void divide(int n) {
		try {
			System.out.println(10 / n);
		} catch (Exception e) { 
			System.out.println("0을 나눌 수 없어요. 다른 값을 넣으세요.");
		}
		
	}
	
	// 메서드를 만드는사람이 어떻게 제어해야할지 모를 때 throws
	// 호출한 사람에게 catch 제어권을 넘김
	public static void divide2(int n) throws Exception {
		System.out.println(10 / n);
	}
}

public class ExceptionTest {

	public static void main(String[] args) {
		UtilTest.divide(0);
		
		try {
			UtilTest.divide2(0);
		} catch (Exception e) {
			System.out.println("0을 나눌 수 없어요. 다른 값을 넣으세요.");
		}
	}

}
