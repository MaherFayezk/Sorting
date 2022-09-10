import java.util.Arrays;

class MergeSort {
    public int[] mergeSort(int[] nums) {

        if (nums.length == 1) {
            return nums;
        }
        int numsLength = nums.length;
        int middle = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, middle);
        int[] right = Arrays.copyOfRange(nums, middle, numsLength);
        return merge(mergeSort(left), mergeSort(right));

    }

    private int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];
        int rightIndex = 0, leftIndex = 0;
        while (rightIndex < right.length || leftIndex < left.length) {
            if (rightIndex < right.length && leftIndex < left.length) {
                if (right[rightIndex] < left[leftIndex]) {
                    sorted[rightIndex + leftIndex] = right[rightIndex];
                    rightIndex++;
                } else {
                    sorted[rightIndex + leftIndex] = left[leftIndex];
                    leftIndex++;
                }
            } else {
                if (rightIndex < right.length) {
                    sorted[rightIndex + leftIndex] = right[rightIndex];
                    rightIndex++;
                } else if (leftIndex < left.length) {
                    sorted[rightIndex + leftIndex] = left[leftIndex];
                    leftIndex++;
                }
            }

        }

        return sorted;

    }
}