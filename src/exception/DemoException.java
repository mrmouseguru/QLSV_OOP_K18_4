package exception;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int result = 0;
		
		try {
			result = a / 0;
		}
		
		catch(Exception arithmeticException) {
			System.out.println("Lỗi chia cho 0"
					+ arithmeticException.getMessage());
			
		}
		
		
		System.out.println("Result: " + result);

	}

}
