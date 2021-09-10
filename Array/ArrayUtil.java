package Array;

public class ArrayUtil{


    public void printArray(int [] arr){
            int n=arr.length;
            for (int i=0;i<n;i++){
                System.out.print(arr[i]+"");
            }
            System.out.println();
        }

    public void arrayDemo(){
        int [] arr={1,3,6,8,2,7};
        System.out.println(findMisingNumber(arr));
        printArray(arr);
    }


    public int findMisingNumber(int[] arr) {
        //this logic will be based on the number series given
        int n=arr.length +1;
        int sum =n*(n+1)/2;
        for(int num: arr)
        {
            sum=sum-num;
        }

        return sum;
    }
    public static void main(String []args){
        ArrayUtil arrutil =new ArrayUtil();
        arrutil.arrayDemo();


    }
}