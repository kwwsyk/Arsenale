package com.kwwsyk.suit.arsenale.data;

import net.minecraft.world.level.Level;

public abstract class LevelLoadParam {

    protected Level level;
    protected Param param;

    protected LevelLoadParam(Level level, Param param){
        this.level = level;
        this.param = param;
    }

    public abstract void load(Level level, Param param);
}
