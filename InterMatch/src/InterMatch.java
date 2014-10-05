
public class InterMatch {
	public static void main(String[] args) {
		//描述可能有負號，然後接著一個或多個數字
		System.out.println("-123".matches("-?\\d+"));
		System.out.println("456".matches("-?\\d+"));
		//有+是合理的，但不符合正規表示式
		System.out.println("+789".matches("-?\\d+"));
		//必須(-|\\+)的表示法
		//(-|+)是錯誤的，因為"+"在正規表示式中有特殊定義
		System.out.println("+789".matches("(-|\\+)?\\d+"));
	}

}
