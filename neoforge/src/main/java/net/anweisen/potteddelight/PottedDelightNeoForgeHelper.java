package net.anweisen.potteddelight;

import net.anweisen.notenoughpots.platform.NeoForgePlatformBridge;
import net.anweisen.notenoughpots.platform.api.IPlatformBridge;

/**
 * @author anweisen | https://github.com/anweisen
 * @since 1.0
 */
public class PottedDelightNeoForgeHelper {

  private static NeoForgePlatformBridge<PottedDelightBlockType> bridge;

  public static void init(NeoForgePlatformBridge<PottedDelightBlockType> bridge) {
    PottedDelightNeoForgeHelper.bridge = bridge;

    for (PottedDelightBlockType type : PottedDelightBlockType.values()) {
      bridge.registerPottedBlock(type);
    }

    bridge.finishRegistration();
  }

  public static IPlatformBridge<PottedDelightBlockType> getBridge() {
    return bridge;
  }
}
