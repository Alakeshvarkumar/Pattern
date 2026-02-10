class StringScore {
    public int scoreOfString(String s) {
        int sum =0;
        // int l = 0, r=1;
        char[] arr = s.toCharArray();
        for(int i =0;i<arr.length-1;i++){
            
            sum+=Math.abs(arr[i]-arr[i+1]);;
        }
        return sum;
    }
}