public class MinMax {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int min = arr[0];
        int max = arr[1];

        if(arr[0]>arr[1])
        {
            max = arr[0];
            min = arr[1];
        }
        else{
            max = arr[1];
            min = arr[0];
        }

        if(arr.length == 0) //if there is no element in the array
        {
            System.out.println("Empty array");
        }

        if(arr.length == 1) //if there is only one element in the array
        {
            min = arr[0];
            max = arr[0];
            System.out.println(min);
            System.out.println(max);
        }

        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);


    }
}
