class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length ; i++) { // seoul 배열을 돌면서
            if (seoul[i].equals("Kim")) { // "Kim" 스트링과 일치 검사
            // 인덱스를 포함한 문장 "김서방은 "+i+"에 있다" 저장
                answer = "김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }
}