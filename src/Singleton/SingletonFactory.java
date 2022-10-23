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
public class SingletonFactory {

    //讓別人進行呼叫
    public static Factory getColaFactory() {
        return ColaFactory.colaFactory;
    }

    public static Factory getHumbergerFactory() {
        return HumbergerFactory.humbergerFactory;
    }

    public static Factory getChickenFactory() {
        return ChickenFactory.chickenFactory;
    }

    //實作單例
    private static class ColaFactory implements Factory {

        private static ColaFactory colaFactory = new ColaFactory();

        private ColaFactory() {
        }

        @Override
        public Product getProduct() {
            return new Cola();
        }
    }

    private static class HumbergerFactory implements Factory {

        private static HumbergerFactory humbergerFactory = new HumbergerFactory();

        private HumbergerFactory() {
        }

        @Override
        public Product getProduct() {
            return new Humberger();
        }
    }

    private static class ChickenFactory implements Factory {

        private static ChickenFactory chickenFactory = new ChickenFactory();

        private ChickenFactory() {
        }

        @Override
        public Product getProduct() {
            return new Chicken();
        }
    }
}
