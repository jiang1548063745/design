package com.rorschach.pattern.adapter.classadapter.demo;

/**
 * @author Rorschach
 * @date 2021-4-17 0:27
 */
public class PowerAdapter extends AC220 implements DC5{
    @Override
    public int optput5V() {
        int adapterInput = super.outputAC220();

        int adapterOutput = adapterInput / 44;
        System.out.println("使用输入AC" + adapterInput + "V, 输出DC" + adapterOutput + "V");
        return adapterOutput;
    }
}
