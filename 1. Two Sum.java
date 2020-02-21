

class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        
        int length = nums.length;
        int ans[]=new int[2];
        int count=0,temp=0;
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i=0;i<length;i++){
            hp.put(nums[i],i);
        }
        
        for(int i=0;i<length;i++){
            if(target<0 && nums[i]>=0)
                temp=target-(-1*nums[i]);
            else 
                temp=target-nums[i];
            
            if(hp.containsKey(temp) && target/2==temp){
                for(int j=0;j<length;j++){
                    if(nums[j]==temp){
                        count++;
                        if(count==1)
                           ans[0]=j;
                        if(count==2)
                           ans[1]=j;
                    }
                }
                if(count==2){
                    hp=null;
                    return ans;
                }
            }
            
           else if(hp.containsKey(temp) && (target/2 != temp)){
                ans[0]=i;
                ans[1]=hp.get(temp);
               hp=null;
                return ans;
            } 
            
            else 
                continue;
        }
        hp=null;
        return ans;
    }
}
