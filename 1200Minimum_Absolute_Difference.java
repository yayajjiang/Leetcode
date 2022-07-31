class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int min = Math.abs(arr[0] - arr[1]);
        // for(int i = 0; i<arr.length; i++){
        //     for(int j = i+1; j<arr.length; j++){
        //         if(min > Math.abs(arr[i] - arr[j])){
        //             min = Math.abs(arr[i] - arr[j]);
        //         }
        //     }
        // }
        Arrays.sort(arr);
        for(int i = 1; i<arr.length; i++){
            if(min > Math.abs(arr[i] - arr[i-1])){
                    min = Math.abs(arr[i] - arr[i-1]);
            }
        }
        List<List<Integer>> temp = new LinkedList<>() ;
        List<Integer> list = new LinkedList<>();
        for(int i = 1; i<arr.length; i++){
        
            list = new LinkedList<>();
            if(Math.abs(arr[i] - arr[i-1]) == min){
                list.add(arr[i-1]);
                list.add(arr[i]);
                temp.add(list);
            }
            
        

        }
        return temp;
    }
}
