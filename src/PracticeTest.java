import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import java.util.*;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
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
    

    // TODO: Make tests for each problem you solve
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
    
}


