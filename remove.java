class remove {
    public int removeElement(int[] nums, int val) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[n]= nums[i];//store the unique element in an array (n)
                n++;
            }
        }
        return n;
}
