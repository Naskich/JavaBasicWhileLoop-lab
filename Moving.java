
/*9.	*Преместване
На осемнадесетия си рожден ден на Хосе взел решение, че ще се изнесе да живее на квартира. Опаковал багажа си в кашони и намерил подходяща обява за апартамент под наем. Той започва да пренася своя багаж на части, защото не може да пренесе целия наведнъж. Има ограничено свободно пространство в новото си жилище, където може да разположи вещите, така че мястото да бъде подходящо за живеене.
Напишете програма, която изчислява свободния обем от жилището на Хосе, който остава след като пренесе багажа си. 
Бележка: Един кашон е с точни размери:  1m. x 1m. x 1m.
Вход
Потребителят въвежда следните данни на отделни редове:
1.	Широчина на свободното пространство - цяло число в интервала [1...1000]
2.	Дължина на свободното пространство - цяло число в интервала [1...1000]
3.	Височина на свободното пространство - цяло число в интервала [1...1000]
4.	На следващите редове (до получаване на команда "Done") - брой кашони, 
които се пренасят в квартирата - цели числа в интервала [1...10000]
Програмата трябва да приключи прочитането на данни при команда "Done"
 или ако свободното място свърши.
Изход
Да се отпечата на конзолата един от следните редове:
-	Ако стигнете до командата "Done" и има още свободно място:
"{брой свободни куб. метри} Cubic meters left."
-	Ако свободното място свърши преди да е дошла команда "Done":
"No more free space! You need {брой недостигащи куб. метри} Cubic meters more."
Примерен вход и изход
Вход	Изход	Обяснение
10
10
2
20
20
20
20
122	No more free space! You need 2 Cubic meters more.	10 * 10 * 2 = 200 кубични метра.
20 + 20 + 20 + 20 + 122 = 202 кубични метра.
200 - 202 = 2 недостигащи кубични метра

10
1
2
4
6
Done	10 Cubic meters left.	10 * 1 * 2 = 20 кубични метра.
4 + 6 = 10 кубични метра.
20 - 10 = 10 кубични метра.
 * */
import java.util.Scanner;
public class Moving {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int wideDimension = Integer.parseInt(scanner.nextLine());
		if (wideDimension>=1 && wideDimension<=1000) {
			int lengthDimension = Integer.parseInt(scanner.nextLine());
			if (lengthDimension>=1 && lengthDimension<=1000) {
				int hightDimension = Integer.parseInt(scanner.nextLine());
				if (hightDimension>=1 && hightDimension<=1000) {
					int numberBox=0;
					int volumeRoom = 0;
					int sumBox=0;
					String stopCommand =  scanner.nextLine();
					while (!stopCommand.equals("Done")) {
						if (stopCommand.equals("Done")) {
							break;
						} else {
						 numberBox = Integer.parseInt(stopCommand);
						 sumBox+=numberBox;
						 if (numberBox>=1 && numberBox<=1000) {							 
					   volumeRoom = wideDimension*lengthDimension*hightDimension;
						} else {
						 System.out.println("Inavalid parameter! Please insert 1..10000!");
						 break;
						}
						 if (volumeRoom<sumBox) {
							break;
						}
						stopCommand =  scanner.nextLine();
						}
					}
					if (volumeRoom>=sumBox) {
						volumeRoom=volumeRoom-sumBox;
						 System.out.printf( volumeRoom +" Cubic meters left.");
					} else {
						sumBox=sumBox-volumeRoom;
						System.out.printf("No more free space! You need "+sumBox+" Cubic meters more.");
					}
				}else {
				 System.out.println("Inavalid parameter! Please insert 1..1000!");
				}
			}else {
			 System.out.println("Inavalid parameter! Please insert 1..1000!");
			}
		} else {
		 System.out.println("Inavalid parameter! Please insert 1..1000!");	
		}
	}
}
