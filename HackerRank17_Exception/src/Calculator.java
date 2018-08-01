
class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	public int power(int base, int pow) throws Exception{
		int result = base;
		if (base < 0 || pow < 0){
			throw new Exception("n and p should be non-negative");
		} else if (base == 0){
			result = 0;
		} else if (pow == 0) {
			result = 1;
		}
		else {
			for (int i = 1; i < pow; i++) {
				result *=base;
			}
		}
		return result;

	}

}
