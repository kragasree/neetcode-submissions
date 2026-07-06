class Solution {
    public int findDuplicate(int[] nums) {
        //floyds cycle detection
        int slow = nums[0];
        int fast = nums[0];

        slow = nums[slow];
        fast = nums[nums[fast]];
        
        while (slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        } 

        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;    

        //TC: O(n)
        //SC: O(1)    
        //Here same assume like the linkedlist prblm. 
        //If u see when we turn the array to linkedlist, somewhere in between we can find a meeting point.
        //The meeting point will be like 2 indices will point to a same number, when we see this situation we can stop the loop.
        //Next we will try to find the duplicate number
    }
}
