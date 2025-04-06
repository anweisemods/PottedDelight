package net.anweisen.potteddelight;

import net.anweisen.notenoughpots.platform.FabricPlatformBridge;
import net.anweisen.notenoughpots.platform.IPlatformBridge;

/**
 * @author anweisen | https://github.com/anweisen
 * @since 1.0
 */
public class PottedDelightFabricHelper {

  private static FabricPlatformBridge<PottedDelightBlockType> bridge;

  public static void init(FabricPlatformBridge<PottedDelightBlockType> bridge) {
    PottedDelightFabricHelper.bridge = bridge;

    for (PottedDelightBlockType type : PottedDelightBlockType.values()) {
      bridge.registerPottedBlock(type);
    }

    bridge.finishRegistration();
  }

  public static IPlatformBridge<PottedDelightBlockType> getBridge() {
    return bridge;
  }

}
