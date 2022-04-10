package githubProgram;

public class LogicalPrg {

	public void pallindrome() {
		int a[] = {123,234,332,121,345,434};
		int r = 0;
		System.out.print("Pallindrome no. : ");
		for(int i=0; i<a.length; i++) {
			int s = 0;
			 int t = a[i];
			 while(a[i] > 0) {
				 r = a[i]%10;
				 s = s*10 + r;
				 a[i] = a[i]/10;
			 }
			 if(s == t) {
				 System.out.print(t + " ");
			 }
		}
		System.out.println();
	}
	public void armStrong() {
		int a[] = {111,234,153,345,343,370,456,543,371};
		int r = 0;
		System.out.print("Armstring No. : ");
		for(int i=0; i<a.length; i++) {
			int s = 0;
			int t = a[i];
			while(a[i] > 0) {
				r = a[i]%10;
				s = s + r*r*r;
				a[i] = a[i] /10;
			}
			if(s == t) {
				System.out.print(s + " ");
			}
		}
	}
	public static void main(String[] args) {
		LogicalPrg x = new LogicalPrg();
		x.pallindrome();
		x.armStrong();
	}
}
