package com.sq.app.design.visit.service;

import com.sq.app.design.common.Constants;
import com.sq.app.design.visit.entity.Spear;
import com.sq.app.design.visit.visit.EquipEye;
import com.sq.app.design.visit.visit.PlayGem;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/20 下午2:23
 * @Version 1.0
 */
public class SpearImpl implements Weapon<Spear>{
    @Override
    public Double hitDamage(Spear spear) {
        return spear.getDamage();
    }

    @Override
    public double speed(Spear spear) {
        return 0;
    }

    @Override
    public void gem(PlayGem gem,Spear spear) {
        gem.mosaicGem(spear);
    }

    @Override
    public void equipWithEye(EquipEye eye,Spear spear) {
        eye.equirpEye(spear);
    }
}
