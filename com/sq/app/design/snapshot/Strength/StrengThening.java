package com.sq.app.design.snapshot.Strength;

import lombok.Data;

/**
 * @Author fanht
 * @Description  即将要做的操作
 * @Date 2020/11/23 下午8:54
 * @Version 1.0
 */
@Data
public class StrengThening {

    //强化状态 + - n
    private Integer state;
    //成功or失败状态
    private Integer code;
    //成功几率
    private Double succFate;


    public void setState(Integer state) {
        this.state = state;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setSuccFate(Double succFate) {
        this.succFate = succFate;
    }

    /**
     * 将要强化的
     * @return
     */
    public StrengDto strOpe(StrengDto dto){
        return new StrengDto(dto.getState(),dto.getCode(),dto.getSuccFate());
    }
}
