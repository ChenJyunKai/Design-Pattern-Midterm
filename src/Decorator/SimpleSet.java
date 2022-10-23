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
public class SimpleSet extends Set {

    private void addSet() {
        MainMeal mainMeal = new MainMeal();
        Drink drink = new Drink();
        //super.order
        mainMeal.decorate(order);
        drink.decorate(mainMeal);
        this.order = drink;
    }

    @Override
    public void show() {
        addSet();
        super.show();
    }
}
