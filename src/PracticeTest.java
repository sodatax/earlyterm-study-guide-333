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

    @Test
    void testMaxDiffPositive() {
        // Arrange
        int[] numbers = {8, 12, 488, 14};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        assertEquals(480, actual);
    }

    @Test
    void testMaxDiffNegative() {
        // Arrange
        int[] numbers = {-1, -7, -25, -4};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        assertEquals(24, actual);
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

    @Test
    void testLongestCharWordSameLength(){
        //arrange
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Complete");
        words.add("Cluelessness");
        words.add("Bartender");
        words.add("Monkey");
        words.add("Hooow");

        //act
        String actual = Practice.longestCharWord(words, 'H');

        //assert
        assertEquals("Hello", actual);
    }

    @Test
    void testLongestCharWordLowerCase(){
        //arrange
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Complete");
        words.add("cluelessness");
        words.add("Bartender");
        words.add("Monkey");
        words.add("carpenter");

        //act
        String actual = Practice.longestCharWord(words, 'C');

        //assert
        assertEquals("cluelessness", actual);
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

    @Test
    void testLongerShorterAllMiddle(){
        //arrange
        HashSet<String> words = new HashSet<>();
        words.add("Hello");
        words.add("Complete");
        words.add("Poop");
        words.add("Bartender");
        words.add("Monkeys");
        words.add("Hey");

        //act
        int actual = Practice.longerShorter(words, 99, 1);

        //assert
        assertEquals(0, actual);
    }

    @Test
    void testLongerShorterWrongOrder(){
        //arrange
        HashSet<String> words = new HashSet<>();
        words.add("Hello");
        words.add("Complete");
        words.add("Poop");
        words.add("Bartender");
        words.add("Monkeys");
        words.add("Hey");

        //act
        int actual = Practice.longerShorter(words, 5, 7);

        //assert
        assertEquals(6, actual);
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

    @Test
    void testEvenOddDiffAllEven(){
        //arrange
        HashMap<Integer, Integer> values = new HashMap<>();
        values.put(1, 4);
        values.put(2, 10);
        values.put(3, 8);
        values.put(4, 6);
        values.put(5, 2);

        //act
        int actual = Practice.evenOddDiff(values);

        //assert
        assertEquals(-5, actual);
    }

    @Test
    void testEvenOddDiffAllOdd(){
        //arrange
        HashMap<Integer, Integer> values = new HashMap<>();
        values.put(1, 7);
        values.put(2, 1);
        values.put(3, 9);
        values.put(4, 5);
        values.put(5, 3);

        //act
        int actual = Practice.evenOddDiff(values);

        //assert
        assertEquals(5, actual);
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

    @Test
    void testSecondLargestTwoSameLargest(){
        //arrange
        HashMap<Integer, Integer> values = new HashMap<>();
        values.put(12, 5);
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


