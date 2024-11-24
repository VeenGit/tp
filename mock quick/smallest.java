public class smallest {
    public static void main(String[] args)
    {
        int[] arr = {12, 13, 1, 10, 34, 10};
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])   //for eg: min=12 and arr[i]=13. here min<arr[i]. so arr[i] goes to next index ie. arr[i] =1 and min is still 12. here min>arr[i]. so now arr[i] which is 1 becomes the new min  ie min=arr[i] . now next arr[i]=10 and min =1. so min<arr[i]. just like that we go ahead
            {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
