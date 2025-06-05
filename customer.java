public class customer {
    String coustomer_Name;
    int customerId;
    int customerNumber;
    int payment;
     void getCustomer(){
        System.out.println(coustomer_Name+ "\n" + customerId + "\n"+ customerNumber+ "\n" +payment);
    } 
    public static void main(String[] args) {
        customer details = new customer();
        details.coustomer_Name = "Nithin";
        details.customerId = 786;
        details.customerNumber = 344473823;
        details.payment = 2343;
        details.getCustomer();
    }
    
}
