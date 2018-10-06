package com.GhostFire.StartAnew.blocks;

import com.GhostFire.StartAnew.Main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block {

	protected String name;

	public BlockBase(Material material, String name) {
		super(material);
	
		this.name = name;
		Item.getItemFromBlock(this);
		setUnlocalizedName(name);
		setRegistryName("sam:" + name);
		
	}
	
	public void registerItemModel(Item itemBlock) {
		Main.proxy.registerItemRenderer(itemBlock, 0, name);
		Main.proxy.registerItemRenderer(itemBlock, 0, "inventory");
		
		
	}
	
	public Item createItemBlock() {
		
		return new ItemBlock(this).setRegistryName(getRegistryName());
		 
		
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
