
public class Student {

	int stu_rollno = 22;
	int stu_age = 21;

	public void display1() {
		System.out.println("Welcome all of you to the 1st session");

	}

	public void display2() {
		System.out.println("Automation is really easy");
	}

	public static void main(String[] args) {

		Student obj = new Student();

		obj.display1();
		obj.display2();

		System.out.println("this is student roll number : " + obj.stu_rollno);
		System.out.println("this is student Age : " + obj.stu_age);

	}
}
