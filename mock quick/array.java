public class array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = arr[0];
        for(int num:arr)
        {
            if(num>max) max=num;
        }
        System.out.println("Max in array: " + max);
    }
}