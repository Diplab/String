import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regular {

	public static void main(String[] args) {
		 Pattern pat;
         Matcher mat;
         Boolean found;

         pat = Pattern.compile("Java");   //�إ߭n��諸pattern
         mat = pat.matcher("Java");       //pattern�n�M�uJava�v�r��Ӥ�
         found = mat.matches();           //��pattern�O�_�M�uJava�v�r�꧹���ۦP

         if (found)
                 System.out.println("�Ĥ@����令�\");
         else
                 System.out.println("�Ĥ@����異��");

         mat = pat.matcher("Java 2");     //pattern�n�M�uJava 2�v�r��Ӥ�
         found = mat.matches();           //��pattern�O�_�M�uJava 2�v�r�꧹���ۦP

         if (found)
                 System.out.println("�ĤG����令�\");
         else
                 System.out.println("�ĤG����異��");

         found = mat.find();              //��pattern�O�_�t�b�uJava 2�v�r�ꤤ

         if (found)
                 System.out.println("�ĤT����令�\");
         else
                 System.out.println("�ĤT����異��");
	}

}
