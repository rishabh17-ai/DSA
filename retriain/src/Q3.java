public class Q3 {
    static boolean solve(String s1 , String s2){
        boolean a = s1.equalsIgnoreCase(s2);
        if(a == true){
            return true;
        }
        else{


        return false;
    }
    }
    public static void main(String []args){
        String s1 = "Java";
        String s2 = "jaVa";
        boolean ans = solve(s1,s2);
        if(ans == true){
            System.out.print("same");
        }
        else{
            System.out.print("different");
        }
    }
}
