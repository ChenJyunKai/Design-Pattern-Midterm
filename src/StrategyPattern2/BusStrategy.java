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
public class BusStrategy implements IStrategy {

    @Override
    public int calculate(int km) {
        int count = 0;

        if (km <= 10) {
            count = 1;
        } else if (km > 10) {
            count = 2;
        }

        return count * 15;
    }

}
