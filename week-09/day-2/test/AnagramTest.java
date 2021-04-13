import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagramFunctionShouldReturnTrueIfWordIsAnagram_ExpectedTrue() {
        String word1 = "Keep";
        String word2 = "Peek";
        assertEquals(true, Anagram.isAnagram(word1, word2));
    }

    @Test
    public void isAnagramFunctionShouldReturnFalseIfWordIsNotAnagram () {
        String word1 = "Keip";
        String word2 = "Peek";
        assertEquals(false, Anagram.isAnagram(word1, word2));
    }

    @Test
    public void isAnagramFunctionShouldWorkWithLowerCaseAndUpperCase() {
        String word1 = "keep";
        String word2 = "Peek";
        assertEquals(true, Anagram.isAnagram(word1, word2));
    }

    @Test
    public void isAnagramFunctionShouldNotWorkWithWordsDifferentLenth() {
        String word1 = "Kee";
        String word2 = "Peek";
        assertEquals(false, Anagram.isAnagram(word1, word2));
    }
}