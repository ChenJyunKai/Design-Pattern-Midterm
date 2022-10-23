/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author PC
 */
public class Singleton {

    public static void main(String[] args) {

        Cola cola = (Cola) SingletonFactory.getColaFactory().getProduct();
        Humberger humberger = (Humberger) SingletonFactory.getHumbergerFactory().getProduct();
        Chicken chicken = (Chicken) SingletonFactory.getChickenFactory().getProduct();

        System.out.println(cola.getName());
        System.out.println(humberger.getName());
        System.out.println(chicken.getName());
    }
}
