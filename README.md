# promotion-engine

Problem Statement::

Our Cart contains a list of single character
SKU ids (A, B, C. ..) over which the promotion engine will need to run.
The promotion engine will need to calculate the total order value after applying the 2 promotion types
• buy 'n' items of a SKU for a fixed price (3 A's for 130)
• buy SKU 1 & SKU 2 for a fixed price ( C + D = 30 )
Test Setup
Unit price for SKU IDs::
A ->50
B ->30
C ->20
D ->15

Active Promotions are: 
3 of A's for 130
2 of B's for 45
C & D for 30

Test Scenario A
1 * A 50
1 * B 30
1 * C 20
Total should be 100

Test Scenario B
5 * A 130 + 2*50
5 * B 45 + 45 + 30
1 * C 28
Total should be 370
------------------------------------------------------
1) Java REST API is developed in Spring Boot to apply the promotion types on the cart containing list of SKU IDs.
2) Junits Test Cases added for testing API & service.
3) Chain of Responsibility design pattern used so that promotion types can be applied on the cart items one by one as below:
PromotionType is an interface, NSKUItemsForFixedPrice & SKU1SKU2ForFixedPrice are the implementing classes with calculatePromotion() & setNextPromotionType() methods
4) In order to build the backend Spring Boot API, build using following maven goals:
mvn clean install
In order to run the backend Spring Boot API, use the below maven goal:
mvn spring-boot:run
In order to test the REST API to apply promotion engine:

Endpoint: http://localhost:8080/api/runPromotion
Method: POST
Request Body to be used:: 
{
	"skuList":[{
			"id":"A",
			"quantity":1
		},
		{
			"id":"B",
			"quantity":1
		},
		{
			"id":"C",
			"quantity":1
		}
	]
}

It gives response as a Total of Double value as : 100
