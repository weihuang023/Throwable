class MyOwnException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyOwnException(String msg) {
		super(msg);
	}
}

class ThrowDemo { 
	
	static void employeeAge(int age) throws MyOwnException {
		if (age < 0)
			throw new MyOwnException("Age can't be less than zero");
		else
			System.out.println("Input is valid!!");
	}

	static int sum(int num1, int num2) {
		if (num1 == 0)
			throw new ArithmeticException("First parameter is not valid");
		else
			System.out.println("Both parameters are correct!!");
		return num1 + num2;
	}

	public static void main(String args[]) {
	
		try{
			char array[] = {'a','b','g','j'};
			/*I'm displaying the value which does not
			 * exist so this should throw an exception
			 */
			System.out.println(array[2]);
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception!!");
		}finally{
			System.out.println("Finally Block is executed no matter how the try block is exited. ");
		}
		
		try {
			employeeAge(-2);
		} catch (MyOwnException e) {
			e.printStackTrace();
		}

		int res = sum(0, 12);
		System.out.println(res);
		System.out.println("Continue Next statements");
		
	}
}
