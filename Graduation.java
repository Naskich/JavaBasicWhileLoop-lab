
/*8.	Завършване – част 2
Напишете програма, която изчислява средната оценка на ученик от цялото му обучение.
 На първия ред ще получите името на ученика, а на всеки следващ ред неговите годишни оценки.
  Ученикът преминава в следващия клас, ако годишната му оценка е по-голяма или равна на 4.00. 
  Ако ученикът бъде скъсан повече от един път, то той бива изключен и програмата приключва,
   като се отпечатва името на ученика и в кой клас бива изключен.
 При успешно завършване на 12-ти клас да се отпечата : 
"{име на ученика} graduated. Average grade: {средната оценка от цялото обучение}"
В случай, че ученикът е изключен от училище, да се отпечата:
"{име на ученика} has been excluded at {класа, в който е бил изключен} grade"
Стойността трябва да бъде форматирана до втория знак след десетичната запетая.  
Примерен вход и изход
вход	изход		вход	изход
Gosho
5
5.5
6
5.43
5.5
6
5.55
5
6
6
5.43
5	Gosho graduated. Average grade: 5.53		Mimi
5
6
5
6
5
6
6
2
3	Mimi has been excluded at 8 grade

 * */
import java.util.Scanner;
public class Graduation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nameStudent =  scanner.nextLine();		
		double yearAverage = 0;
		double lastYearAverage = 0;
		int count = 1;
		int countBadValue = 0;
		int counValue = 0;
	
		double yearValue = Double.parseDouble(scanner.nextLine());
		if (yearValue>2) {		
		double midleValue = yearValue;
		while (count<12) {				
			count+=1;
			yearAverage+=yearValue;
			lastYearAverage=(yearAverage+midleValue)/count;	
			if (yearValue<4) {
				countBadValue++;
				if (countBadValue==2) {
					break;
				}
			}	
			if (count==12) {
				break;
			}			
			yearValue = Double.parseDouble(scanner.nextLine());
		}
	} else {
		System.out.printf("Ivalid parameter!");
	}
		if (yearValue>3 && countBadValue<2 && count==12) {
			System.out.printf(nameStudent+" graduated. Average grade: %.2f ",lastYearAverage);
		} else {
			count= count-2;
			System.out.println(nameStudent+" has been excluded at "+count+" grade");
		}
	}
}