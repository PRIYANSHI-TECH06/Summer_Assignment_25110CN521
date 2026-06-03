package Day3;

public class Q11 {
    public static void main(String[] args) {
        int a=24;
        int b=36;
        int gcd=1;
        for(int i=1;i<=a&& i<=b;i++){
          if(a%i==0&&b%i==0){
            gcd=i;
          }
        }
        System.out.println("GCD="+gcd);

    }
}
