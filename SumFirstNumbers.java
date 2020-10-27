
/*3.	Сума от числа
Напишете програма, която чете цяло число от конзолата и на всеки следващ ред цели числа,
 докато тяхната сума стане по-голяма или равна на първоначалното число. След приключване
  на четенето да се отпечата сумата на въведените числа.
Примерен вход и изход
вход	изход		вход	изход
100
10
20
30
40
	100		20
1
2
3
4
5
6	21
 * */
import java.util.Scanner;
public class SumFirstNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());
		int numberSecond = Integer.parseInt(scanner.nextLine());
		int sumNumber=0;
			sumNumber=+numberSecond;
		while (sumNumber<number) {
			numberSecond = Integer.parseInt(scanner.nextLine());
			sumNumber+=numberSecond;
		}
		System.out.println(sumNumber);
	}
}
