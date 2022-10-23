/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemArchitecture;

/**
 *
 * @author PC
 */
public class DrinkShop {

    public Drink order(String drink, Drink.SugarType sugarType, Drink.IceType iceType) {
        //轉小寫
        drink.toLowerCase();
        switch (drink) {
            case "coffee":
                return new Coffee(sugarType, iceType);
            case "tea":
                return new Tea(sugarType, iceType);
            default:
                return null;
        }
    }
}
