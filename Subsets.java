class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        createSubset(nums,0,ans,subset);
        return ans;
    }

    void createSubset(int[] nums, int i, List<List<Integer>> ans, List<Integer> subset)
    {
        if(i==nums.length)
        {
         ans.add(new ArrayList<>(subset) );   
         return;
        }

        subset.add(nums[i]);
        createSubset(nums,i+1,ans,subset);
        subset.remove(subset.size()-1);
        createSubset(nums,i+1,ans,subset);

    }
}

/*

[1,2,3]

ans ={}
subset ={}
i = 0;
nums = 1,2,3

_________________________

i = 0
subset = 1
createSubset(nums,i+1,ans,subset) -- i

return came.
i=1
subset = 1,2
createSubset(nums,i+1,ans,subset) -- ii
ans = {1,2,3},{1,2}



i = 1
subset = 1,2
createSubset(nums,i+1,ans,subset)


i = 2
subset = 1,2,3
createSubset(nums,i+1,ans,subset)
returns to i
_________________________




*/
