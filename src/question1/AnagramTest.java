package question1;

import org.junit.Assert;
import org.junit.Test;
import question1.Anagram;


import static org.junit.Assert.*;

public class AnagramTest {

    private Anagram anagram= new Anagram();

    @Test
    public void isAnagramTrue() {
        Assert.assertTrue(anagram.isAnagram("table", "bleat"));

    }
    @Test
    public void isAnagramFalse() {
        Assert.assertFalse(anagram.isAnagram("eat", "tar"));
    }
}