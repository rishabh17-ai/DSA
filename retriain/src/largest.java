public class largest {
    static int solve(int []arr ){
        int min = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return   min;
    }

    public static void main(StringPractice[]args){
        int []arr = {1,-1,3,0,5};

          int  ans = solve(arr);
        System.out.println(ans);

    }
}
