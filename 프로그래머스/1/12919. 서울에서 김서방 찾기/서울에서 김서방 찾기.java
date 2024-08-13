class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        // seoul 배열을 돌면서
        for (int i = 0; i < seoul.length ; i++) {
            // "Kim" 스트링이 있는지,
            if (seoul[i].equals("Kim")) {
                // 있다면 위치한 인덱스 i 출력
                answer = "김서방은 "+i+"에 있다";
            }
        }        
        // 인덱스를 포함한 문장 return "김서방은 "+i+"에 있다" 출력
        return answer;
    }
}