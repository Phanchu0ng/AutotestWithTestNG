package Step;

import Page.ProductDetailPage;
import Page.WishListPage;
import Ultility.TestBasePage;
import cucumber.api.java.en.And;
import data.Product;
import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

public class ProductDeatilPageStep {
    ProductDetailPage productDetailPage;
    WishListPage wishListPage;
    Product product1,product2;
    List<Product> listProduct;
    public ProductDeatilPageStep(){
        productDetailPage = new ProductDetailPage(TestBasePage.getDriver());
        wishListPage = new WishListPage(TestBasePage.getDriver());
        listProduct = new ArrayList();
        listProduct.add(product1);
        listProduct.add(product2);
    }
    @And("click add product to wishlist")
    public void addProductToWishList(){
        for(Product product:listProduct){
            productDetailPage.addListOfProductToWishList(product);
            Assert.assertTrue("add product"+product.getName()+ "sucessfully",wishListPage.checkMessageAddToWishListSuccess());
        }
    }
}
