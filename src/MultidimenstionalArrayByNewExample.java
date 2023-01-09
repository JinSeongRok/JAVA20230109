
public class MultidimenstionalArrayByNewExample {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		
		for (int i=0; i<mathScores.length; i++) {  // ���� �� ��ŭ �ݺ�
			for (int k=0; k<mathScores[i].length; k++) {   // �ش���� �л� �� ��ŭ �ݺ�
				System.out.println("mathScores[" + i + "][" + k + "]" + mathScores[i][k]);
			}
		}
		System.out.println();
		
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		//��ü �л��� ���� ��� ���ϱ�
		int totalStudent = 0;
		int totalMathSum = 0;
		for (int i=0; i<mathScores.length; i++) {			// ���� �л� �� �ջ�
			totalStudent += mathScores[i].length;
			for (int k=0; k<mathScores[i].length; k++) {//�ش� ���� �л� �� ��ŭ �ݺ�
				
				totalMathSum += mathScores[i][k];			// �л� ���� �ջ�
			}
		}
		double totalMathAvg = (double) totalMathSum / totalStudent;
		System.out.println("��ü �л��� ���� ��ü ����: " + totalMathSum);
		System.out.println("��ü �л��� ���� �������: " + totalMathAvg);
		System.out.println();
		
		// �� ���� �л� ���� �ٸ� ��� ���� ������ ���� 2���� �迭 ����
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];		// ù ��° ���� �л��� : 2
		englishScores[1] = new int[3];		// �� ��° ���� �л��� : 3
		//�迭 �׸� �ʱⰪ ���
		for (int i=0; i<englishScores.length; i++) {	// ���� �� ��ŭ �ݺ�
			for (int k=0; k<englishScores[i].length; k++) {	// �ش� ���� �л� �� ��ŭ �ݺ�
				
				System.out.println("englishScores[" + i + "][" + k + "]: " + englishScores[i][k]);
			}
		}
		System.out.println();
		
		// �迭 �� ����
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		//��ü �л��� ���� ��� ���ϱ�
		totalStudent = 0;
		int totalEnglishSum = 0;
		for (int i=0; i<englishScores.length; i++) {	
			totalStudent += englishScores[i].length;
			for (int k=0; k<englishScores[i].length; k++) {	
				
				totalEnglishSum += englishScores[i][k];
			}
		}
		double totalEnglishAvg = (double) totalEnglishSum / totalStudent;
		System.out.println("��ü �л��� ���� ���� ����: " + totalEnglishSum);
		System.out.println("��ü �л��� ���� ��� ����: " + totalEnglishAvg);
	}
}