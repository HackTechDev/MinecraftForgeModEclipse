package ckathode.weaponmod.entity;

import ckathode.weaponmod.entity.scorpioid.EntityScorpioid;
import ckathode.weaponmod.entity.scorpioid.RenderScorpioid;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class Renderers {
	
	public static void init(){
	
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpioid.class, new RenderScorpioid());
		
	}
}