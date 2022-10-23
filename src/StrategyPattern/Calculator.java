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
public class Calculator {

    private int now = 0;

    private IStrategy strategy;

//    策略模式
    public void execute(int a, int b) {
        this.now = strategy.caculate(a, b);
    }

    public void reset() {
        this.now = 0;
    }

    public void getNow() {
        System.out.println(this.now);
    }

//    簡單工廠模式
    public void setStrategy(DoType doType) {
        switch (doType) {
            case ADD:
                this.strategy = new add();
                break;
            case MINUS:
                this.strategy = new minus();
                break;
            case DIVIDE:
                this.strategy = new divide();
                break;
            case MULTYPLY:
                this.strategy = new multyply();
                break;
        }
    }

    enum DoType {
        ADD, MINUS, DIVIDE, MULTYPLY
    }

}
