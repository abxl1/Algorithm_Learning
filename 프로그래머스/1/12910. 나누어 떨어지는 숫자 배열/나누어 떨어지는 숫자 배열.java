import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0; // 새 배열의 길이를 정할 카운트 생성
        
        // 새 배열의 길이 카운트 반복문 + 새 배열에 요소를 추가하는 반복문
        
        // arr의 각 ele를 돌면서
        for (int i = 0; i < arr.length; i++) {
            // div로 나누어떨어지는 것이 있다면 count
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        
        // 해당하는 요소를 넣을 배열과 인덱스 생성, 요소가 없다면 -1 담기
        int[] answer;
        int index = 0;
        
        if (count == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[count];
        }
        
        // arr의 각 ele를 돌면서
        for (int i = 0; i < arr.length; i++) {
            // div로 나누어떨어지는 것이 있다면 answer에 요소로 추가
            if (arr[i] % divisor == 0) {
                answer[index] = arr[i];
                index++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}