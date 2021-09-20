package com.sq.app.design.visit;

import com.sq.app.design.common.Constants;
import com.sq.app.design.visit.entity.Gun;
import com.sq.app.design.visit.entity.Stick;
import com.sq.app.design.visit.service.GunImpl;
import com.sq.app.design.visit.service.StickImpl;
import com.sq.app.design.visit.service.Weapon;
import com.sq.app.design.visit.visit.EquipEye;
import com.sq.app.design.visit.visit.EquipEyeImpl;
import com.sq.app.design.visit.visit.PlayGemImpl;

/**
 * @Author fanht
 * @Description 访问者模式
 * @Date 2020/11/20 上午11:31
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

        Stick gun = new Stick(Constants.INIT);
        System.out.println("初始化攻击力:" + Constants.INIT);
        /**访问者模式 如果想要在添加一个其他属性，直接定义一个访问者*/
        Weapon weapon = new StickImpl();

        PlayGemImpl gem = new PlayGemImpl();

        weapon.gem(gem,gun);
        EquipEye equipEye = new EquipEyeImpl();

        weapon.equipWithEye(equipEye,gun);

        System.out.println("装备武器后攻击力：" + gun.getDamage());

    }
}
