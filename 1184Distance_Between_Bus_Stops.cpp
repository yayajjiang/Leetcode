class Solution {
public:
    int distanceBetweenBusStops(vector<int>& distance, int start, int destination) {
        int total = 0;
        int sum = 0;
        if(destination < start) swap(start,destination);//take this situation into consideration
        for(int i = 0; i < distance.size(); i++){
            total += distance[i];
        }
        for(int i = start; i < destination; i++){
            sum += distance[i];
        }
        //std::cout<<sum<<endl;
        //std::cout<<total;
//         if(sum < total-sum) return sum;
//         else{
//             return total - sum;
//         }
        return min(sum, total - sum);
    }
};
