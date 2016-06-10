package com.github.revival.server.entity.mob;

import com.github.revival.server.entity.mob.test.EntityFishBase;
import com.github.revival.server.enums.EnumPrehistoric;
import net.minecraft.world.World;

public class EntitySturgeon extends EntityFishBase {
    public EntitySturgeon(World par1World) {
        super(par1World, EnumPrehistoric.Sturgeon);
        this.setSize(1.9F, 1F);
    }

    @Override
    public String getTexture() {
        return "fossil:textures/model/fish/sturgeon.png";
    }

    @Override
    protected double getSwimSpeed() {
        return 0.35D;
    }
}
