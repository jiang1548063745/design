package com.rorschach.pattern.adapter.objectadapter.demo;

/**
 * @author Rorschach
 * @date 2021-4-17 0:27
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int optput5V() {
        int adapterInput = ac220.outputAC220();

        int adapterOutput = adapterInput / 44;
        System.out.println("使用输入AC" + adapterInput + "V, 输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
