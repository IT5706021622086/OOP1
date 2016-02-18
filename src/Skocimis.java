
import java.util.Scanner;

public class Skocimis {
	static int n[] = new int[3];
	static int result;
	public static void main(String[] args) {
		Input();
		Calculate();
		Output();
	}
	
	public static void Input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input 3 integer (0 < A < B < C < 100): ");
		for (int i = 0; i < n.length; i++) {
		n[i] = scan.nextInt();
		}
	}
	
	public static void Calculate() {
		if (n[0] <= 0 || n[0] >= 100) {
			System.out.println("Invalid Input. Please enter again!!!");
		} else if (n[1] <= 0 || n[1] >= 100) {
			System.out.println("Invalid Input. Please enter again!!!");
		} else if (n[2] <= 0 || n[2] >= 100) {
			System.out.println("Invalid Input. Please enter again!!!");
		} else if (n[1] <= n[0]) {
			System.out.println("B must more than A. Please enter again!!!");
		} else if (n[2] <= n[1]) {
			System.out.println("C must more than B. Please enter again!!!");
		}
		result = ((n[2] - n[1]) - 1);
	}
	
	public static void Output() {
		System.out.println("------- Show Output -------- ");
		System.out.println(" Most played : " + result + " time.");
	}
}