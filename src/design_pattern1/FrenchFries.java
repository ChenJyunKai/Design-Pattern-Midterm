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
public class FrenchFries implements Product {

    //預設有鹽巴的
    String state = "有鹽巴";
    String size = "小包";

    //沒有給狀態 => 使用預設
    protected FrenchFries() {
    }

    //帶入狀態的建構
    protected FrenchFries(String state, String size) {
        this.state = state;
        this.size = size;
    }

    protected FrenchFries(String state) {
        this.state = state;
    }

    @Override
    public void describe() {
        System.out.println("我是" + size + "的" + state + "薯條");
    }
}
