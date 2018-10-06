package com.GhostFire.StartAnew;

import com.GhostFire.StartAnew.blocks.BlockBase;
import com.GhostFire.StartAnew.blocks.ModBlocks;
import com.GhostFire.StartAnew.items.ModItems;
import com.GhostFire.StartAnew.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = Main.modId, name = Main.name, version = Main.version)
public class Main {
	public static final String modId = "sam";
	public static final String name = "Start Anew";
	public static final String version = "1.0.0";
	@Mod.Instance(modId)
	public static Main instance;
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
	
	}
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	@SidedProxy(serverSide = "com.GhostFire.StartAnew.proxy.CommonProxy", clientSide = "com.GhostFire.StartAnew.proxy.ClientProxy")
	public static CommonProxy proxy;
	@Mod.EventBusSubscriber
	public static class RegistrationHandler{
	
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModItems.register(event.getRegistry());
			ModBlocks.registerItemBlocks(event.getRegistry());
		}
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
			ModBlocks.registerModels();
			
			
		}
	}
}
