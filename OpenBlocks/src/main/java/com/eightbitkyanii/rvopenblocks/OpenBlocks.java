package com.eightbitkyanii.rvopenblocks;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("rvopenblocks")
public class OpenBlocks {
	
	public OpenBlocks() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
