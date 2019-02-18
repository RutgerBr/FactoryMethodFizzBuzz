package school.oose.dea.Factories;

import school.oose.dea.FizzBuzz;
import school.oose.dea.FizzBuzzType;

public class FizzBuzzFactory
{
    public static FizzBuzz create(FizzBuzzType type)
    {
        switch (type)
        {
            case FIZZ:
                return new FizzBuzz(type);
            case BUZZ:
                return new FizzBuzz(type);
            case FIZZBUZZ:
                return new FizzBuzz(type);
            default:
                return null;
        }
    }
}
