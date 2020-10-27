import java.util.Scanner;
public class MaxNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String numberRead = scanner.nextLine();
		int maximumNumber=Integer.MIN_VALUE;
		while (!numberRead.equals("Stop")) {
			int maxNumber = Integer.parseInt(numberRead);
			if (maxNumber>maximumNumber) {
				maximumNumber=maxNumber;
			}
			 numberRead = scanner.nextLine();
		}
		System.out.print(maximumNumber);
	}
}
