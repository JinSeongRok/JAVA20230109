
public class ArrayCreaeteByValueListExample2 {

	public static void main(String[] args) {
		
		int[] scores;							// �迭�� ���� ���� : ���� ���� null
		scores = new int[] {83, 90, 87};		// new �̿��ؼ� ������ �� �Է�
		
		int sum1 = 0;
		for(int i =0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("����: " + sum1);
		System.out.println("-------------------------");
		// �迭�� �Ű������� �ְ�, �޼ҵ� ȣ�� 
		printItem(new int[] {83, 90, 97});
	}
	public static void printItem(int[] scores) {
		for(int i =0; i<3; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
	}

}