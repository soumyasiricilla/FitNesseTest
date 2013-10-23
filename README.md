FitNesseTest
============
Goal : Test the system using Fitnesse scripts.

Implementaation Details: Used Java as front language ,written test scripts using Fitnesse.

System Description: Discount system in a furniture store.
User Story: Customers who spend over 2000$ get 20% discount and 10% discount for   2000$. The system should display the appropriate discount and remaining amount after discount.

The test implementation in FitNesse:

•	In FitNesse I created a CustomerDiscountTest test page.

•	Configured FitNesse to use Slim
          !define TEST_SYSTEM {slim}
          
•	Updated the test page to include the path of java fixture code page

!path C:\Users\Siricilla\workspace\Fitnesse\bin

•	Created an import table to name the package of fixture class

|import|
|billing.fixtures|

•	Created a decision table that calls the Customer Billing fixture

!|Customer Billing|
|name|bill|discount?|bill after discount?|
|Abraham|50|10%|45.0|

•	Assigned ? to end of  the resultant methods(discount? , bill after discount? )

!4 Story: Customers who spend over 2000$ get 20% discount  and 10% discount for below 2000$. The system should display the discount and amount after discount.

!|Customer Billing|

|name|bill|discount?|bill after discount?|

|Abraham|50|10%|45.0|

Fitness script gets executed upon clicking the Test button 
In FitNesse the resultant methods get evaluated and compare the results to the given values in decision table. If they are correct, it gives the values in green otherwise in red.



