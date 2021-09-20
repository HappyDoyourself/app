package com.sq.app.design.visit.service;


import com.sq.app.design.visit.visit.EquipEye;
import com.sq.app.design.visit.visit.PlayGem;

/**
 * @Author fanht
 * @Description 武器库
 * @Date 2020/11/20 下午1:55
 * @Version 1.0
 */
public interface Weapon<T> {

    /**
     * 伤害
     * @return
     */
    Double hitDamage(T t);

    /**
     * 速度
     * @return
     */
    double speed(T t);

    /**
     * 镶嵌宝石
     * @param gem
     */
    void gem(PlayGem gem,T t);

    /**
     * 装备打眼
     * @param gem
     */
    void equipWithEye(EquipEye eye,T t);
}
