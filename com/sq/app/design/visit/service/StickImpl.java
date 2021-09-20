package com.sq.app.design.visit.service;

import com.sq.app.design.common.Constants;
import com.sq.app.design.visit.entity.Stick;
import com.sq.app.design.visit.visit.EquipEye;
import com.sq.app.design.visit.visit.PlayGem;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/20 下午2:24
 * @Version 1.0
 */
public class StickImpl implements Weapon<Stick>{
    @Override
    public Double hitDamage(Stick stick) {
        return stick.getDamage();
    }

    @Override
    public double speed(Stick stick) {
        return 0;
    }

    @Override
    public void gem(PlayGem gem,Stick stick) {
        gem.mosaicGem(stick);
    }

    @Override
    public void equipWithEye(EquipEye eye,Stick stick) {
        eye.equirpEye(stick);
    }
}
