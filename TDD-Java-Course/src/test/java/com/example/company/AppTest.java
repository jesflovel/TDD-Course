package com.example.company;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AppTest 
{
    @Test
    public void shouldReturnOneInPositionZero(){
        int size = 16;
        List<String> fizzBuzzResult = App.fizzBuzz(size);

        assertEquals("1", fizzBuzzResult.get(0));
    }

    @Test
    public void shouldReturnSizeMOreThanZero(){
        int size = 16;
        List<String> fizzBuzzResult =App.fizzBuzz(size);

        assertTrue(fizzBuzzResult.size() > 0);
    }

    @Test
    public void shouldReturnFizzInPositionEigth(){
        int size = 16;
        List<String> fizzBuzzResult =App.fizzBuzz(size);

        assertEquals("Fizz", fizzBuzzResult.get(8));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenSizeLowerThanZero(){
        int size = -1;
       App.fizzBuzz(size);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldReturnExceptionWhenSizeGreaterThanTwenty(){
        int size = 21;
       App.fizzBuzz(size);


    }


    @Test
    public void shouldReturnFizzInPositionFourteen(){
        int size = 16;
        List<String> fizzBuzzResult =App.fizzBuzz(size);

        assertEquals("FizzBuzz", fizzBuzzResult.get(14));
    }

    @Test
    public void shouldReturnFizzInPositionFour(){
        int size = 16;
        List<String> fizzBuzzResult =App.fizzBuzz(size);
        assertEquals("Buzz", fizzBuzzResult.get(4));
    }

    @Test
    public void shouldReturnArrayZeroWhenSizeZero(){
        int size = 0;
        List<String> fizzBuzzResult =App.fizzBuzz(size);

        assertTrue(fizzBuzzResult.size() == 0);
    }


    /*
    @Test
    public void shouldAnswerWithTrue()
    {
        //llamarMetodos()
        //int numero1 = 10;
        //int numero1 = 5;
        //int result = Division(numero1,numero2);
        int result = 0;
        assertEquals(2,result);
        assertTrue( true );
    }

    @Test
    public void ShouldReturnTrue() {

        Assert.assertTrue(true);
    }

     */
}
