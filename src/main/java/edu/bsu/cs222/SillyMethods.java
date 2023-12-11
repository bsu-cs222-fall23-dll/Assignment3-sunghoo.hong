package edu.bsu.cs222;

public class SillyMethods
{

    public boolean didGuess42(int number)
    {
        return (number == 42);
    }

    public String countTo(int number)
    {
        StringBuilder returnString = new StringBuilder();
        for (int index = 0; index <= number; index++)
        {
            returnString.append(index + " ");
        }
        return returnString.toString().trim();
    }
}