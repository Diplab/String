import java.util.Scanner;


public class ScannerEx {

	public static void main(String[] args) {
		String str = "1,3,5,7,9";
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*,\\s*");
		while(scan.hasNextInt()) //�P�_�O�_���U�Ӧr��
		System.out.println(scan.nextInt());
	
		
	}

}
