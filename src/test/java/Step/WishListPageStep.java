package Step;

import Page.WishListPage;
import Ultility.TestBasePage;
import cucumber.api.java.en.And;
import data.Product;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WishListPageStep {
    WishListPage wishListPage;
    Product product1, product2;
    List<Product> listProduct;
    public WishListPageStep(){
        wishListPage = new WishListPage(TestBasePage.getDriver());
        listProduct= new ArrayList();
        listProduct.add(product1);
        listProduct.add(product2);
    }
    @And("Verify Product in Wish-List Page")
    public void  verifyProductInWishListPage(){
        for (Product product: listProduct){
            Assert.assertTrue(wishListPage.checkProductNameDisplayInWishList(product), "Product " + product.getName() + " is not added to wishlist!");
            Assert.assertEquals(product.getPrice(), wishListPage.getSummaryProductPriceInWishList(product), "Price of product " + product.getName() + " is not correct");
        }

        }
    }

