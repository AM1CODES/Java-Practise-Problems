public class CountWords   
{  
    public static void main(String[] args) {  
        String sentence = "Manager have said him that Ramu will get increment if he works hard.";  
        int wordCount = 0;  
          
        for(int i = 0; i < sentence.length()-1; i++) {  
            //Counts all the spaces present in the string  
            //It doesn't include the first space as it won't be considered as a word  
            if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {  
                wordCount++;  
            }  
        }  
        //To count the last word present in the string, increment wordCount by 1  
        wordCount++;  
          
        //Displays the total number of words present in the given string  
        System.out.println("Total number of words in the given string: " + wordCount);  
    }  
}  