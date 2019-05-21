import java.util.ArrayList;

public class Test01 {
	public static void aaa()throws Exception {

		int i = 1 / 0; // 에러가 발생합니다.

	}

	public static void main(String[] args) {
		try {

			aaa(); // aaa메소드를 호출하고 aaa메소드에서는 에러가 발생합니다.

		} catch (Exception e) { // 발생한 에러를 잡아서 처리합니다.

			System.out.println("ERROR");
		}
	}

}
