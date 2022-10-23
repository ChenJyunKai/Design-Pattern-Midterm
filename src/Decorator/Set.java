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
public class Set extends Order {

    //先建立一個空菜單
    protected Order order;

    public void decorate(Order order) {
        this.order = order;
    }

    @Override
    public void show() {
        if (order != null) {
            order.show();
        }
    }
}
