
public class StringBufferTest {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1 + "STRING";
		System.out.println("S1 : " + s1);
		StringBuffer s3 = new StringBuffer("Java");
		s3.append("Automation");
		s3.append("Testing");
		System.out.println("s3 : " + s3);
		StringBuilder s4 = new StringBuilder("Selenuim");
		s4.append("Java");
		s4.append("Testing");
		System.out.println("s4 : " + s4);
		System.out.println("S1 : " + System.identityHashCode(s1));
		System.out.println("S2 : " + System.identityHashCode(s2));
		System.out.println("S3 : " + System.identityHashCode(s3));
		System.out.println("S4 : " + System.identityHashCode(s4));

	}

}
