package com.sq.app.sentinel;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author fanht
 * @Description sentinel 限流
 * @Date 2021/2/24 下午4:14
 * @Version 1.0
 */
public class SentinelTest1 {


    public static void main(String[] args) throws InterruptedException {
        initFlowRules();
         Integer i = 0;
        for (int k= 0;k<100;k++){
            Entry entry = null;
            try {
                entry = SphU.entry("HelloSentinel");
                System.out.println("hello sentinel"+ i++);

            } catch (BlockException e) {
                System.out.println("block");

            }finally {
                if(entry != null){
                    System.out.println("====exit===");
                    entry.exit();
                }
            }

        }

    }


    public static void initFlowRules(){
        List<FlowRule> flowRuleList = new ArrayList<>();

        FlowRule flowRule = new FlowRule();
        flowRule.setResource("HelloSentinel");
        flowRule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        flowRule.setCount(20);
        flowRuleList.add(flowRule);
        FlowRuleManager.loadRules(flowRuleList);
    }
}
