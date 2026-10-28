import java.util.Scanner;

class GFG{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vendos numrin e pare: ");
		int a = sc.nextInt();
		System.out.print("Vendos numrin e dyte: ");
		int b = sc.nextInt();
		System.out.print("Totali: " + (a + b));
		sc.close();
	}
}