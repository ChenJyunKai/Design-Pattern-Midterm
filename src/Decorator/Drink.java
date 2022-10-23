/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author PC
 */
public class Drink extends Item {

    private void addDrink() {
        System.out.println("加一份飲料");
    }

    @Override
    public void show() {
        super.show();
        addDrink();
    }
}
