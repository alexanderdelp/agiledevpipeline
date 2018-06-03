package info.gotest.course.agiledev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzBTest
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

    void assertElementEquals( Object expectedValue, int indexOfElement )
    {
        assertEquals( expectedValue, FizzBuzzB.GetNumbers()[indexOfElement - 1],
                      "Unexpected element #" + indexOfElement + "." );
    }

    @Test
    void result_shouldHave100Elements()
    {
        assertEquals( 100, FizzBuzzB.GetNumbers().length, "Unexpected length of result." );
    }

    @Test
    void firstElement_shouldEqual1()
    {
        assertElementEquals( 1, 1 );
    }

    @Test
    void secondElement_shouldEqual2()
    {
        assertElementEquals( 2, 2 );
    }

    @Test
    void thirdElement_shouldEqualFizz()
    {
        assertElementEquals( "Fizz", 3 );
    }

    @Test
    void fourthElement_shouldEqual4()
    {
        assertElementEquals( 4, 4 );
    }

    @Test
    void fifthElement_shouldEqualBuzz()
    {
        assertElementEquals( "Buzz", 5 );
    }

    @Test
    void sixthElement_shouldEqualFizz()
    {
        assertElementEquals( "Fizz", 6 );
    }

    @Test
    void tenthElement_shouldEqualBuzz()
    {
        assertElementEquals( "Buzz", 10 );
    }

    @Test
    void fifteenthElement_shouldEqualFizzBuzz()
    {
        assertElementEquals( "FizzBuzz", 15 );
    }

    @Test
    void sixteenthElement_shouldEqual16()
    {
        assertElementEquals( 16, 16 );
    }

    @Test
    void thirtiethElement_shouldEqualFizzBuzz()
    {
        assertElementEquals( "FizzBuzz", 30 );
    }
}
