package com.haydenalt.learn;

import com.haydenalt.learn.block.ModBlocks;
import com.haydenalt.learn.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Learn implements ModInitializer {
	public static final String MOD_ID = "learn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}