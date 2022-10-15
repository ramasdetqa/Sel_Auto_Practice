public class Constructor {

	public Constructor()

	{
		this(1, 2, 3);
		System.out.println("Default Constructor ");
	}

	public Constructor(int i)

	{
		this(1, 2);
		System.out.println("one parameterized Constructor ");
	}

	public Constructor(int j, int i)

	{
		this();
		System.out.println("two parameterized Constructor ");
	}

	public Constructor(int i, int j, int k)

	{
		System.out.println("three parameterized Constructor ");
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor(1);

	}

}
