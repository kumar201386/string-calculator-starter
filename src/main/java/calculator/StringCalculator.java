package calculator;

class StringCalculator {

	static int count;

	public int add(String input) {

		count++;

		if (input.isEmpty())
			return 0;

		else {
			if (input.endsWith("\n"))
				throw new RuntimeException("Invalid input");

			else {
				int sum = 0;
				String inputStr = input.replaceAll("[^\\d-]", " ");
				inputStr = inputStr.trim();
				inputStr = inputStr.replaceAll(" +", " ");
				String arr[] = inputStr.split(" ");

				for (String s : arr) {

					if (checkNegative(Integer.valueOf(s))) {
						throw new RuntimeException("Negative number !");
					}

					else {

						sum += Integer.valueOf(s);
					}

				}
				
				return checkSumLimit(sum);
			}
		}
	}

	public int GetCalledCount() {
		return count;
	}

	public boolean checkNegative(int n) {
		return n > 0 ? false : true;
	}
	
	public int checkSumLimit(int sum) {
		return sum>1000?(sum%1000):sum;
	}
	

}