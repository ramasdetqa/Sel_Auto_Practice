
public class Calculation {

	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public int diff(int a, int b) {
		int diff = a - b;
		return diff;
	}

	public int multi(int a, int b) {
		int multi = a * b;
		return multi;
	}

	public int div(int a, int b) {
		int div = a / b;
		return div;
	}

	public static void main(String[] args) {
		// ((((10+2)-2)+2)*2)/2)
		Calculation obj = new Calculation();
		int sum11 = obj.sum(10, 2);
		int diff1 = obj.diff(sum11, 2);
		int sum12 = obj.sum(diff1, 2);
		int multi1 = obj.multi(sum12, 2);
		int div1 = obj.div(multi1, 2);
		System.out.println("This is Selenium Automation Practice Assignment 1 : " + div1);
		// ((((10*2)-2)+2)-2)/2)
		int multi2 = obj.multi(10, 2);
		int diff21 = obj.diff(multi2, 2);
		int sum21 = obj.sum(diff21, 2);
		int diff22 = obj.diff(sum21, 2);
		int div2 = obj.div(diff22, 2);
		System.out.println("This is Assignment 2 : " + div2);
	}
}
