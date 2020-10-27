
/*5.	Баланс по сметка
Напишете програма, която пресмята колко общо пари има в 
сметката, след като направите определен брой вноски.
 На всеки ред ще получавате сумата, която трябва да внесете в сметката,
  до получаване на команда “NoMoreMoney”. При всяка получена сума на конзолата
   трябва да се извежда "Increase: " + сумата и тя да се прибавя в сметката.
    Ако получите число по-малко от 0 на конзолата трябва да се изведе "Invalid operation!"
     и програмата да приключи. Когато програмата приключи трябва да се принтира "Total: " 
     + общата сума в сметката закръглена до втория знак след десетичната запетая. 
Примерен вход и изход
вход	изход		вход	изход
5.51
69.42
100
NoMoreMoney	Increase: 5.51
Increase: 69.42
Increase: 100
Total: 174.93		120
45.55
-150	Increase: 120
Increase: 45.55
Invalid operation!
Total: 165.55

 * */
import java.util.Scanner;
public class AccountBalance {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double sumMoney=0;
		String moneyBank = scanner.nextLine();
		while (!moneyBank.equals("NoMoreMoney")) {  //Сравнява се стринга с цел проверка
			double monеyDeposit = Double.parseDouble(moneyBank); // Парсва се с цел превръщане на стринга в число
		if (monеyDeposit>0) {									// Проверка за отрицателно число
			sumMoney+=monеyDeposit;			// Ако проверката е правилна числото се сумира със следащото
			System.out.printf("Increase: %.2f\n",monеyDeposit); // Принтира въведният резултат
			moneyBank = scanner.nextLine();						// Продължава с въвеждането 
		} else {
			System.out.printf("Invalid operation!\n");		// Ако проверката не излезе се принтира това
			break;											// За да прекрати цикъла
			}				
		}
		System.out.printf("Total: %.2f\n",sumMoney);// Независимо от проверките на края се сумира цялата сума и се принтира
	}
}
