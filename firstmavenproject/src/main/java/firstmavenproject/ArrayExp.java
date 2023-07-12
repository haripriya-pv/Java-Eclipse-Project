package firstmavenproject;

import java.util.Scanner;

public class ArrayExp {
	int largest;
	static int lowest;

	public static void main(String[] args) {
		int a[]=new int[8];
		System.out.println("enter array elements: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int number:a) {
			System.out.println(number);
		}
		
		
	    low(lowest,a);
		large(a);
	}
	
	
	public static void low(int l,int a[]) {
		int firstElement = a[0];
		int i;
		for(i=1;i<a.length-1;i++) {
			if(firstElement>a[i]) {
			    firstElement=a[i]; 
			}
		}
		System.out.println("smallest : "+firstElement);
	}
	
	public static void large(int a[]) {
		int firstElement = a[0];
		int i;
		for(i=1;i<a.length-1;i++) {
			if(firstElement<a[i]) {
			    firstElement=a[i]; 
			}
		}
		System.out.println("largest : "+firstElement);
	}
	

}
