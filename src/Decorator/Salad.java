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
public class Salad extends Item {

    private void addSalad() {
        System.out.println("加一份沙拉");
    }

    @Override
    public void show() {
        super.show();
        addSalad();
    }
}
