package com.sq.app.design.snapshot.Strength;

import lombok.Data;

/**
 * @Author fanht
 * @Description  上一步的操作
 * @Date 2020/11/23 下午9:01
 * @Version 1.0
 */
@Data
public class StrengDto {

    //强化状态 + - n
    private Integer state;
    //成功or失败状态
    private Integer code;
    //成功几率
    private Double succFate;

    private StrengThening strengThening;

    public StrengDto(Integer state, Integer code, Double succFate) {
        this.state = state;
        this.code = code;
        this.succFate = succFate;
    }

    public void  restore(){
        strengThening.setCode(code);
        strengThening.setState(state);
        strengThening.setSuccFate(succFate);
    }


}
