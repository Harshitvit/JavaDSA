package DivideANDcon;

public class Majorityelemnet {
    public static int major(int arr[]){
        int marjority =arr.length/2;

        //kaam
        for(int i =0;i<arr.length;i++){
            int count =0;

            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
            }
            if(count > marjority){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={2,2,1,1,2,2};
        System.out.println(major(arr));
    }
    
}
