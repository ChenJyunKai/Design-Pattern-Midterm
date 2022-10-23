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
public class MainMeal extends Item {

    private void addMeal() {
        System.out.println("加一份主餐");
    }

    @Override
    public void show() {
        super.show();
        addMeal();
    }
}
