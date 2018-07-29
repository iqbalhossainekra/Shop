/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Md. Iqbal Hossain
 */
public class Products {
    private String product_name;
    private String cost;
    private String type;
    private String sell_cost;

    public Products() {
    }

    public Products(String product_name, String cost, String type, String sell_cost) {
        this.product_name = product_name;
        this.cost = cost;
        this.type = type;
        this.sell_cost = sell_cost;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSell_cost() {
        return sell_cost;
    }

    public void setSell_cost(String sell_cost) {
        this.sell_cost = sell_cost;
    }
    
    
}
