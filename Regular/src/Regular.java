import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regular {

	public static void main(String[] args) {
		 Pattern pat;
         Matcher mat;
         Boolean found;

         pat = Pattern.compile("Java");   //建立要比對的pattern
         mat = pat.matcher("Java");       //pattern要和「Java」字串來比
         found = mat.matches();           //看pattern是否和「Java」字串完全相同

         if (found)
                 System.out.println("第一次比對成功");
         else
                 System.out.println("第一次比對失敗");

         mat = pat.matcher("Java 2");     //pattern要和「Java 2」字串來比
         found = mat.matches();           //看pattern是否和「Java 2」字串完全相同

         if (found)
                 System.out.println("第二次比對成功");
         else
                 System.out.println("第二次比對失敗");

         found = mat.find();              //看pattern是否含在「Java 2」字串中

         if (found)
                 System.out.println("第三次比對成功");
         else
                 System.out.println("第三次比對失敗");
	}

}
