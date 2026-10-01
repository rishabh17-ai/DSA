public class StringPractice {
    public static void main(String[]args){
        String s = "programming";
       int count = 0;

        int n = s.length();
        for(int i = 0 ; i < n ; i++){
//            System.out.println(s.charAt(i));
            if(s.charAt(i) == 'm'){
                count++;

            }

        }
        System.out.print(count);
    }
}
