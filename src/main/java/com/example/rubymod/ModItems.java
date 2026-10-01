package com.example.rubymod;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RubyMod.MODID);

    // Slightly better than iron: 500 uses, speed 6, +2 damage bonus, enchantability 14
    public static final Tier RUBY_TIER = new SimpleTier(
            BlockTags.INCORRECT_FOR_IRON_TOOL, 500, 6.0f, 2.0f, 14,
            () -> Ingredient.of(ModItems.RUBY.get()));

    public static final DeferredItem<Item> RUBY = ITEMS.registerSimpleItem("ruby");

    public static final DeferredItem<BlockItem> RUBY_BLOCK =
            ITEMS.registerSimpleBlockItem("ruby_block", ModBlocks.RUBY_BLOCK);

    public static final DeferredItem<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",
            () -> new SwordItem(RUBY_TIER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(RUBY_TIER, 3, -2.4f))));
}
