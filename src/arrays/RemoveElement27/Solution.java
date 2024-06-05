package arrays.RemoveElement27;

public class Solution {
    int[] nums;
    int val;

    public int removeElement(int[] nums, int val) {
        int k = 0; // Índice para a próxima posição disponível para armazenar elementos distintos de 'val'

        // Itera sobre os elementos do array 'nums'
        for (int i = 0; i < nums.length; i++) {
            // Se o elemento atual for diferente de 'val'
            if (nums[i] != val) {
                // Move o elemento atual para a próxima posição disponível
                nums[k] = nums[i];
                // Incrementa o índice para a próxima posição disponível
                k++;
            }
        }

        // 'k' representa o novo comprimento do array após a remoção dos elementos 'val'
        return k;
    }
}
