class Solution {
    public int[] solution (long n) {
        String numStr = Long.toString(n);
        String rvsnum = new StringBuilder(numStr).reverse().toString();
        int[] rvsArr = new int[rvsnum.length()];
        for (int i = 0; i < rvsnum.length(); i++) {
            rvsArr[i] = Character.getNumericValue(rvsnum.charAt(i));
        }
        return rvsArr;
    }
}