package net.anweisen.potteddelight;

import net.anweisen.notenoughpots.platform.FabricPlatformBridge;
import net.fabricmc.api.ModInitializer;

public class PottedDelightFabricMod implements ModInitializer {

  @Override
  public void onInitialize() {
    var bridge = new FabricPlatformBridge<>(PottedDelightCommons.MOD_ID, PottedDelightBlockType.class);
    PottedDelightFabricHelper.init(bridge);
  }
}
