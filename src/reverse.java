import java.util.Arrays;

public class reverse {
    public static void main(String []args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;
int left = 0;
int right = n-1;
while(left < right) {
    int temp = a[left];
    a[left] = a[right];
    a[right] = temp;

    left++;
    right--;
}

            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }

        }
    }
