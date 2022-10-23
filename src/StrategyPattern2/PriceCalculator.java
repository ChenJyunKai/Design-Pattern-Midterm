/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyPattern2;

/**
 *
 * @author PC
 */
//計算選擇後的策略之價錢
public class PriceCalculator {

    IStrategy strategy;

    //這行的用意?
    private PriceCalculator() {
    }

    //呼叫建構子時傳入策略
    public PriceCalculator(IStrategy strategy) {
        this.strategy = strategy;
    }

    //改變策略
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用預設策略
    public int calculate(int km) {
        //呼叫下面的calculate(帶入預設策略)
        return this.calculate(km, strategy);
    }

    //使用傳入策略
    public int calculate(int km, IStrategy strategy) {
        this.strategy = strategy;
        return strategy.calculate(km);
    }
}
