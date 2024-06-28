package net.joshua.tutorialmod.worldgen.biome;


import net.joshua.tutorialmod.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        Regions.register(new ModOverworldRegion(new ResourceLocation(TutorialMod.MOD_ID, "overworld"), 5));
    }
}