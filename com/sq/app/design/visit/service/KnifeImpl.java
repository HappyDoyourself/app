package com.sq.app.design.visit.service;


import com.sq.app.design.visit.entity.Knife;
import com.sq.app.design.visit.visit.EquipEye;
import com.sq.app.design.visit.visit.PlayGem;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/20 下午2:21
 * @Version 1.0
 */
public class KnifeImpl implements Weapon<Knife>{
    @Override
    public Double hitDamage(Knife knife) {
        return knife.getDamage();
    }

    @Override
    public double speed(Knife knife) {
        return knife.getDamage();
    }

    @Override
    public void gem(PlayGem gem,Knife knife) {
        gem.mosaicGem(knife);
    }

    @Override
    public void equipWithEye(EquipEye eye,Knife knife) {
        eye.equirpEye(knife);
    }
}
