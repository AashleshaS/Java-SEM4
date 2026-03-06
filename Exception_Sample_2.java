
public class Exception_Sample_2 {
	public static void main(String[] args) {
		String city = null;
		try {
			int len = city.length();
			System.out.println("Length is : "+ len );
		}
		catch(Exception e) {
			System.out.println("Exception Handled : " + e);
		}
		System.out.println("The End ...");
	}

}
