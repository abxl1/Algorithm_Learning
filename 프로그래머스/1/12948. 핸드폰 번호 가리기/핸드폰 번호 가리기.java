import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {
        // phonenum을 1자리씩 슬라이스한 배열 생성
        String [] phone_arr = phone_number.split("");
        
        // phone_arr를 도는 for loof
        for (int i = 0; i < phone_arr.length; i++) {
            
            // 마지막에서 4개 요소만 그대로 출력, 이전까지 *로 출력
            if (i < phone_arr.length - 4) {
                phone_arr[i] = "*";
            }
        }    
        // String 배열을 String으로 변환
        String result = String.join("", phone_arr);
        return result;
    }
}