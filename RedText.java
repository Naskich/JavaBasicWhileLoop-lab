import java.util.Scanner;
public class ReadText {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String nameSome = scanner.nextLine();
	while (!nameSome.equals("Stop")) {	
		System.out.println(nameSome);
		nameSome = scanner.nextLine();
	}
	}
}