class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int num = 0;
        int max = 0;
        int box = 0;
        Arrays.sort(boxTypes, (a, b) -> b[1] -a[1]);
        for(int i = 0; i<boxTypes.length; i++){
            //System.out.println(boxTypes[i][0]);
            if(truckSize >= boxTypes[i][0]){
                //System.out.println(truckSize);
                truckSize -= boxTypes[i][0];
                num += boxTypes[i][1] * boxTypes[i][0];
                //boxTypes[box][0] = 0;
                //boxTypes[box][1] = 0;
            }else{
                num += truckSize * boxTypes[i][1];
                //truckSize = 0;
                break;
            }
            //System.out.println(num);
        }
        return num;
    }
}
