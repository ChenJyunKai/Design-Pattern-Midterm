/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class DrinkOrder {

    //放飲料的list
    private List<Drink> drinkList = new ArrayList<Drink>();

    //加入飲料
    public void addDrink(Drink drink) {
        drinkList.add(drink);
    }

    //移除飲料
    public void removeDrink(Drink drink) {
        drinkList.remove(drink);
    }

    //飲料總價錢（私有方法）
    private double totalPrice() {

        double totalPrice = 0;

        for (Drink d : drinkList) {
            totalPrice += d.getValue();
        }

        return totalPrice;

    }

    //訂單總價錢
    public double getTotalPrice(IDiscountStrategy discountStrategy) {

        //先計算未折扣之總價
        double totalPrice = totalPrice();

        //選擇策略後的價格
        return discountStrategy.getValue(totalPrice);

    }

}
