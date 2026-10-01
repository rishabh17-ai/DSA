public class Q1 {
    public static void main(String []args){
        String s = "ProGrAmMinG";
        int n = s.length();
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            String LowerCase = s.toLowerCase();
            if(LowerCase.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.print(count);
    }
}
