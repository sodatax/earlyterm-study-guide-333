import java.util.*;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int result = 0;
        int smallest = 0;
        int biggest = 0;

        smallest = nums[0];
        biggest = nums[0];

        for(int i : nums){
            if(i < smallest){
                smallest = i;
            }
            if(i > biggest){
                biggest = i;
            }
            result = biggest-smallest;
        }
        return result;
    }


    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    public static String longestCharWord(ArrayList<String> words, Character letter){
        String longestWord = "";

        for(String i : words){
            if(i.charAt(0) == letter){
                if(longestWord.length() < i.length()){
                    longestWord = i;
                }
            }

        }
        return longestWord;
    }

    public static int longerShorter(HashSet<String> words, int longer, int shorter){
        int longerWords = 0;
        int shorterWords = 0;
        for(String word : words){
            if(word.length() > longer){
                longerWords++;
            }
            if(word.length() < shorter){
                shorterWords++;
            }
        }
        return longerWords + shorterWords;
    }

    // Find the difference between the how many odd and even numbers there are in Hashmap values
    public static int evenOddDiff(HashMap<Integer, Integer> value){
        int oddCount = 0;
        int evenCount = 0;

        for(int i : value.values()){
            if(i%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        return oddCount-evenCount;
    }
}