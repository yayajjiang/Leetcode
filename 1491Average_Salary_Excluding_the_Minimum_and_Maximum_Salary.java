class Solution {
    public double average(int[] salary) {
        int min= salary[0];
        int max = salary[0];
        int total = 0;
        for(int i : salary){
            total += i;
            if(i<min){
                min = i;
            }
            if(i>max){
                max = i;
            }
        }
        return (double)(total-min-max)/(salary.length - 2);
        
    }
}
