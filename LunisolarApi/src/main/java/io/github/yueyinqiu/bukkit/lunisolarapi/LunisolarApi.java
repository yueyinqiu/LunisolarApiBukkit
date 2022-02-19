package io.github.yueyinqiu.bukkit.lunisolarapi;

import org.bukkit.World;

/**
 * LunisolarApi
 */
public final class LunisolarApi
{
    private static LunisolarApi instance = new LunisolarApi();
    
    /**
     * 获取实例。
     * @return LunisolarApi 类的实例。
     */
    public static LunisolarApi getInstance()
    {
        return instance;
    }
    
    private static final long TIME_OFFSET = 24000L - 17000L;
    
    /**
     * 获取 Lunisolar 时。
     * @param worldTime 世界时间。
     * @return Lunisolar 时。
     * @exception IllegalArgumentException worldTime 小于 0 。
     */
    public LunisolarTime getLunisolarTime(long worldTime)
    {
        ArgumentChecker.CheckNonNegative("worldTime", worldTime);
        return new LunisolarTime(worldTime + TIME_OFFSET);
    }
    
    /**
     * 获取 Lunisolar 时。
     * @param world 要获取时间的世界。
     * @return Lunisolar 时。
     * @exception IllegalArgumentException world 为 null 。
     */
    public LunisolarTime getLunisolarTime(World world)
    {
        ArgumentChecker.CheckNotNull("world", world);
        long worldTime = world.getFullTime();
        return getLunisolarTime(worldTime);
    }
    
    /**
     * 获取 Lunisolar 时对应的世界时间。
     * @param time
     * @return
     */
    public long getWorldTime(LunisolarTime time)
    {
        if(time == null)
            return 0;
        return time.getTick() - TIME_OFFSET;
    }
}
