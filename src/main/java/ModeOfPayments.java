package com.temitopeolanrewaju81;

//Polymorphism

import sun.text.normalizer.NormalizerBase;
//super or parent class
public class ModeOfPayments {
    // mode of payments for Shrimp
    protected String amount = "$40";
    protected  String weight = "10kg";

    public void approvedPayment(){
        System.out.println("The payment is successful  and transaction processed.");

    }
    public void declinedPayment(){
        System.out.println("The payment was declined due to insufficient balance.");

    }

}
//child /sub class
class CardPayment extends ModeOfPayments{
    public void approvedPayment(){
        System.out.println("The card payment has been processed.");

    }
    public void declinedPayment(){
        System.out.println("Payment has been declined due to insufficient fund!");

    }

}
//child /sub class
class CashPayment extends ModeOfPayments {

    public void approvedPayment(){
        System.out.println("Thanks for making payment on the counter.");

    }
    public void declinedPayment(){
        System.out.println("The cash is not complete.");

    }

}
//child /sub class
class CheckPayment extends ModeOfPayments{

    public void approvedPayment(){
        System.out.println("Your check payment is under process.");

    }
    public void declinedPayment(){
        System.out.println("Check payment decline due to insufficient fund!");

    }

}
//child /sub class
class MoneyOrderPayment extends ModeOfPayments{

    public void approvedPayment(){
        System.out.println("Check received and payment processed.");

    }
    public void declinedPayment(){
        System.out.println("Money order serial number is not valid.");

    }

}
//CREATE A CLASS INSTANCE  FOR ALL METHODS AND ATTRIBUTES
 class PaymentMainClass{
    public static void main(String [] args ){
        //CREATE A CLASS FOR ALL METHODS AND ATTRIBUTES
    ModeOfPayments myModeOfPayments = new ModeOfPayments();
    ModeOfPayments myCardPayment = new CardPayment();
    ModeOfPayments myCashPayment = new CashPayment();
    ModeOfPayments myCheckPayment = new CheckPayment();
    ModeOfPayments myMoneyOrderPayment = new MoneyOrderPayment();

    //Accessing all the methods and variable or creating an instance of the class paymentMainClass
    myModeOfPayments.approvedPayment();
    myModeOfPayments.declinedPayment();
    myCardPayment.approvedPayment();
    myCardPayment.declinedPayment();
    myCashPayment.approvedPayment();
    myCashPayment.declinedPayment();
    myCheckPayment.approvedPayment();
    myCheckPayment.declinedPayment();
    myMoneyOrderPayment.approvedPayment();
    myMoneyOrderPayment.declinedPayment();
        System.out.println(myModeOfPayments.amount);
        System.out.println(myModeOfPayments.weight);

    }

}