package com.sq.app.design.snapshot;

import com.alibaba.fastjson.JSONObject;
import com.sq.app.design.snapshot.Strength.StrengDto;
import com.sq.app.design.snapshot.Strength.StrengThening;

/**
 * @Author fanht
 * @Description  行为模式-备忘录模式
 * 模拟场景：武器强化，强化越高 失败率越高 ，如果失败，可以回到上一个强化时候的状态
 *  也可以回到某个强化的状态~
 * @Date 2020/11/23 下午8:55
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {

        StrengThening sh = new StrengThening();

        StrengDto dto =  new StrengDto(1,1,1.00);
        dto = sh.strOpe(dto);

        System.out.println(JSONObject.toJSONString(dto));

        StrengDto dto1 = new StrengDto(5,1,0.30);

         dto1 = sh.strOpe(dto1);

        System.out.println(JSONObject.toJSONString(dto1));

        dto.restore();

        System.out.println(JSONObject.toJSONString(dto));


    }
}
