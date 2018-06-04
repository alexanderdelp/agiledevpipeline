package info.gotest.course.agiledev;

public class FizzBuzzA
{
    private FizzBuzzA()
    {
    }
    
    public static Object[] GetNumbers()
    {
        Object[] numbers = new Object[100];
        for ( int i = 1; i <= 100; i++ )
        {
            if ( i % 3 == 0 )
            {
                if ( i % 5 == 0 )
                {
                    numbers[i - 1] = "FizzBuzz";
                }
                else
                {
                    numbers[i - 1] = "Fizz";
                }
            }
            else if ( i % 5 == 0 )
            {
                numbers[i - 1] = "Buzz";
            }
            else
            {
                numbers[i - 1] = i;
            }
        }
        return numbers;
    }
}
