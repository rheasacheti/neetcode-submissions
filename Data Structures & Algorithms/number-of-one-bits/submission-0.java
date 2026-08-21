class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            //System.out.println(n%10);
            count += n % 2;
            //System.out.println("count "+count);
            n = n >> 1;
            System.out.println("n "+n);
        }
        return count;
    }
}
