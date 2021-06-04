# Car_Dealrship
using JDBC in java

Used Car Dealership Inventory
The task is to create a simple text-based "Console Application" in Java  to maintain a catalog of used cars. The catalog keeps track of each car's make, model, year, and sale price.
The program begins with an empty catalog. The user is prompted to enter one of three possible commands:
•             add - add a car to the catalog
•             list - list all cars in the catalog
      delete
       update
•             quit - quit the application
If an unknown command is entered, the user should be informed and asked to enter another command. If the add or list commands are entered, the operation for that command is carried out, then the user is prompted for another command. The application continues until the quit command is entered.
The add command
If the add command is entered, the user will then be prompted to enter the car's make, model, year, and sales price, one-by-one. The make (e.g. Isuzu) and model (e.g. Trooper) can be arbitrary strings, while the year (e.g. 1990) should be an integer and the sales price (e.g. 2599.99) should be a floating point value. After the data is entered, the record should be stored in memory to be recalled later by the list command. You may assume that the catalog will never hold more than 20 cars.
You are not required to do any error checking on the data that is entered. For the purpose of keeping the assignment simple, the program may behave arbitrarily badly if the user enters improperly formatted input.
The list command
If the user enters the list command, the contents of the catalog should be displayed to the screen, nicely formatted. The format of the output should resemble the example trace below. Regardless of the precision of the stored sales price, the value should be formatted in dollars and cents. If no items exist in the catalog, the command should output a message stating so. Otherwise, after printing out the details of each car, the number of cars and total price of all cars should be printed.
 
Example program trace:
 
Welcome to Mullet Joe's Gently Used Autos!
 
Enter command: show
 
Sorry, but "show" is not a valid command. Please try again.
 
Enter command: list
 
  There are currently no cars in the catalog.
 
Enter command: add
Make: Volkswagen
Model: Jetta
Year: 1999
Sales Price ($): 9450
 
Enter command: add
Make: Toyota
Model: Prius
Year: 2006
Sales Price ($): 27999.90
 
Enter command: list
 
1999 Volkswagen Jetta          $9,450.00
2006 Toyota Prius             $27,999.90
 
Number of cars: 2
Total inventory:              $37,449.90
 
Enter command: quit
 
  Good bye!


