
public class RefernceVariableCompareExample {

	public static void main(String[] args) {
		
		int[] arr1;		// 배열 변수 arr1 선언
		int[] arr2;		// 배열 변수 arr2 선언
		int[] arr3;		// 배열 변수 arr3 선언
		
		arr1 = new int[] {1, 2, 3};		// 배열 {1, 2, 3}을 생성하고 arr1 변수에 대입
		arr2 = new int[] {1, 2, 3};		// 배열 {1, 2, 3}을 생성하고 arr2 변수에 대입
		arr3 = arr2;					// 배열 변수 arr2의 값을 arr3에 대입
		
		System.out.println(arr1 == arr2);		// 참조하는 주소에 대한 부분이 달라서 false
		System.out.println(arr2 == arr3);		// 참조하는 주소가 같아서 true

	}

}
