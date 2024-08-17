class Solution {
    public int solution(long num) { // num의 연산 중 int의 범위를 넘어서는 케이스가 있음
        int count = 0;

        if (num > 1) { // num이 1일 때 count 초기화 상태로 그대로 출력
            while (num != 1) { // num이 1이 되면 while을 벗어남!!!!!!!!!!
                    if (num % 2 == 0) {
                        num /= 2;
                    } else {
                        num = num * 3 + 1;
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