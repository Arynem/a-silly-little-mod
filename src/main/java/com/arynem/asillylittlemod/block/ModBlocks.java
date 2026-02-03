package com.arynem.asillylittlemod.block;

import com.arynem.asillylittlemod.ASillyLittleMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

        public static final Block Test = registerBlock("test",
                new Block(AbstractBlock.Settings.create().strength(1).sounds(BlockSoundGroup.ANVIL).luminance(state -> 15)));







    private static Block registerBlock(String name, Block block) {
        regisiterBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ASillyLittleMod.MOD_ID, name), block);
    }

    private static void regisiterBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(ASillyLittleMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));

    }

    public static void registerModBlocks() {


        ASillyLittleMod.LOGGER.info("Registering Mod Blocks For " + ASillyLittleMod.MOD_ID);
    }



}
