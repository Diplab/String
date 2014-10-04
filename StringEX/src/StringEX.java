
public class StringEX {

	
	public static void main(String[] args) {
		String str = "A Dog ";
		System.out.println(str.length());//6
		System.out.println(str.concat("!"));//A dog !
		System.out.println(str.trim());//A dog
		System.out.println(str.indexOf("d"));//2
		System.out.println(str.charAt(3));//o
		System.out.println(str.substring(2,5));//dog
		System.out.println(str.replace("dog","cat"));//A cat
		System.out.println(str.equalsIgnoreCase("A DOG "));//true
		System.out.println(str.startsWith("A"));//true
		System.out.println(str.endsWith("dog"));//true
		System.out.println(str.toLowerCase());//a dog
		System.out.println(str.toUpperCase());//ADOG
		System.out.println(str);//A dog 
	}

}
