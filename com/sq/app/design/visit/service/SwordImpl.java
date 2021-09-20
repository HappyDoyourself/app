package com.sq.app.design.visit.service;

import com.sq.app.design.common.Constants;
import com.sq.app.design.visit.entity.Sword;
import com.sq.app.design.visit.visit.EquipEye;
import com.sq.app.design.visit.visit.PlayGem;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/20 下午2:25
 * @Version 1.0
 */
public class SwordImpl implements Weapon<Sword>{
    @Override
    public Double hitDamage(Sword sword) {
        return sword.getDamage();
    }

    @Override
    public double speed(Sword sword) {
        return 0;
    }


    @Override
    public void gem(PlayGem gem,Sword sword) {
        gem.mosaicGem(sword);
    }

    @Override
    public void equipWithEye(EquipEye eye,Sword sword) {
        eye.equirpEye(sword);
    }
}
