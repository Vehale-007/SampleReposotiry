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
	public void reverseWords() {
		String s = "life is beautiful enjoy it";
		String[] parts = s.split(" ");
		for(int i=parts.length-1;i>=0;i--)
			System.out.print(parts[i]+" ");
		System.out.println();
	}
	public void stringupper() {
		//convert first letter of string to uppercase
		String s = "life is beautiful enjoy it";
		String se = s.substring(0,1);
		System.out.println(se.toUpperCase() + s.substring(1,s.length()));
	}
	public void upperString() {
		String s = "life is beautiful enjoy it";
		String[] parts = s.split(" ");
		for(int i=0; i<parts.length; i++) {
			char[] ch = parts[i].toCharArray();
			for(int j =0; j<ch.length; j++) {
				ch[0] = Character.toUpperCase(ch[0]);
				System.out.print(ch[j]); 
			}
			System.out.print(" ");
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		ReverseString x = new ReverseString();
		x.reverseString();
		x.countString();
		x.reverseWords();
		x.stringupper();
		x.upperString();

	}
}