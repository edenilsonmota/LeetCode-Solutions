package arrays.RemoveElement27;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int newLength = solution.removeElement(nums, val);

        // Imprime o novo comprimento do array
        System.out.println("Novo comprimento: " + newLength);

        // Imprime os elementos distintos após a remoção
        System.out.print("nums = [");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i]);
            if (i < newLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
