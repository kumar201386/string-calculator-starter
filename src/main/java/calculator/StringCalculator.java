package calculator;

class StringCalculator {
	
	static int count;
	String delimiters="[,|;|\n]+";

    public int add(String input)   {
    	
    	count++;
    	
    	if(input.isEmpty())
        return 0;
    	
    	else {
    			 if(input.endsWith("\n"))
    				 throw new RuntimeException("Invalid input");
    			 
    			
    		
    		String str[] = input.split(delimiters);
    		int sum=0;
    		for(String s:str) {
    			
    			if(s!="\n")
    			sum+=Integer.valueOf(s);
    		
    		}
    		
    		return sum;
    		
    		
    		
    	}
    }
    
    public int GetCalledCount() {
    	
    	return count;
    }

}