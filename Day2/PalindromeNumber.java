package Day2;

public class PalindromeNumber {
    int n=121;
    int original=n;
    int reverse=0;
    
    while(n!=0){
        int digit=n%10;
        reverse=reverse*10+digit;
        n=n/10;
    }
    if(original==reverse){
        System.out.println("Palindrome Number");
    }else{
        System.out.println("Not a Palindrome Number");
    }
}
}


