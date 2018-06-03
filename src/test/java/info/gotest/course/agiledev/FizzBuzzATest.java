package info.gotest.course.agiledev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzATest
{
    // Signature: public static Object[] GetNumbers()
    //
    // Test Cases:
    // -----------
    // Result: 100 Elements
    // 1: "1"
    // 2: "2"
    // 3: "Fizz"
    // 4: "4"
    // 5: "Buzz"
    // 6: "Fizz"
    // 10: "Buzz"
    // 15: "FizzBuzz"
    // 16: "16"
    // 30: "FizzBuzz"

    @Test
    void result_shouldHave100Elements()
    {
        assertEquals( 100, FizzBuzzA.GetNumbers().length );
    }

    @Test
    void firstElement_shouldEqual1()
    {
        assertEquals( 1, FizzBuzzA.GetNumbers()[0] );
    }

    @Test
    void secondElement_shouldEqual2()
    {
        assertEquals( 2, FizzBuzzA.GetNumbers()[1] );
    }

    @Test
    void thirdElement_shouldEqualFizz()
    {
        assertEquals( "Fizz", FizzBuzzA.GetNumbers()[2] );
    }

    @Test
    void fourthElement_shouldEqual4()
    {
        assertEquals( 4, FizzBuzzA.GetNumbers()[3] );
    }

    @Test
    void fifthElement_shouldEqualBuzz()
    {
        assertEquals( "Buzz", FizzBuzzA.GetNumbers()[4] );
    }

    @Test
    void sixthElement_shouldEqualFizz()
    {
        assertEquals( "Fizz", FizzBuzzA.GetNumbers()[5] );
    }

    @Test
    void tenthElement_shouldEqualBuzz()
    {
        assertEquals( "Buzz", FizzBuzzA.GetNumbers()[9] );
    }

    @Test
    void fifteenthElement_shouldEqualFizzBuzz()
    {
        assertEquals( "FizzBuzz", FizzBuzzA.GetNumbers()[14] );
    }

    @Test
    void sixteenthElement_shouldEqual16()
    {
        assertEquals( 16, FizzBuzzA.GetNumbers()[15] );
    }

    @Test
    void thirtiethElement_shouldEqualFizzBuzz()
    {
        assertEquals( "FizzBuzz", FizzBuzzA.GetNumbers()[29] );
    }
}
