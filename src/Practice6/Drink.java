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
//飲料介面
public abstract class Drink {

    //宣告預設測略(沒有折扣)
    IDiscountStrategy discountStrategy = new NoneDiscount(1);

    double value;

    private Drink() {
    }

    public Drink(double value) {
        this.value = value;
    }

    //帶入新策略之飲料
    public Drink(double value, IDiscountStrategy discountStrategy) {
        this.value = value;
        this.discountStrategy = discountStrategy;
    }

    public double getValue() {
        return discountStrategy.getValue(value);
    }

}
