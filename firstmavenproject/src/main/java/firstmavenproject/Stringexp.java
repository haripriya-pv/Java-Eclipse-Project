package firstmavenproject;

public class Stringexp {

	public static void main(String[] args) {
		String s="Haripriy";
		int l=s.length();
		System.out.println(l);
		
		if(l%2==0) {
			System.out.println(s.charAt((l/2)-1));
			System.out.println(s.charAt(l/2));
			
		}
		else {
			System.out.println(s.charAt(l/2));
			
		}
		//swap
		String str1 = "first";
		String str2 = "second";
		String temp;
		temp = str1;
		str1=str2;
		str2=temp;
		System.out.println(str1);
		System.out.println(str2);
		//System.out.println(str1.substring(2, 3));
		//System.out.println(str1.concat("Third"));
		
	}

}
