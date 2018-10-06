package com.GhostFire.StartAnew.items;

import com.GhostFire.StartAnew.Main;
import com.GhostFire.StartAnew.proxy.ClientProxy;

import net.minecraft.item.Item;

public class ItemBase extends Item{
	protected String name;
	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName("sam:" + name);
	}
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
