import java.util.*;

class sortByColor {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter length of Array: ");
        int N = sc.nextInt();
        System.out.println();
        System.out.println("Array values: ");
        int arr[] = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        int[] ans = sortMethod(arr);
        for (int i=0; i<N; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    public static int[] sortMethod (int[] A) {
        int left = 0, curr = 0, right = A.length-1;
        while (curr <= right) {
            if (A[curr] == 0) {
                swap (A, curr++, left++);
            }
            else if (A[curr] == 2) {
                swap (A, curr, right--);
            }
            else curr++;
        }
        return A;
    }

    public static void swap (int[] A, int ptr1, int ptr2) {
        int temp = A[ptr1];
        A[ptr1] = A[ptr2];
        A[ptr2] = temp; 
    }
}