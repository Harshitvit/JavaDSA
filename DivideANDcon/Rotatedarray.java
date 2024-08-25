package DivideANDcon;

public class Rotatedarray {
    public static void main(String[] args) {
        int arr[] ={6,7,8,9,0,1,2};
        int tar=0;
        System.out.println(search(arr, tar, 0, arr.length));
    }

    public static int search(int arr[] ,int tar , int si , int ei){
        // base case
        if(si>ei){
            return -1;
        }

        //kamm
        int mid  = si+ (ei-si)/2; //(si+ei)/2

        //case found 
        if(arr[mid]==tar){
            return mid;
        }

        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a : left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid-1);
            }
            else{
                //cae b : right
                return search(arr, tar, mid+1, ei);
            }
        }
        // mid on L2
        else{
            //case c :right
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
             // case d ; left

            else{
                return search(arr, tar, si, mid-1);
              
            }

        }
    }
    
}
