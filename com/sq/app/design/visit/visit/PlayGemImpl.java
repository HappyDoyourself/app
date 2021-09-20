package com.sq.app.design.visit.visit;

import com.sq.app.design.visit.entity.*;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/20 下午2:09
 * @Version 1.0
 */
public class PlayGemImpl implements PlayGem{

    /**镶嵌宝石后攻击力增加30%*/
    private static final Double NUM = 30.0;


    @Override
    public void mosaicGem(Gun gun) {
        double afterMosaicGem = gun.getDamage()*(1+NUM/100);
        System.out.println("枪镶嵌宝石后攻击力" + afterMosaicGem);
        gun.setDamage(afterMosaicGem);
    }

    @Override
    public void mosaicGem(Knife knife) {
        knife.setDamage(knife.getDamage()*(1+NUM/100));
    }

    @Override
    public void mosaicGem(Spear spear) {
        spear.setDamage(spear.getDamage()*(1+NUM/100));
    }

    @Override
    public void mosaicGem(Stick stick) {
        stick.setDamage(stick.getDamage()*(1+NUM/100));
    }

    @Override
    public void mosaicGem(Sword sword) {
        sword.setDamage(sword.getDamage()*(1+NUM/100));
    }
}
