
/*4.	Редица числа 2K+1
Напишете програма, която чете число n, въведено от потребителя,
 и отпечатва всички числа ≤ n от редицата: 1, 3, 7, 15, 31, …. 
 Всяко следващо число се изчислява като умножим предишното с 2 и добавим 1.
 * */
import java.util.Scanner;
public class Sequence2k1 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int number = Integer.parseInt(scanner.nextLine());
		 int sumNumber = 1;
		 while (number>=sumNumber) {
			 System.out.println(sumNumber);
				 sumNumber=sumNumber*2+1;
		}
		
	}

}
