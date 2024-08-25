package Arrays;

public class targetsum {
    public static void sum(int arr[],int target){
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("target sum 7 with these arr"+"("+arr[i]+","+arr[j]+")");
                    count++;
                }
            }
            
        }
        System.out.println(count);

    }
    public static void main(String args[]){
        int arr[]={4,6,3,5,8,2};
        int target =7;
        sum(arr, target);

    }
    
}
