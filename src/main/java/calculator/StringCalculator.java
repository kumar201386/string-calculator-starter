package calculator;

class StringCalculator {

    public int add(String input) {
    	
    	if(input.isEmpty())
        return 0;
    	
    	else {
    		
    		if(input.length()==1) {
    			
    			return Integer.valueOf(input);
    		}
    		
    		return 1;
    	}
    }

}