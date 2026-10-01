package com.example.rubymod;

import java.util.function.Supplier;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubyMod.MODID);

    public static final Supplier<CreativeModeTab> RUBY_TAB = TABS.register("ruby_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.rubymod"))
                    .icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.RUBY_BLOCK.get());
                        output.accept(ModItems.RUBY_SWORD.get());
                    })
                    .build());
}
