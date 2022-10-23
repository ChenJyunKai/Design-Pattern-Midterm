/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice6;

/**
 *
 * @author PC
 */
public class Test {

    public static void main(String[] args) {

        DrinkOrder drinkOrder = new DrinkOrder();
        drinkOrder.addDrink(new Coffee(165));
        drinkOrder.addDrink(new MilkTea(55, new MinusDiscount(20)));
        //這裡的noneDiscount方法實質上無須傳入value 但因繼承IDiscountStrategy 宣告時必傳入參數
        double price = drinkOrder.getTotalPrice(new NoneDiscount(0));
        //200
        System.out.println(price);
        price = drinkOrder.getTotalPrice(new MultiplyStrategy(0.9));
        //打九折
        System.out.println(price);

    }
}
