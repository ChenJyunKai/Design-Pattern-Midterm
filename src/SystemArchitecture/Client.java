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
public class Client {

    public static void main(String[] args) {
        DrinkShop drinkShop = new DrinkShop();
//        Tea tea = new Tea(Drink.SugarType.FREE, Drink.IceType.EASY);

        //點一杯烏龍茶
        Tea tea = (Tea) drinkShop.order("Tea", Drink.SugarType.FREE, Drink.IceType.EASY);
        //error: puch null?
        tea.setTeaType(Tea.TeaType.OOLONG);

        //點一杯美式
        Coffee coffee = (Coffee) drinkShop.order("CoFFee", Drink.SugarType.QUARTER, Drink.IceType.HOT);

    }
}
