package collection_framework.service;

import collection_framework.service.ProductManager;

public class UserManager {
    ProductManager productManager = new ProductManager();

    public void renderProduct(){
        productManager.renderProduct();
    }
    public void searchProductByName() {
        productManager.searchProductByName();
    }
    public void sortByPriceASC() {
        productManager.sortByPriceASC();
    }
    public void sortByPriceDESC() {
        productManager.sortByPriceDESC();
    }
}
