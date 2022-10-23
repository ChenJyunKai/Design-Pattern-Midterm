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
public abstract class Product {

    public String getName() {
        return this.getClass().getSimpleName();
    }
}
