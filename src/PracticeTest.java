import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.util.*;

public class PracticeTest {

    // maxDiff()
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // longestCharWord()
    @Test
    void testLongestCharWordShowsLongestWord(){
        //arrange
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Complete");
        words.add("Cluelessness");
        words.add("Bartender");
        words.add("Monkey");
        words.add("Carpenter");

        //act
        String actual = Practice.longestCharWord(words, 'C');

        //assert
        assertEquals("Cluelessness", actual);
    }

    // longerShorter()
    @Test
    void testLongerShorterCountsCorrectly(){
        //arrange
        HashSet<String> words = new HashSet<>();
        words.add("Hello");
        words.add("Complete");
        words.add("Poop");
        words.add("Bartender");
        words.add("Monkeys");
        words.add("Hey");

        //act
        int actual = Practice.longerShorter(words, 7, 5);

        //assert
        assertEquals(4, actual);
    }

    // evenOddDiff
    @Test
    void testEvenOddDiffShowsDifference(){
        //arrange
        HashMap<Integer, Integer> values = new HashMap<>();
        values.put(1, 5);
        values.put(2, 1);
        values.put(3, 8);
        values.put(4, 6);
        values.put(5, 3);

        //act
        int actual = Practice.evenOddDiff(values);

        //assert
        assertEquals(1, actual);
    }

    // secondLargest
    @Test
    void testSecondLargestShowsSencondLargestNumber(){
        //arrange
        HashMap<Integer, Integer> values = new HashMap<>();
        values.put(1, 5);
        values.put(5, 1);
        values.put(9, 8);
        values.put(2, 6);
        values.put(12, 3);

        //act
        int actual = Practice.secondLargest(values);

        //assert
        assertEquals(9, actual);
    }
    
}


