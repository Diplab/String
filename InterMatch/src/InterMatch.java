
public class InterMatch {
	public static void main(String[] args) {
		//�y�z�i�঳�t���A�M�ᱵ�ۤ@�өΦh�ӼƦr
		System.out.println("-123".matches("-?\\d+"));
		System.out.println("456".matches("-?\\d+"));
		//��+�O�X�z���A�����ŦX���W��ܦ�
		System.out.println("+789".matches("-?\\d+"));
		//����(-|\\+)����ܪk
		//(-|+)�O���~���A�]��"+"�b���W��ܦ������S��w�q
		System.out.println("+789".matches("(-|\\+)?\\d+"));
	}

}
