/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern;

/**
 *
 * @author PC
 */
public class Test {

    public static void main(String[] args) {
        Calculator istrategy = new Calculator();
        //使用列舉DoType static class 的 ADD
        istrategy.setStrategy(Calculator.DoType.ADD);
        ((Calculator) istrategy).execute(1, 1);
//        istrategy.reset();
        istrategy.getNow();
    }

}
