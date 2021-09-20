package com.sq.app.design.snapshot.Strength;

/**
 * @Author fanht
 * @Description  操作指令
 * @Date 2020/11/23 下午9:09
 * @Version 1.0
 */
public class CommandOpe {

    private StrengThening st;
    private StrengDto strengDto;

    private StrengDto makeBack(){
        return st.strOpe(strengDto);
    }

    private void undo(){
        if(strengDto != null){
            strengDto.restore();
        }
    }
}
