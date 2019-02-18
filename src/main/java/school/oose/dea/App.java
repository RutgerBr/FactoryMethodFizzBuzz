package school.oose.dea;

import school.oose.dea.Factories.FizzBuzzFactory;

import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App{

    public static final int FIZZ = 3;
    public static final int BUZZ = 5;
    public static final int FIZZBUZZ = 15;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        var main = new App();
        main.streamingFizzBuzz();
    }

    public void streamingFizzBuzz()
    {
        IntStream.range(1, 1001).forEach(number -> doFizzBuzz(number));
    }

    private void doFizzBuzz(int number)
    {
        if (number % FIZZBUZZ == 0)
        {
            System.out.println(FizzBuzzFactory.create(FizzBuzzType.FIZZBUZZ));
        }
        else if (number % FIZZ == 0)
        {
            System.out.println(FizzBuzzFactory.create(FizzBuzzType.FIZZ));
        }
        else if (number % BUZZ == 0)
        {
            System.out.println(FizzBuzzFactory.create(FizzBuzzType.BUZZ));
        }
    }
}
