package com.sq.app.design.visit.service;

import com.sq.app.design.common.Constants;
import com.sq.app.design.visit.entity.Gun;
import com.sq.app.design.visit.visit.EquipEye;
import com.sq.app.design.visit.visit.PlayGem;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/20 下午2:07
 * @Version 1.0
 */
public class GunImpl implements Weapon<Gun>{

    @Override
    public Double hitDamage(Gun gun) {
        return gun.getDamage();
    }

    @Override
    public double speed(Gun gun) {
        return 0;
    }

    @Override
    public void gem(PlayGem gem,Gun gun) {
        System.out.println("枪镶嵌了宝石，攻击力加30%");
        gem.mosaicGem(gun);
        System.out.println();
    }

    @Override
    public void equipWithEye(EquipEye eye,Gun gun) {
        System.out.println("枪镶嵌了龙眼，攻击力加50%");
        eye.equirpEye(gun);
        System.out.println();
    }



}
