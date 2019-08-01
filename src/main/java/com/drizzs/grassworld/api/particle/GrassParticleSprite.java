package com.drizzs.grassworld.api.particle;

import net.minecraft.client.particle.IAnimatedSprite;
import net.minecraft.client.particle.TexturedParticle;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


@OnlyIn(Dist.CLIENT)
public abstract class GrassParticleSprite extends TexturedParticle {
    protected TextureAtlasSprite sprite;

    protected GrassParticleSprite(World world, double x, double y, double z) {
        super(world, x, y, z);
    }

    protected GrassParticleSprite(World world, double x, double y, double z, double motionX, double motionY, double motionZ) {
        super(world, x, y, z, motionX, motionY, motionZ);
    }

    protected void setSprite(TextureAtlasSprite sprite) {
        this.sprite = sprite;
    }

    protected float getMinU() {
        return this.sprite.getMinU();
    }

    protected float getMaxU() {
        return this.sprite.getMaxU();
    }

    protected float getMinV() {
        return this.sprite.getMinV();
    }

    protected float getMaxV() {
        return this.sprite.getMaxV();
    }

    public void selectSpriteRandomly(IAnimatedSprite sprite) {
        this.setSprite(sprite.get(this.rand));
    }

    public void selectSpriteWithAge(IAnimatedSprite sprite) {
        this.setSprite(sprite.get(this.age, this.maxAge));
    }
}


