
public class indexOfContainsExample2 {

	public static void main(String[] args) {
		String str = "?ڹ? ???α׷????? ???ƴ?!";
		int location = str.indexOf("???ƴ?!");		
		String newStr = str.replace("???ƴ?!", "????!");
		
		
		
		System.out.println(location);
		System.out.println(str.length());
		System.out.println(newStr);
	}

}
