import java.util.Scanner;


public class RegularExpression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 
        String str = "abcdefgabcabc"; 
        System.out.println(str.replaceAll(".bc", "###")); 
 
        System.out.print("��J������X: "); 
        str = scanner.next();
 
        // ²��榡���� 
        if(str.matches("[0-9]{4}-[0-9]{6}")) 
            System.out.println("�榡���T"); 
        else 
            System.out.println("�榡���~");
 
        System.out.print("��J�q�l�l��: "); 
        str = scanner.next();
 
        // ���ҹq�l�l��榡 
        if(str.matches(
        "^[_a-z0-9-]+([.][_a-z0-9-]+)*@[a-z0-9-]+([.][a-z0-9-]+)*$"))
            System.out.println("�榡���T"); 
        else
            System.out.println("�榡���~"); 
	}

}
