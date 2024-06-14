package DSARelatedCodes;
import java.util.*;
public class NextGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        Stack<Long> st = new Stack<>();
        long[] result = new long[n]; // Create a result array to store the answers

        for (int i = n - 1; i >= 0; i--) {
            // Remove elements from stack that are less than or equal to the current element
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }

            // If stack is empty, no greater element to the right
            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }

            // Push the current element onto the stack
            st.push(arr[i]);
        }

        return result;
    }
    public static void main(String[] args) {
        long[] n = {1,3,2,4};
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(nextLargerElement(n, n.length)));

    }
}
