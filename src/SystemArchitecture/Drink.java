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
public abstract class Drink {

    private SugarType sugar;
    private IceType ice;

    private Drink() {
    }

    public Drink(SugarType sugar, IceType ice) {
        this.sugar = sugar;
        this.ice = ice;
    }

    enum SugarType {
        REGULAR, LESS, HALF, QUARTER, FREE
    }

    enum IceType {
        REGULAR, EASY, FREE, HOT
    }

    /**
     * @return the sugar
     */
    public SugarType getSugar() {
        return sugar;
    }

    /**
     * @param sugar the sugar to set
     */
    public void setSugar(SugarType sugar) {
        this.sugar = sugar;
    }

    /**
     * @return the ice
     */
    public IceType getIce() {
        return ice;
    }

    /**
     * @param ice the ice to set
     */
    public void setIce(IceType ice) {
        this.ice = ice;
    }

}
