package exceptionExp;

public class ExceptionExp {

	public static void main(String[] args) {
		
		try {
			int a[]= {1,2,3,4};
			System.out.println(a[5]);
			String s = null;
			System.out.println(s.charAt(0));
		}
        catch(NullPointerException n) {
        	System.out.println(n);
		}
		catch(Exception e){
			System.out.println("current exception :"+e);
		}
		
		finally {
			System.out.println("must handle this block");
		}

	}

}
