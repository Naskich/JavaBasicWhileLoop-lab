import java.util.Scanner;
public class MinNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numberRead = scanner.nextLine();
		int minImput=Integer.MAX_VALUE;
		while (!numberRead.equals("Stop")) {
			int minNumber = Integer.parseInt(numberRead);
			if (minNumber<minImput) {
				minImput=minNumber;
			}
			 numberRead = scanner.nextLine();
		}
		System.out.print(minImput);
	}
}
