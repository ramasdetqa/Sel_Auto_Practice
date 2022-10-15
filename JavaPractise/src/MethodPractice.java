
public class MethodPractice {

	public void mtd() {
		this.mtd3();
		System.out.println("Default Method ");
		this.mtd1();
	}

	public void mtd1() {
		System.out.println("one parameterized Method ");
		this.mtd4();
	}

	public void mtd2() {
		System.out.println("two parameterized Method ");
	}

	public void mtd3() {
		System.out.println("three parameterized Method ");

	}

	public void mtd4() {
		this.mtd2();
		System.out.println("four parameterized Method ");
	}

	public static void main(String[] args) {
		MethodPractice obj = new MethodPractice();
		obj.mtd();
	}

}
