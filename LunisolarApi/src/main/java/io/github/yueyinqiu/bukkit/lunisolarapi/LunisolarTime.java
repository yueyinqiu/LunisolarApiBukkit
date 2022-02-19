package io.github.yueyinqiu.bukkit.lunisolarapi;

public final class LunisolarTime
{
    private long tick;
    
    long getTick()
    {
        return tick;
    }
    
    LunisolarTime(long tick)
    {
        this.tick = tick;
    }
    
    private static final long HUI_OF_YUAN = 7L;
    private static final long YUN_OF_HUI = 7L;
    private static final long SHI_OF_YUN = 7L;
    private static final long NIAN_OF_SHI = 7L;
    private static final long QI_OF_NIAN = 7L;
    private static final long RI_OF_QI = 7L;
    private static final long SHI_OF_RI = 7L;
    private static final long TICK_OF_SHI = 7L;
    
    private static final long FACTIR_YUAN = RI_OF_QI * QI_OF_NIAN * ;
    
    public long getYuanIndex()
    {
    
    }
    
    public long getHuiIndex()
    {
    }
    
    public long getYunIndex()
    {
    }
    
    public long getShiIndex()
    {
    }
    
    public long getNianIndex()
    {
    }
    public long getQiIndex()
    {
    }
    public long getRiIndex()
    {
    }
}
