package com.drizzs.grassworld.items.enchantedseed;

import com.drizzs.grassworld.blocks.GrassWorldBlocks;
import com.drizzs.grassworld.items.GrassWorldItems;
import com.drizzs.grassworld.util.ItemGroupGW;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

public class EnchantedBlackSeed extends Item {

    public EnchantedBlackSeed(Properties group)
    {
        super(new Properties().group(ItemGroupGW.instance).maxStackSize(16));

    }

    @Nonnull
    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getWorld();
        BlockPos blockpos = context.getPos();
        ItemStack item = context.getItem();
        Hand hand = context.getHand();

        if (!(item.getItem() == GrassWorldItems.enchanted_blackseed)){

            return ActionResultType.PASS;
        }

        if (world.getBlockState(blockpos).getBlock() == Blocks.GRASS_BLOCK || world.getBlockState(blockpos).getBlock() == Blocks.DIRT)
        {

            world.setBlockState(blockpos, GrassWorldBlocks.enchanted_black_grass.getDefaultState());

        }
        return ActionResultType.SUCCESS;

    }

}
