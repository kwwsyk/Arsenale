package com.kwwsyk.suit.arsenale.common.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.ItemAttributeModifiers;

/**
 *
 */
public abstract class AbstractWeapon extends Item {

    //Params
    //基础攻击力属性标注值
    private float ad = 0.0F;
    //基础攻击速度属性标注值
    private float as = 1.0F;
    //基础击退属性标注值
    private float ak = 0.0F;
    //基础攻击距离属性标注值
    // => EntityInteractionRange
    private float ar = 3.0F;

    //work in vanilla attack mechanic
    private float attackDamage = ad;
    private float attackSpeed = as;
    private float attackKnockback = ak;
    // => EntityInteractionRange
    private float attackReach = ar;

    //work in hitbox-base combat mechanic
    private float hittableReach = ar/2;

    //work in offhand
    private float offhandAd = ad*0.6F;
    private float offhandAs = as;
    private float offhandAk = ak*0.5F;
    private float offhandAr = ar;

    //act animations

    //material affect attributes

    //spEffects

    //material affect spEffects


    public AbstractWeapon() {
        super(new Properties().attributes(ItemAttributeModifiers.builder().build()));
    }



}