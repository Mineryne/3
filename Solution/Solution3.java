//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.
class Solution3 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Проходим по цифрам справа налево
        for (int i = n - 1; i >= 0; i--) {
            // Увеличиваем текущую цифру на 1
            digits[i]++;

            // Если текущая цифра после увеличения не превышает 9, возвращаем массив digits
            if (digits[i] <= 9) {
                return digits;
            } else {
                // Если текущая цифра стала 10 (была 9), то она должна стать 0
                digits[i] = 0;
            }
        }

        // Если все цифры были 9, добавляем один элемент и делаем его равным 1
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] digits = {9, 9, 9};
        int[] result = solution3.plusOne(digits);

        System.out.print("Результат увеличения на единицу: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
