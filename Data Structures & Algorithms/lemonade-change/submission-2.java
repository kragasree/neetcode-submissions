class Solution {
    public boolean lemonadeChange(int[] bills) {
        // TC: O(n)
        // SC: O(1)

        int five = 0;
        int ten = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            }
            else if (bills[i] == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            }
            else { // bills[i] == 20
                if (ten > 0 && five > 0) {
                    // Prefer giving $10 + $5
                    ten--;
                    five--;
                }
                else if (five >= 3) {
                    // Otherwise give three $5 bills
                    five -= 3;
                }
                else {
                    return false;
                }
            }
        }

        return true;
    }
}