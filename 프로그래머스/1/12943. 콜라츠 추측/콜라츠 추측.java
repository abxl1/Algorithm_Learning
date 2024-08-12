class Solution {
    public int solution(long num) {
        int count = 0;

        if (num > 1) {
            while (num != 1) {
//                for (int i = 0; i < 500; i++) {} ->
                    if (num % 2 == 0) {
                        num /= 2; // 18, 14 ...
                    } else {
                        num = num * 3 + 1; // 28, 22 ..
                    }
                    count++;

                    if (count == 500) {
                        count = -1;
                        break;
                    }
            }
        }
        return count;
    }
}