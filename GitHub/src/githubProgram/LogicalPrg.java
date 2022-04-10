package githubProgram;

import java.util.ArrayList;

public class LogicalPrg {

	public void pallindrome() {
		int a[] = {123,234,332,121,345,434};
		int r=0;
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
		System.out.println();
	}
	public void prime() {
		System.out.print("Prime No. : ");
		ArrayList l = new ArrayList();
		for(int i=2; i<=100; i++) {
			int c = 0;
			for(int j =2; j<=i; j++) {
				if(i%j == 0) {
					c = c+1;
				}
			}
			if(c == 1) {
				l.add(i);
			}
		}
		System.out.print(l);
		System.out.println();
	}
	public void perfect() {
		int n = 6;
		int c = 0;
		for(int i=1; i<n; i++) {
			if(n%i == 0) {
				c = c+i;
			}
		}
		if(c == n) {
			System.out.println("It is perfect number");
		}else {
			System.out.println("It is not perfect number");
		}
	}
	public void factorial() {
		int n = 5;
		int b = 1;
		for(int i = 1; i<= n; i++) {
			b = b*i;
		}
		System.out.println("Factorial of " + n + "! : " + b);
	}
	public static void main(String[] args) {
		LogicalPrg x = new LogicalPrg();
		x.pallindrome();
		x.armStrong();
		x.prime();
		x.perfect();
		x.factorial();
	}
}
