package org.example;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /*  TODO list for my feature
     *  1. first char A  :  ABCD => BCD
     *  2. second char A :  BACD => BCD
     *  3. both chars A  :  AABC => BC
     *  4. no chars A    :  BBAA => BBAA
     *  5. single char A :  A => " "
     *  6. someother char:  B => "B"
     *  7. empty char    :  "" => ""
     */


    @Test
    public void FirstCharA()
    {
        RemovingCharacters RemovingCharacters = new RemovingCharacters();
        assertEquals("BCD",RemovingCharacters.checkString("ABCD"));
    }

    @Test
    public void SecondCharA(){
        RemovingCharacters RemovingCharacters = new RemovingCharacters();
        assertEquals("BCD",RemovingCharacters.checkString("BACD"));
    }

    @Test
    public void BothCharsA(){
        RemovingCharacters RemovingCharacters = new RemovingCharacters();
        assertEquals("BC",RemovingCharacters.checkString("AABC"));
    }

    @Test
    public void NoCharsA(){
        RemovingCharacters RemovingCharacters = new RemovingCharacters();
        assertEquals("BBAA",RemovingCharacters.checkString("BBAA"));
    }

    @Test
    public void SingleCharA(){
        RemovingCharacters RemovingCharacters = new RemovingCharacters();
        assertEquals(" ",RemovingCharacters.checkString("A"));
    }

    @Test
    public void SomeotherChar(){
        RemovingCharacters RemovingCharacters = new RemovingCharacters();
        assertEquals("B",RemovingCharacters.checkString("B"));
    }

    @Test
    public void EmptyChar(){
        RemovingCharacters RemovingCharacters = new RemovingCharacters();
        assertEquals(" ",RemovingCharacters.checkString(""));
    }
}
