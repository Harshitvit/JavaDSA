package Backtracking;

public class Permutation {

    public static void FindPermu(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }


        //recusion
        for (int i = 0; i < str.length(); i++) {

            char curr =str.charAt(i);
            String newstr =str.substring(0,i) + str.substring(i+1);
            FindPermu(newstr, ans+curr);


        }
    }
    public static void main(String[] args) {
        String str="abc";
        FindPermu(str, " ");
    }
    
}
