package com.sq.app.design.visit.visit;

import com.sq.app.design.visit.entity.*;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/20 下午3:32
 * @Version 1.0
 */
public class EquipEyeImpl implements EquipEye{

    /**装备龙眼后攻击力增加50%*/
    private static final Double EYE = 50.0;


    @Override
    public void equirpEye(Gun gun) {
        double afterMosaicGem = gun.getDamage()*(1+EYE/100);
        System.out.println("枪装备龙眼后攻击力" + afterMosaicGem);
        gun.setDamage(afterMosaicGem);
    }

    @Override
    public void equirpEye(Knife knife) {
        knife.setDamage(knife.getDamage()*(1+EYE/100));
    }

    @Override
    public void equirpEye(Spear spear) {
        spear.setDamage(spear.getDamage()*(1+EYE/100));
    }

    @Override
    public void equirpEye(Stick stick) {
        stick.setDamage(stick.getDamage()*(1+EYE/100));
    }

    @Override
    public void equirpEye(Sword sword) {
        sword.setDamage(sword.getDamage()*(1+EYE/100));

    }
}
