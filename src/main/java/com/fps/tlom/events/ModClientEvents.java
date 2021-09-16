package com.fps.tlom.events;

import com.fps.tlom.TLOM;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TLOM.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void onJumpWithStick(LivingEvent.LivingJumpEvent event) {
        LivingEntity player = event.getEntityLiving();
        if (player.getMainHandItem().getItem() == Items.STICK){
            TLOM.LOGGER.info("Player tried to jump with a stick!");
            player.addEffect(new EffectInstance(Effects.LEVITATION, 100));
        }
    }

    @SubscribeEvent
    public static void onArmorTick(final World world, final PlayerEntity player, final ItemStack itemstack) {

        if (player.getArmorSlots(itemstack = ItemStack.getItem() == Items.DIAMOND_HELMET)){
            TLOM.LOGGER.info("Player wearing diamond helmet!");
            player.addEffect(new EffectInstance(Effects.LEVITATION, 100));
        }
    }
}
