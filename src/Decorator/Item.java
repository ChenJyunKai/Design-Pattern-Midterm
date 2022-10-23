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
public class Item extends Order {

    protected Order order;

    //裝飾
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
