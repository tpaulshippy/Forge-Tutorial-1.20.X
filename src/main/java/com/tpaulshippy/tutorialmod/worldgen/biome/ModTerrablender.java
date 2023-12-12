package com.tpaulshippy.tutorialmod.worldgen.biome;

import com.tpaulshippy.tutorialmod.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(TutorialMod.MOD_ID, "overworld"), 5));
    }
}
