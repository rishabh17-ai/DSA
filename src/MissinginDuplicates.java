import java.util.ArrayList;

public class MissinginDuplicates {

    static ArrayList<Integer> missing(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;

        for (int index = 0; index < n; index++) {

            int value = Math.abs(arr[index]);
            int position = value - 1;

            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 4, 5, 3, 2, 6};

        ArrayList<Integer> ans = missing(arr);

        System.out.println(ans);
    }
}