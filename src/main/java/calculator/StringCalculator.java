package calculator;

class StringCalculator {
	
	String DEFAULT_DELIMETER=";";

    public int add(String input) {
    	
    	if(input.isEmpty())
        return 0;
    	
    	else {
    		// [^\\d-]
    		String str[] = input.split("[,|;]");
    		int sum=0;
    		for(String s:str) {
    			
    			sum+=Integer.valueOf(s);
    			
    		}
    		
    		return sum;
    	}
    }

}