package Array;

public class ArrayUtil{


    public void printArray(int [] arr){
            int n=arr.length;
            System.out.print("Given Array : ");
            for (int i=0;i<n;i++){
                System.out.print(+arr[i]+" ");
            }
            System.out.println();
        }

  


    public int findMisingNumber(int[] arr) {
        //this logic will be based on the number series given
        int n=arr.length +1;
        int sum =n * (n+1) / 2;
        //System.out.println(sum);
        for(int num: arr){
            sum=sum-num;
        }
       // System.out.println(sum);
        return sum;
    }

    public void arrayDemo(){
        int [] arr={1,3,6,8,2,4,7};
        printArray(arr);
        //System.out.println("Missing Number : "+findMisingNumber(arr));
        System.out.println("----------------------------------------");
        printArray(reverseArray(arr));
        System.out.println("----------------------------------------");

    }


    private int[] reverseArray(int[] arr) {
        int start=0,last=arr.length-1;
        System.out.println("start:"+start+"last:"+last);
        while(start<=last){
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            System.out.println("start "+arr[start]+""+"   last:"+arr[last]);
            start++;
            last--;
        }



        return arr;
    }




    public static void main(String []args){
        ArrayUtil arrutil =new ArrayUtil();
        arrutil.arrayDemo();


    }
}