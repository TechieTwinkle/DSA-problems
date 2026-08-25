// Last updated: 26/08/2026, 01:46:16
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1]-a[1]);
        int units = 0;
        for(int i =0; i<boxTypes.length; i++){
            int boxes = boxTypes[i][0];
            int unitsPerBox = boxTypes[i][1];

            if(boxes <= truckSize){
                units += boxes*unitsPerBox;
                truckSize-=boxes;
            }else{
                units+=truckSize*unitsPerBox;
                truckSize = 0;
            }
            if(truckSize == 0) break;
        }
        return units;
    }
}