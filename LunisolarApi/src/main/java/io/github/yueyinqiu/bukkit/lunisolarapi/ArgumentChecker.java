package io.github.yueyinqiu.bukkit.lunisolarapi;

final class ArgumentChecker
{
    static <E> void CheckNotNull(String argumentName, E value)
    {
        if(value == null)
            throw new IllegalArgumentException(argumentName + " could not be null.");
    }
    
    static void CheckNonNegative(String argumentName, long value)
    {
        if(value < 0L)
            throw new IllegalArgumentException(argumentName + " could not be negative.");
    }
    
    static void CheckNonNegative(String argumentName, int value)
    {
        if(value < 0)
            throw new IllegalArgumentException(argumentName + " could not be negative.");
    }
}