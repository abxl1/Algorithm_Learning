class Solution {
    public String solution(String s) {

        // 문자열의 길이의 절반 저장
        int len = s.length() / 2;


        // len이 짝수인 경우 / 홀수인 경우
        if (s.length() % 2 == 0) {

            // subString() -> 문자열의 원하는 위치 파악 가능
            return s.substring(len - 1, len + 1);
        } else {
            return s.substring(len, len + 1);
        }
    }
}