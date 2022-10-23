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
public class Soup extends Item {

    private void addSoup() {
        System.out.println("加一份湯品");
    }

    @Override
    public void show() {
        super.show();
        addSoup();
    }
}
