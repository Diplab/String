import java.util.Formatter;

public class FormatNumber {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Formatter formatter = new Formatter(sb);
		formatter.format("�Ʀr = %d%n",30);
		formatter.format("20�K�i�� = %o%n",20);
		System.out.println(sb);
		
		//����printf
		System.out.printf("�Ʀr = %d%n20�K�i�� = %o%n",30,20);
	}

}
