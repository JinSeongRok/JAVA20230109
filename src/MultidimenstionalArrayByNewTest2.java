
public class MultidimenstionalArrayByNewTest2 {

	public static void main(String[] args) {
		int[][] random = new int[4][4];
		int num;
		
		for(int i=0; i<random.length-1; i++) {
			for(int k=0; k<random.length-1; k++) {
				random[i][k] = (int)((Math.random()*10)+1);
				
				random[i][3] += random[i][k];
				random[3][k] += random[i][k];	
				random[3][3] += random[i][k];
				
				
			}
		}
		for(int i=0; i<random.length; i++) {
			for(int k=0; k<random.length; k++) {
				System.out.print(random[i][k] + "\t");
			}
			System.out.println();
		}
	}
}
