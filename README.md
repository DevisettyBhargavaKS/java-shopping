                           JAVA E-COMMERCE
-->Use this credentials to login
email-bhargav@gmail.com
password-bhargav
    (or)
Register by using your own details.
This Application allows you to order a product in which having 2 categories
1)Dress Category
        Displayes all the products regarding to this category.
2)Mobile Category
         Displayes all the products regarding to this category.
*******Flow--->login/register--->select category--->products--->cart--->orders--->logout*******
Application Files
*Assets
included 3 sub-files
               1)credentials.csv
                           -->having credentials to login and stores credentials of a new user.
               2)categiries.csv
                           -->contains categoryes of products.
               3)products.csv
                          -->whrer all products are stored.
*Controller 
      AppController
      -->It contains welcome page and AuthController
      AuthController
      --In Auth controller Contain login and register and validatedUser
      --In register i faced the challenge by reading the file from csv file i have to create filewrite for entering the deatlis like id,name,password,conform password.
      HomeController
      -->In homeController it can  be contain the home welcome 
       -->It can contain 5 types
      1.Categories
              CategortyController
       -->In CategoryController contains printMenu().
       -->In can display the categories it can be having dress and mobile category
      2.Products
              ProductController
         -->In  products it can be displayed the what are products given by defaultly.
         -->It can be provied the choice and enter the choice and it can be entered by it can be added by add to cart
        In add to cart the product will be added to the cart.
      3.Cart
              CartController
         -->By defaultly the cart will be empty.
         -->We can print the message the cart is empty
         -->After adding the product the it can be provided the productId,name,Totalprice.
         -->later it can be provided the Two methods.
             -->CheckOut()
               In checkout we can do checkout the cart will be empty and the product will be added successfully in the orders.
           -->Back()
               In back we can go back to Home page.
    4.Orders
           OrderController
       -->In order controller it can be the product will be orderd is successfully.
       -->In order details we can use the date format and what time can be it placed.
       -->In order we can go back the order will be placed successfully.
    5.Logout
       In logout we can go back to the login


