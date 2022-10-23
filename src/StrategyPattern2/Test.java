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
public class Test {

    public static void main(String[] args) {

        MRTStrategy mrt = new MRTStrategy();
        BusStrategy bus = new BusStrategy();
        PriceCalculator test = new PriceCalculator(mrt);

        System.out.println("MRT " + test.calculate(20));
        System.out.println("Bus " + test.calculate(20, bus));
    }
}
