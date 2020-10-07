package emailapp;

public class EmailApp {
    public static void main(String[] args) {
       /* * You can create an Array of Email Objects so you can have set of Email Addresses *

        Email[] EmailAccounts=new Email[100];*/

        Email email1=new Email("Bharath","Kalyan");
        System.out.println(email1.showInfo());
    }
}
