# Food-Mania

Overview:
The FoodMania Demo is a simple Point of Sale (POS) Java application that allows users to select food items, choose a payment method (cash or card), calculate the total cost, and display a receipt. If the user pays by cash, the program will calculate the change based on the cash received.

Features:
Selection of food items from a predefined menu
Payment via cash or card
Generation of a receipt
Calculation of change for cash payments
Requirements:
To run this application, you need the following:

Java Development Kit (JDK) installed (version 8 or above).
A Java Integrated Development Environment (IDE) like Eclipse, IntelliJ IDEA, or NetBeans, or you can run the program from the command line.
How to Run the Application:
Install Java JDK:
If you don't have Java installed, download and install it from Oracle's official site.

Create a New Java Project in your IDE:

Open your Java IDE.
Create a new Java project and name it FoodMania_Demo.
Add the Source Code:

Inside your project, create a new Java class named FoodMania_Demo.
Copy and paste the provided source code into the class.
Compile and Run the Application:

Once the code is added, compile the program (most IDEs do this automatically).
Run the main method in the FoodMania_Demo class.
Alternatively, if you're using the command line:

Navigate to the directory where the file is located.
Compile the program using the command:
bash
Copy code
javac FoodMania_Demo.java
Run the program using:
bash
Copy code
java FoodMania_Demo
Interacting with the Application:

Once the application runs, a graphical window will appear where you can select items from the menu.
After choosing the desired items, you will be prompted to select the payment method (Cash or Card).
If you choose "Cash," you will be asked to enter the amount received, and the application will calculate the change.
Receipt Generation:

After payment is processed, a receipt will be displayed with details such as the total amount, the payment method, and a thank you message.
Customization:
Menu Items: You can customize the menu items by modifying the items and prices arrays in the selectItems() method.
Payment Method: The application currently only supports Cash and Card payments, but you can add more options by expanding the askForPaymentMethod() method.
Example Flow:
You will be prompted to select items from the menu.
Once done, you will choose the payment method.
If paying by cash, the system will request the amount received and calculate the change.
A receipt will be displayed showing the total and payment details.
A final message will thank you for shopping.
Notes:
Ensure that your input is valid, especially when entering the cash amount. The application expects a numeric value and may throw an exception if non-numeric data is entered.
License:
This project is for demo purposes and is free to use or modify as needed.
