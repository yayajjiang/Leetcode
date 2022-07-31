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

//python
// class Solution:
//     def average(self, salary: List[int]) -> float:
//         return ((sum(salary)-max(salary)-min(salary))/(len(salary)-2))
