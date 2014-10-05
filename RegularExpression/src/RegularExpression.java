import java.util.Scanner;


public class RegularExpression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        String str = "abcdefgabcabc"; 
        System.out.println(str.replaceAll(".bc", "###")); 
 
        System.out.print("輸入手機號碼: "); 
        str = scanner.next();
 
        // 簡單格式驗證 
        if(str.matches("[0-9]{4}-[0-9]{6}")) 
            System.out.println("格式正確"); 
        else 
            System.out.println("格式錯誤");
 
        System.out.print("輸入電子郵件: "); 
        str = scanner.next();
 
        // 驗證電子郵件格式 
        if(str.matches(
        "^[_a-z0-9-]+([.][_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$"))
            System.out.println("格式正確"); 
        else
            System.out.println("格式錯誤"); 
	}

}
