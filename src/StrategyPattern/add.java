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
public class add implements IStrategy {

    @Override
    public int caculate(int a, int b) {
        return a + b;
    }
}
