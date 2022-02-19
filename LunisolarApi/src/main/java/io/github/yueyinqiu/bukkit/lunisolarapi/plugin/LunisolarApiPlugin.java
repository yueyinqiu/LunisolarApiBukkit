package io.github.yueyinqiu.bukkit.lunisolarapi.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class LunisolarApiPlugin extends JavaPlugin
{
    private VersionManager versionManager;
    
    public VersionManager getVersionManager()
    {
        return versionManager;
    }
    
    @Override
    public void onEnable()
    {
        saveDefaultConfig();
        versionManager = new VersionManager(this);
    }
}
