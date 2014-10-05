import java.util.Date;


public class FormatDate {

	public static void main(String[] args) {
		Date date = new Date();
		String s = String.format("use format : %1$tm/%1$td/%1$tY", date);
		System.out.println(s);
		
		System.out.printf("use printf : %1$tm/%1$td/%1$tY", date);

	}

}
