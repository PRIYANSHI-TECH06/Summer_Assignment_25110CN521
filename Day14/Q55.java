package Day14;

public class Q55 {
    public static void main(String[] args) {

        int arr[] = {12, 45, 67, 23, 89, 54};

        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}
