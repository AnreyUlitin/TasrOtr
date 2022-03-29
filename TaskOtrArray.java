public class TaskOtrArray {
    public static void main(String[] args) {

        int[] nums = {1, 16, 0, 32, -1, 0, 0, 5, 69, 100};// {1, 16, 32, -1, 5, 69, 100, 0, 0, 0}

        System.out.print("\nНачальный массив: \n");
        for (int n : nums)
            System.out.print(n + "  ");

        int i = 0;
        for (int j = 0, l = nums.length; j < l; ) {
            if (nums[j] == 0)
                j++;
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        while (i < nums.length)
            nums[i++] = 0;

        System.out.print("\nПосле перемещения нулей в конец массива: \n");
        for (int n : nums)
            System.out.print(n + "  ");
        System.out.print("\n");
    }
}






