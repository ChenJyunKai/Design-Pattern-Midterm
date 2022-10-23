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
//打折策略介面
public abstract class IDiscountStrategy {

    double discount;

    private IDiscountStrategy() {
    }

    public IDiscountStrategy(double discount) {
        this.discount = discount;
    }

    abstract public double getValue(double value);
}
