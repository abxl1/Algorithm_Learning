class Solution {
    public boolean solution(int x) {
        
        // Integer.toString(x).split("") -> x를 string으로 변환, 한 자리씩 배열 요소로
        // String.valueOf() -> Integer 타입을 String으로 변환
        String[] str = String.valueOf(x).split("");
        int sum = 0;
        
        // 배열의 요소를 돌면서 str[0] + str[1] + ''' + str[i] = sum -> 인덱스 사용
        // 향상된 for문 -> 조건 적용이 없는 배열의 요소(원소값만 필요한 경우)
        for (String i : str) { 
            sum += Integer.parseInt(i);
        }
        
        // x % sum == 0 이면 x는 하샤드 수 true, 아니라면 false
        return x % sum == 0 ? true : false;
    }
}