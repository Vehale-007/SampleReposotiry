package githubProgram;

public class ReverseString {

	public void reverseString() {
		String s = "Hello World";
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		System.out.println(s.replaceAll(" ", ""));
	}
	public void countString() {
		String s = "CRIF High@ Mark Pvt. Ltd. 1996";
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		char[] ch = s.toCharArray();
		for(char result : ch) {
			if(Character.isUpperCase(result)) {
				a++;
			}
			else if(Character.isLowerCase(result)) {
				b++;
			}
			else if(Character.isWhitespace(result)) {
				c++;
			}
			else if(Character.isDigit(result)) {
				d++;
			}
			else {
				e++;
			}
		}
		System.out.println("UpperCase : " + a);
		System.out.println("LowerCase : " + b);
		System.out.println("Spaces : " + c );
		System.out.println("Digits : " + d);
		System.out.println("Special Character : " + e);
	}
	public static void main(String[] args) {
		ReverseString x = new ReverseString();
		x.reverseString();
		x.countString();
	}
}