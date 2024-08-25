package Backtracking;

public class Findsub {
    public static void FindSubsets(String str,int i,String ans){
        //base case 
        if(i==str.length()){
           // if(ans.length()==0){
             //   System.out.print("null");
           // }else{
                System.out.println(ans);
          //  }
            return;
        }

        // kaamm / recursion
        FindSubsets(str, i+1, ans);
        FindSubsets(str, i+1, ans+str.charAt(i));
    }
    public static void main(String[] args) {
        String str ="abc";
        FindSubsets(str, 0, " ");
    }
    
}
