package com.loohp.interactivechatdiscordsrvaddon.utils;

import com.loohp.interactivechat.InteractiveChat;
import com.loohp.interactivechat.libs.com.cryptomorin.xseries.XMaterial;

import java.util.EnumMap;
import java.util.Map;

public class ModelUtils {

    private static final Map<XMaterial, String> LEGACY_MODEL_NAME = new EnumMap<>(XMaterial.class);

    static {
        LEGACY_MODEL_NAME.put(XMaterial.ANVIL, "anvil_intact");
        LEGACY_MODEL_NAME.put(XMaterial.AZURE_BLUET, "houstonia");
        LEGACY_MODEL_NAME.put(XMaterial.BAT_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.BLACK_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.BLACK_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.BLACK_DYE, "dye_black");
        LEGACY_MODEL_NAME.put(XMaterial.BLACK_TERRACOTTA, "black_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.BLAZE_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.BLUE_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.BLUE_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.BLUE_TERRACOTTA, "blue_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.BONE_MEAL, "dye_white");
        LEGACY_MODEL_NAME.put(XMaterial.BRICKS, "brick_block");
        LEGACY_MODEL_NAME.put(XMaterial.BROWN_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.BROWN_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.BROWN_TERRACOTTA, "brown_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.GREEN_DYE, "dye_green");
        LEGACY_MODEL_NAME.put(XMaterial.CARROTS, "carrot");
        LEGACY_MODEL_NAME.put(XMaterial.CARVED_PUMPKIN, "pumpkin");
        LEGACY_MODEL_NAME.put(XMaterial.CAVE_SPIDER_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.CHICKEN_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.CHIPPED_ANVIL, "anvil_slightly_damaged");
        LEGACY_MODEL_NAME.put(XMaterial.CHISELED_STONE_BRICKS, "chiseled_stonebrick");
        LEGACY_MODEL_NAME.put(XMaterial.COBBLESTONE_STAIRS, "stone_stairs");
        LEGACY_MODEL_NAME.put(XMaterial.COBWEB, "web");
        LEGACY_MODEL_NAME.put(XMaterial.COCOA, "dye_brown");
        LEGACY_MODEL_NAME.put(XMaterial.COCOA_BEANS, "dye_brown");
        LEGACY_MODEL_NAME.put(XMaterial.COD_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.COW_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.CRACKED_STONE_BRICKS, "cracked_stonebrick");
        LEGACY_MODEL_NAME.put(XMaterial.CREEPER_HEAD, "skull_creeper");
        LEGACY_MODEL_NAME.put(XMaterial.CREEPER_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.CUT_RED_SANDSTONE, "smooth_red_sandstone");
        LEGACY_MODEL_NAME.put(XMaterial.CUT_SANDSTONE, "smooth_sandstone");
        LEGACY_MODEL_NAME.put(XMaterial.CYAN_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.CYAN_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.CYAN_DYE, "dye_cyan");
        LEGACY_MODEL_NAME.put(XMaterial.CYAN_TERRACOTTA, "cyan_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.DAMAGED_ANVIL, "anvil_very_damaged");
        LEGACY_MODEL_NAME.put(XMaterial.YELLOW_DYE, "dye_yellow");
        LEGACY_MODEL_NAME.put(XMaterial.DOLPHIN_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.DONKEY_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.DRAGON_HEAD, "skull_dragon");
        LEGACY_MODEL_NAME.put(XMaterial.DROWNED_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.ELDER_GUARDIAN_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.ENCHANTED_GOLDEN_APPLE, "golden_apple");
        LEGACY_MODEL_NAME.put(XMaterial.ENDERMAN_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.ENDERMITE_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.END_STONE_BRICKS, "end_bricks");
        LEGACY_MODEL_NAME.put(XMaterial.EVOKER_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.FIREWORK_ROCKET, "fireworks");
        LEGACY_MODEL_NAME.put(XMaterial.FIREWORK_STAR, "firework_charge");
        LEGACY_MODEL_NAME.put(XMaterial.GHAST_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.GLISTERING_MELON_SLICE, "speckled_melon");
        LEGACY_MODEL_NAME.put(XMaterial.GRASS_BLOCK, "grass");
        LEGACY_MODEL_NAME.put(XMaterial.DIRT_PATH, "grass_path");
        LEGACY_MODEL_NAME.put(XMaterial.GRAY_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.GRAY_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.GRAY_DYE, "dye_gray");
        LEGACY_MODEL_NAME.put(XMaterial.GRAY_TERRACOTTA, "gray_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.GREEN_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.GREEN_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.GREEN_TERRACOTTA, "green_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.GUARDIAN_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.HORSE_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.HUSK_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.INFESTED_CHISELED_STONE_BRICKS, "chiseled_brick_monster_egg");
        LEGACY_MODEL_NAME.put(XMaterial.INFESTED_COBBLESTONE, "cobblestone_monster_egg");
        LEGACY_MODEL_NAME.put(XMaterial.INFESTED_CRACKED_STONE_BRICKS, "cracked_brick_monster_egg");
        LEGACY_MODEL_NAME.put(XMaterial.INFESTED_MOSSY_STONE_BRICKS, "mossy_brick_monster_egg");
        LEGACY_MODEL_NAME.put(XMaterial.INFESTED_STONE, "stone_monster_egg");
        LEGACY_MODEL_NAME.put(XMaterial.INFESTED_STONE_BRICKS, "stone_brick_monster_egg");
        LEGACY_MODEL_NAME.put(XMaterial.INK_SAC, "dye_black");
        LEGACY_MODEL_NAME.put(XMaterial.JACK_O_LANTERN, "lit_pumpkin");
        LEGACY_MODEL_NAME.put(XMaterial.LAPIS_LAZULI, "dye_blue");
        LEGACY_MODEL_NAME.put(XMaterial.LARGE_FERN, "double_fern");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_BLUE_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_BLUE_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_BLUE_DYE, "dye_light_blue");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_BLUE_TERRACOTTA, "light_blue_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_CARPET, "silver_carpet");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_CONCRETE, "silver_concrete");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_CONCRETE_POWDER, "silver_concrete_powder");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_DYE, "dye_silver");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_GLAZED_TERRACOTTA, "silver_glazed_terracotta");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_SHULKER_BOX, "silver_shulker_box");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_STAINED_GLASS, "silver_stained_glass");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_STAINED_GLASS_PANE, "silver_stained_glass_pane");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_TERRACOTTA, "silver_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.LIGHT_GRAY_WOOL, "silver_wool");
        LEGACY_MODEL_NAME.put(XMaterial.LILAC, "syringa");
        LEGACY_MODEL_NAME.put(XMaterial.LILY_PAD, "waterlily");
        LEGACY_MODEL_NAME.put(XMaterial.LIME_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.LIME_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.LIME_DYE, "dye_lime");
        LEGACY_MODEL_NAME.put(XMaterial.LIME_TERRACOTTA, "lime_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.LINGERING_POTION, "bottle_lingering");
        LEGACY_MODEL_NAME.put(XMaterial.LLAMA_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.MAGENTA_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.MAGENTA_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.MAGENTA_DYE, "dye_magenta");
        LEGACY_MODEL_NAME.put(XMaterial.MAGENTA_TERRACOTTA, "magenta_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.MAGMA_BLOCK, "magma");
        LEGACY_MODEL_NAME.put(XMaterial.MAGMA_CUBE_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.MELON_SLICE, "melon");
        LEGACY_MODEL_NAME.put(XMaterial.MOOSHROOM_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.MOSSY_STONE_BRICKS, "mossy_stonebrick");
        LEGACY_MODEL_NAME.put(XMaterial.MULE_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.MUSHROOM_STEM, "brown_mushroom_block");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_11, "record_11");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_13, "record_13");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_BLOCKS, "record_blocks");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_CAT, "record_cat");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_CHIRP, "record_chirp");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_FAR, "record_far");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_MALL, "record_mall");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_MELLOHI, "record_mellohi");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_STAL, "record_stal");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_STRAD, "record_strad");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_WAIT, "record_wait");
        LEGACY_MODEL_NAME.put(XMaterial.MUSIC_DISC_WARD, "record_ward");
        LEGACY_MODEL_NAME.put(XMaterial.NETHER_BRICKS, "nether_brick");
        LEGACY_MODEL_NAME.put(XMaterial.NETHER_QUARTZ_ORE, "quartz_ore");
        LEGACY_MODEL_NAME.put(XMaterial.NOTE_BLOCK, "noteblock");
        LEGACY_MODEL_NAME.put(XMaterial.OAK_BUTTON, "wooden_button");
        LEGACY_MODEL_NAME.put(XMaterial.OAK_PRESSURE_PLATE, "wooden_pressure_plate");
        LEGACY_MODEL_NAME.put(XMaterial.OAK_TRAPDOOR, "trapdoor");
        LEGACY_MODEL_NAME.put(XMaterial.OCELOT_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.ORANGE_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.ORANGE_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.ORANGE_DYE, "dye_orange");
        LEGACY_MODEL_NAME.put(XMaterial.ORANGE_TERRACOTTA, "orange_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.PARROT_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.PEONY, "paeonia");
        LEGACY_MODEL_NAME.put(XMaterial.PETRIFIED_OAK_SLAB, "oak_slab");
        LEGACY_MODEL_NAME.put(XMaterial.PHANTOM_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.PIG_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.PINK_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.PINK_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.PINK_DYE, "dye_pink");
        LEGACY_MODEL_NAME.put(XMaterial.PINK_TERRACOTTA, "pink_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.PLAYER_HEAD, "skull_char");
        LEGACY_MODEL_NAME.put(XMaterial.POLAR_BEAR_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.POLISHED_ANDESITE, "andesite_smooth");
        LEGACY_MODEL_NAME.put(XMaterial.POLISHED_DIORITE, "diorite_smooth");
        LEGACY_MODEL_NAME.put(XMaterial.POLISHED_GRANITE, "granite_smooth");
        LEGACY_MODEL_NAME.put(XMaterial.POPPED_CHORUS_FRUIT, "chorus_fruit_popped");
        LEGACY_MODEL_NAME.put(XMaterial.POTATOES, "potato");
        LEGACY_MODEL_NAME.put(XMaterial.POTION, "bottle_drinkable");
        LEGACY_MODEL_NAME.put(XMaterial.POWERED_RAIL, "golden_rail");
        LEGACY_MODEL_NAME.put(XMaterial.PUFFERFISH_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.PURPLE_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.PURPLE_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.PURPLE_DYE, "dye_purple");
        LEGACY_MODEL_NAME.put(XMaterial.PURPLE_TERRACOTTA, "purple_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.QUARTZ_PILLAR, "quartz_column");
        LEGACY_MODEL_NAME.put(XMaterial.RABBIT_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.RED_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.RED_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.RED_NETHER_BRICKS, "red_nether_brick");
        LEGACY_MODEL_NAME.put(XMaterial.RED_TERRACOTTA, "red_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.ROSE_BUSH, "double_rose");
        LEGACY_MODEL_NAME.put(XMaterial.RED_DYE, "dye_red");
        LEGACY_MODEL_NAME.put(XMaterial.SALMON_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.SHEEP_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.SHULKER_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.OAK_SIGN, "sign");
        LEGACY_MODEL_NAME.put(XMaterial.SILVERFISH_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.SKELETON_HORSE_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.SKELETON_SKULL, "skull_skeleton");
        LEGACY_MODEL_NAME.put(XMaterial.SKELETON_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.SLIME_BLOCK, "slime");
        LEGACY_MODEL_NAME.put(XMaterial.SLIME_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.SMOOTH_STONE, "stone_slab");
        LEGACY_MODEL_NAME.put(XMaterial.SNOW_BLOCK, "snow");
        LEGACY_MODEL_NAME.put(XMaterial.SPAWNER, "mob_spawner");
        LEGACY_MODEL_NAME.put(XMaterial.SPIDER_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.SPLASH_POTION, "bottle_splash");
        LEGACY_MODEL_NAME.put(XMaterial.SQUID_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.STONE_BRICKS, "stonebrick");
        LEGACY_MODEL_NAME.put(XMaterial.STRAY_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.SUGAR_CANE, "reeds");
        LEGACY_MODEL_NAME.put(XMaterial.TERRACOTTA, "hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.TOTEM_OF_UNDYING, "totem");
        LEGACY_MODEL_NAME.put(XMaterial.TROPICAL_FISH_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.TURTLE_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.VEX_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.VILLAGER_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.VINDICATOR_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.WET_SPONGE, "sponge_wet");
        LEGACY_MODEL_NAME.put(XMaterial.WHITE_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.WHITE_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.WHITE_TERRACOTTA, "white_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.WITCH_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.WITHER_SKELETON_SKULL, "skull_wither");
        LEGACY_MODEL_NAME.put(XMaterial.WITHER_SKELETON_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.WOLF_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.YELLOW_BANNER, "banner");
        LEGACY_MODEL_NAME.put(XMaterial.YELLOW_BED, "bed");
        LEGACY_MODEL_NAME.put(XMaterial.YELLOW_TERRACOTTA, "yellow_stained_hardened_clay");
        LEGACY_MODEL_NAME.put(XMaterial.ZOMBIE_HEAD, "skull_zombie");
        LEGACY_MODEL_NAME.put(XMaterial.ZOMBIE_HORSE_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.ZOMBIFIED_PIGLIN_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.ZOMBIE_SPAWN_EGG, "spawn_egg");
        LEGACY_MODEL_NAME.put(XMaterial.ZOMBIE_VILLAGER_SPAWN_EGG, "spawn_egg");
    }

    public static String getItemModelKey(XMaterial xMaterial) {
        if (InteractiveChat.version.isLegacy()) {
            String legacyKey = LEGACY_MODEL_NAME.get(xMaterial);
            if (legacyKey != null) {
                return legacyKey.toLowerCase();
            }
        }
        return xMaterial.name().toLowerCase();
    }

}