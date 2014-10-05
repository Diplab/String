
public class SimpleFormat {
	
	public static void main(String[] args) {
		int x = 3;
		double y =3.123689;
		//The old way
		System.out.println("S1: ["+x+" "+y+"]");
		//The new way
		System.out.printf("S2: [%d %f]\n", x, y);
		System.out.format("S3: [%d %f]\n", x, y);

	}

}
