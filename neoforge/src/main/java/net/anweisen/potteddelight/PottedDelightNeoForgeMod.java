package net.anweisen.potteddelight;


import net.anweisen.notenoughpots.platform.NeoForgePlatformBridge;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(PottedDelightCommons.MOD_ID)
public class PottedDelightNeoForgeMod {

  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, PottedDelightCommons.MOD_ID);

  public PottedDelightNeoForgeMod(IEventBus eventBus) {
    var bridge = new NeoForgePlatformBridge<>(eventBus, BLOCKS, PottedDelightBlockType.class);
    PottedDelightNeoForgeHelper.init(bridge);
  }
}
