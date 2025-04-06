package net.anweisen.potteddelight.client;

import net.anweisen.potteddelight.PottedDelightBlockType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

/**
 * @author anweisen | https://github.com/anweisen
 * @since 1.0
 */
public class PottedDelightFabricClient implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    for (PottedDelightBlockType block : PottedDelightBlockType.values()) {
      BlockRenderLayerMap.INSTANCE.putBlock(block.findBlock(), RenderType.cutout());
    }
  }

}
