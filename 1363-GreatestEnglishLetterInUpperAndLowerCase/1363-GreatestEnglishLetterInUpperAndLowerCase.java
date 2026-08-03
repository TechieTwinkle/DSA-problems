// Last updated: 04/08/2026, 01:35:49
class Solution {
    public String greatestLetter(String s) 
    {
        char [] arr = s.toCharArray();
        int n = arr.length;
        char greatest = 0;
        for(int i = 0; i<n;i++)
        {
            for(int j = n-1 ;j>=0 ;j--)
            {
                if(Character.toLowerCase(arr[i]) == Character.toLowerCase(arr[j]) && arr[i]!=arr[j])
                {
                    char upper = Character.toUpperCase(arr[i]);
                    if(upper>greatest)
                    {
                        greatest = upper;
                    }
                }
            }
        }
        if(greatest == 0) return "";
        return String.valueOf(greatest);
    }
}