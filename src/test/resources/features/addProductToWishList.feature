@AddProductToWishList
@Feature: Add Product To Wish List Test Case
@Scenario
  Scenario: Add Product To Wish List Successful
  Given Go to Login page
  And input Email as chuongpt@maillinator.com
  And input Password as 123456a@
  And click add product to wishlist
  Then Verify Product in Wish-List Page