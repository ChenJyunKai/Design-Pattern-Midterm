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
public class Test {

    public static void main(String[] args) {
        Order order = new Order();

        Drink drink = new Drink();
        MainMeal mainMeal = new MainMeal();
        Soup soup = new Soup();

        //都對order進行了裝飾。均執行了add
        drink.decorate(order);
        mainMeal.decorate(drink);
        soup.decorate(mainMeal);

        soup.show();

        SimpleSet set = new SimpleSet();

        set.show();

    }
}
