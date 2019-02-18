package school.oose.dea;

import school.oose.dea.Factories.FizzBuzzFactory;

public class FizzBuzz extends FizzBuzzFactory
{
    public FizzBuzz(FizzBuzzType type)
    {
        getFizzBuzz(type);
    }

    public String getFizzBuzz(FizzBuzzType type)
    {
        switch (type)
        {
            case FIZZ:
                return "Fizz";
            case BUZZ:
                return "Buzz";
            case FIZZBUZZ:
                return "FizzBuzz";
            default:
                return null;
        }
    }
}
