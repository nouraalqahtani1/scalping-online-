

public class Payment extends ShoppingCart {

    private  String paymentMethod ;
    private String coponCode ; 
    private double coponDiscount;

     public Payment (){
    }
    public Payment ( double total_cart ){
        double total_cart1 = this.total_cart;
        this.paymentMethod  = paymentMethod;
    }
    
    public void applyCopon (String coponCode){
       if (coponCode.equals("IAU10")){
        this.coponCode= coponCode;
        this.coponDiscount=coponDiscount;
        coponDiscount= total_cart * 0.10;
        total_cart-=coponDiscount;
        System.out.println("The copon Add Sucessful !! ");
        System.out.println("The Total After Apply Copon : " + total_cart);
       }
       else{
        System.out.println("This copon Not apply in the System ");
       }
    }
    public String getPaymentMethod (){
        return paymentMethod;
    }
    public String getCoponCode (){
        return coponCode;
    }
    public double getCoponDiscount (){
        return coponDiscount;
    }

    
}