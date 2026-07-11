class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int combined[] = new int[m+n];
        int i=0, j=0, k=0;

        //TC: O(n+m)
        while(i<n && j<m) {
            if(nums1[i] < nums2[j]) {
                combined[k] = nums1[i];
                i++;
                k++;
            } else {
                combined[k] = nums2[j];
                j++;
                k++;               
            }
        }

        //O(n)
        while(i<n) {
            combined[k] = nums1[i];
            i++;
            k++;            
        }

        //O(m)
        while(j<m) {
            combined[k] = nums2[j];
            j++;
            k++;
        }

        int mid = (m+n)/2;

        if((m + n) % 2 == 0) {
            double sum = combined[mid] + combined[mid-1];
            return sum/2;
        } else {
            return combined[mid];
        }

    }

    //TC: O(n+m)+O(n)+O(m) = O(n+m)
    //SC: O(n+m)
}
