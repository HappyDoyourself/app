package com.sq.app.design.visit;

import com.sq.app.design.visit.entity.*;
import com.sq.app.design.visit.visit.PlayGem;

import java.util.Random;

/**
 * @Author fanht
 * @Description
 * @Date 2020/11/20 上午11:46
 * @Version 1.0
 */
public class DamageAfterGem implements PlayGem {

    private static Random random = new Random();

    @Override
    public void mosaicGem(Gun gun) {
        gun.setDamage(random.nextDouble()*4+5);
    }

    @Override
    public void mosaicGem(Knife knife) {
        knife.setDamage(random.nextDouble()*8+3);
    }

    @Override
    public void mosaicGem(Spear spear) {
        spear.setDamage(random.nextDouble()*8+4);
    }

    @Override
    public void mosaicGem(Stick stick) {
        stick.setDamage(random.nextDouble()*11+2);
    }

    @Override
    public void mosaicGem(Sword sword) {
        sword.setDamage(random.nextDouble()*10+5);
    }
}
