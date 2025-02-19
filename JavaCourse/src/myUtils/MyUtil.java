package myUtils;

public class MyUtil implements AutoCloseable{
	public int calculateNumber(int n) throws CalculateException {
		if (n < 5) {
			throw new CalculateException("input number is less than 5");
		}
		return n - 5; 
	}

	public class CalculateException extends Exception {
		private static final long serialVersionUID = 1L;

		public CalculateException(String string) {
			super(string);
		}
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
}









