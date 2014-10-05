import java.util.Formatter;

public class FormatNumber {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb);
		formatter.format("數字 = %d%n",30);
		formatter.format("20八進位 = %o%n",20);
		System.out.println(sb);
		
		//直接printf
		System.out.printf("數字 = %d%n20八進位 = %o%n",30,20);
	}

}
