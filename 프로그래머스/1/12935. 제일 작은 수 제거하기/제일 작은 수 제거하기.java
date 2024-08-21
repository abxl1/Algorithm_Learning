class Solution {
    public int[] solution(int[] arr) {

        if (arr.length != 1) { // arr가 길이가 2 이상인 배열이었다면
            
            // 첫 번째 요소를 기준으로
            int minValue = arr[0];

            // 두 번째 요소부터 체크하며 가장 작은 값을 발견하면 minValue에 저장
            for (int i = 1; i < arr.length; i++) {
                if (minValue > arr[i]) minValue = arr[i];
            }

            // 최소 요소를 뺀 길이의 새 배열, 그 배열의 인덱스
            int[] newArr = new int[arr.length - 1];
            int index = 0;
            
// boolean rmvd = false; 
// -> 배열에 중복된 값이 없음, 최솟값은 한 번만 삭제됨 -> 삭제 유무 체크 필요없음

            // 최솟값이 빠진 이후의 arr 요소들을 newArr에 추가
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != minValue) newArr[index++] = arr[i];
            }
            return newArr;
        } else { // arr가 길이가 1인 배열이었다면
            return new int[]{-1}; // 요소가 -1 하나인 새 배열 반환
        }
    }
}