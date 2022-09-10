public class QuickSort {
    public int[] sortArray(int[] nums) {
        if(nums==null|| nums.length==0){
            return nums;
        }
        quickSort(nums,0,nums.length-1);
        
        return nums;
    }
    
    private void quickSort(int[]nums,int start, int end){
        if(start<end) {
            int pivote=partition(nums,start,end);
            quickSort(nums,start,pivote-1);
            quickSort(nums,pivote+1,end);
        }
    }
    
    private int partition(int[]nums,int start, int end){
       int pivote=end;
        int j=start-1;
        for(int i=0;i<end;i++){
            if(nums[i]>=nums[pivote]){
                j++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
        return j;
    } 
}
