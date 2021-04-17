package com.rorschach.pattern.adapter.interfaceadapter.demo;

/**
 * @author Rorschach
 * @date 2021-4-17 0:27
 */
public class PowerAdapter implements DC {
    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220();

        int adapterOutput = adapterInput / 44;
        System.out.println("使用输入AC" + adapterInput + "V, 输出DC" + adapterOutput + "V");
        return adapterOutput;
    }

    @Override
    public int output12V() {
        return 0;
    }

    @Override
    public int output24V() {
        return 0;
    }

    @Override
    public int output36V() {
        return 0;
    }
}
