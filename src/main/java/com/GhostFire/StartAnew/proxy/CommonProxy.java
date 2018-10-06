package com.GhostFire.StartAnew.proxy;



import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
       
       
        
    }
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        
       
    }
    public void init(FMLInitializationEvent e) {
        
    }
	public void registerItemRenderer(Item item, int meta, String id) {}
}