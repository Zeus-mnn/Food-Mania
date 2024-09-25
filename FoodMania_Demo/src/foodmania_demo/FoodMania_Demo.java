package foodmania_demo;
import javax.swing.JOptionPane;

public class FoodMania_Demo {

    private double totalAmount = 0.0; 

    public static void main(String[] args) {
        
        //app object
        FoodMania_Demo app = new FoodMania_Demo();
        
        
        app.selectItems();
        
        //cash or card??
        boolean isCashPayment = false; 

        //get payment method
        while (true) {
            isCashPayment = askForPaymentMethod(); 
            if (isCashPayment || !isCashPayment) {
                break;
            }
        }//loop end

        //create receipt
        String receipt = generatePOSReceipt(isCashPayment, app.totalAmount);

        //cash received and change calculation
        if (isCashPayment) {
            double cashReceived = askForCashReceived();
            double change = cashReceived - app.totalAmount;
            JOptionPane.showMessageDialog(null, "Cash Received: R" + cashReceived + "\nChange: R" + change);
        }

        
        JOptionPane.showMessageDialog(null, receipt);
        JOptionPane.showMessageDialog(null, "Thank you for your purchase at FoodMania!");
        
        
        
        
    }//End of main method
    
    
    //Methods 

    //items to buy
    public void selectItems() {
        String[] items = {"Burger - R50", "Pizza - R80", "Salad - R40", "Soda - R20", "Ice Cream - R30"};
        double[] prices = {50, 80, 40, 20, 30};

        StringBuilder selectedItems = new StringBuilder();
        totalAmount = 0.0;

        //allows the user to keep on shopping
        boolean keepShopping = true;
        while (keepShopping) {
            int selectedItem = JOptionPane.showOptionDialog(null, "Select an item to buy", "FoodMania Menu",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);

            if (selectedItem >= 0) {
                selectedItems.append(items[selectedItem]).append("\n");
                totalAmount += prices[selectedItem];
            }

            //user prompt to continue shopping
            int response = JOptionPane.showConfirmDialog(null, "Do you want to buy another item?", "Continue Shopping",
                    JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.NO_OPTION) {
                keepShopping = false;
            }
        }

        //display the selected items and total amount
        JOptionPane.showMessageDialog(null, "You selected:\n" + selectedItems + "\nTotal: R" + totalAmount);
    }

    
    //generate receipt
    private static String generatePOSReceipt(boolean isCashPayment, double totalAmount) {
        String paymentMethod = isCashPayment ? "Cash" : "Card";
        String receipt = "FoodMania Point of Sale Receipt\n";
        receipt += "-------------------------------\n";
        receipt += "Total Amount: R" + totalAmount + "\n";
        receipt += "Payment Method: " + paymentMethod + "\n";
        receipt += "-------------------------------\n";
        receipt += "Thank you for shopping with us!\n";
        
        
        return receipt;
        
        
    }//End receipt method

    
    //payment type method
    private static boolean askForPaymentMethod() {
        String[] options = {"Cash", "Card"};
        int response = JOptionPane.showOptionDialog(null, "Select Payment Method", "Payment",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        
        return response == 0; 
        
    }//End of ask for payment method

    
    //cash received method
    private static double askForCashReceived() {
        String input = JOptionPane.showInputDialog(null, "Enter Cash Received:");
        double cashReceived = Double.parseDouble(input);
        
        
        return cashReceived; 
        
    }//End of ask for cash received method
    
    
}//End of App
