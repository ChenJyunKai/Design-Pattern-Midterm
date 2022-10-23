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
//減價策略
public class MinusDiscount extends IDiscountStrategy {

    public MinusDiscount(double discount) {
        super(discount);
    }

    @Override
    public double getValue(double value) {
        return value - discount;
    }
}
