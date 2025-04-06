package net.anweisen.potteddelight;

import net.anweisen.notenoughpots.IPottedBlockType;
import net.minecraft.world.level.block.Block;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import java.util.function.Supplier;

/**
 * @author anweisen | https://github.com/anweisen
 * @since 1.0
 */
public enum PottedDelightBlockType implements IPottedBlockType {

  POTTED_WILD_ONIONS(ModBlocks.WILD_ONIONS),
  POTTED_WILD_CABBAGES(ModBlocks.WILD_CABBAGES),
  POTTED_WILD_TOMATOES(ModBlocks.WILD_TOMATOES),
  POTTED_WILD_CARROTS(ModBlocks.WILD_CARROTS),
  POTTED_WILD_POTATOES(ModBlocks.WILD_POTATOES),
  POTTED_WILD_BEETROOTS(ModBlocks.WILD_BEETROOTS),
  POTTED_WILD_RICE(ModBlocks.WILD_RICE),
  POTTED_ONIONS(ModBlocks.ONION_CROP),
  POTTED_CABBAGES(ModBlocks.CABBAGE_CROP),
  POTTED_RICE_PANICLES(ModBlocks.RICE_CROP),
  POTTED_TOMATOES(ModBlocks.BUDDING_TOMATO_CROP),
  POTTED_RED_MUSHROOM_COLONY(ModBlocks.RED_MUSHROOM_COLONY),
  POTTED_BROWN_MUSHROOM_COLONY(ModBlocks.BROWN_MUSHROOM_COLONY),
  POTTED_SANDY_SHRUB(ModBlocks.SANDY_SHRUB),
  ;

  private final Supplier<Block> flower;
  private final String name;

  PottedDelightBlockType(Supplier<Block> flower) {
    this.flower = flower;
    this.name = this.name().toLowerCase();
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public Block getFlowerBlock() {
    return flower.get();
  }

  public Block findBlock() {
    return PottedDelightFabricHelper.getBridge().getPottedBlock(this);
  }

}
