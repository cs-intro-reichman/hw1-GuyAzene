// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);

		int maxNum = Math.max(a, Math.max(b, c));
		int minNum = Math.min(a, Math.min(b, c));
		int midNum = a + b +c - maxNum - minNum;

		System.out.printf("%d %d %d%n", a, b, c);
		System.out.printf("%d %d %d%n", minNum, midNum, maxNum);



	}
}
