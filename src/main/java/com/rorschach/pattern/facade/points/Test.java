package com.rorschach.pattern.facade.points;

/**
 * @author Rorschach
 * @date 2021-4-12 21:05
 */
public class Test {

    public static void main(String[] args) {
        FacadeService facadeService = new FacadeService();
        facadeService.enter(new Gate("营房大门"));
    }
}
