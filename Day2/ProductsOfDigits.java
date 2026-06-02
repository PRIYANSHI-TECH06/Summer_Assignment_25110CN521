package Day2;

public class ProductsOfDigits {
    public static void main(String[] args) {
        int n=1234;
        int product=1;
        while(n!=10){
            int digit=n%10;
            product=product*digit;
            n=n/10;
        }
        System.out.println("Product="+product);
    }
}
