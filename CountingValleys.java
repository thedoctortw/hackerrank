public static int countingValleys(int steps, String path) {
    // Write your code here
        //hiker starts at the sea level
        int numberOfSequences = 0;
        int hiker = 0;
        boolean isOnValley = false; 
        //iterating the path string
        for(int i = 0; i < steps; i++)
        {
            
            char step = path.charAt(i);
            
            if(step == 'U')
                hiker += 1;
            else if(step == 'D')
                hiker -= 1;
            
            //check if a sequence formed.
            if(isOnValley && hiker == 0)
            {
                numberOfSequences += 1;
                isOnValley = false;
            }
            
            //if hiker goes below sea level, it means that a valley sequence is on
            if(hiker < 0 && !isOnValley)
                isOnValley = true;
        }
        
        return numberOfSequences;
    }