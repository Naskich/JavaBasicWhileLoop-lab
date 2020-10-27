
/*
 * Парола
Напишете програма, която първоначално прочита име и парола на потребителски профил.
 След това чете парола за вход, при въвеждане на грешна парола, потребителя да се 
 подкани да въведе нова парола.
Примерен вход и изход
вход	изход		вход	изход
Nakov
1234
pass
1324
1234	Welcome Nakov!		Gosho
secret
secret	Welcome Gosho!
*/
import java.util.Scanner;
public class Password {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		String nameAlphabetPass = scanner.nextLine();
		String namePassSecond = scanner.nextLine();	
		while (!nameAlphabetPass.equals(namePassSecond)) {
			namePassSecond = scanner.nextLine();
		}
			System.out.printf("Welcome %s!",userName);	
	}
}
