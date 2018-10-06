package com.GhostFire.StartAnew.items;

import com.GhostFire.StartAnew.blocks.BlockBase;
import com.GhostFire.StartAnew.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {
	public static ItemBase ruby =  (ItemBase) new ItemBase("ruby").setCreativeTab(CreativeTabs.MATERIALS);
	

	public static void register(IForgeRegistry<Item> registery) {
		registery.registerAll(ruby);
		
	}
	public static void registerModels() {
		ruby.registerModels();
	}
	
	
}
