package githubProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

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
	public void swapNo() {
		int a = 100;
		int b = 200;
		//not using 3rd variable
		a = a + b;//300
		b = a - b;//100
		a = a - b;
		System.out.print("a : " + a);
		System.out.println(" b : " + b); 
	}
	public void arrayAsc() {
		int[] a = {2,4,3,1,5,7,9,8};
		List l = new ArrayList();
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			l.add(a[i]);
		}
		System.out.println(l);
	}
	
	public void swap3() {
		int d = 100;
		int e = 200;
		int c = 0;
		c = d + e;//300
		d = c - d;//200
		e = c - d;//100
		System.out.print("d : " + d);
		System.out.println(" e : " + e);
	}
	public void maxAndMin() {
		int[] a = {2,33,11,0,-65,345,-98};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int element : a) {
			if(element > max) {
				max = element;
			}
			if(element < min) {
				min = element;
			}
		}
		System.out.println("minumum value : " + min);
		System.out.println("Maximum value : " + max);
	}
	public void random() {
		Random r = new Random();
		int n = r.nextInt();
		System.out.println("Random no : " + n);
	}
	public void commonNo() {
		int[] a = {1,3,2,5,4};
		int[] b = {2,7,9,5,8};
		System.out.print("Common Element : ");
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j]) {
				System.out.print(a[i] + " ");	
				}
			}
		}
		System.out.println();
	}
	public void repeatedNo() {
		int[] a = {1,2,3,2,4,5,1};
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			int n = a[i];
			int c = 0;
			for(int j=0; j<a.length; j++) {
				if(n == a[j]) {
					c++;
					
				}
			}
			if(c == 2) {
				System.out.print(a[i] + " ");
			}
		}
	}
	public static void main(String[] args) {
		LogicalPrg x = new LogicalPrg();
		x.pallindrome();
		x.armStrong();
		x.prime();
		x.perfect();
		x.factorial();
		x.swapNo();
		x.swap3();
		x.arrayAsc();
		x.maxAndMin();
		x.random();
		x.commonNo();
		x.repeatedNo();
	}
}
