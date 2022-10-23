/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_pattern1;

/**
 *
 * @author PC
 */
public class Design_Pattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //建立薯條工廠
        Factory friesFac = new FrenchFriesFactory();
        //建立薯條 (沒有傳值=>有鹽薯條)
        Product fries = friesFac.getProduct();
        //客製化無鹽薯條
        Product myfries = ((FrenchFriesFactory) friesFac).getProduct("無鹽的");
        Product myfries2 = ((FrenchFriesFactory) friesFac).getProduct("無鹽的", "大包");

        fries.describe();//我是有鹽巴薯條
        myfries.describe();//我是無鹽的薯條
        myfries2.describe();
    }

}
