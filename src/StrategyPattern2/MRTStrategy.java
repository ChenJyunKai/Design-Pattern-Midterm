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
public class MRTStrategy implements IStrategy {

    @Override
    public int calculate(int km) {

//        小於十公里20元，超過每五公里多五元
        int result = 0;

        if (km <= 0) {
            return result;
        }

        if (km <= 10) {
            result = 20;
        }

        if (km > 10) {
            int count = ((km - 10) / 5) + 1;
            result = 20 + 5 * count;
        }

        return result;

    }
}
