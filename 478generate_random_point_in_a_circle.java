//1 极坐标解 polar coordinate system

import java.util.Random;

class Solution {
    
    double radius;
    double x_center;
    double y_center;
    //needs to have a new random variable to get random value
    Random rand = new Random();

    //constructor, 
    public Solution(double radius, double x_center, double y_center) {
        this.radius = radius;
        this.x_center = x_center;
        this.y_center = y_center;
    }
    
    public double[] randPoint() {
        //get random //因为是面积微分的随机，不是半径微分的随机,半径越小，越密...
        double r = Math.sqrt(rand.nextDouble(radius * radius));

        //get random theta, from 0 to 2pi
        double rad = rand.nextDouble() * 2 * Math.PI;
        //start from the center, add rcos, rsin
        double x = x_center + r * Math.cos(rad);
        double y = y_center + r * Math.sin(rad);
        
        return new double[]{x,y};
    }
    
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */




 //2 拒绝采样，reject sampling, get points from a square, and refuse the points not in the circle
//  class Solution {
//     Random random;
//     double xc, yc, r;

//     public Solution(double radius, double x_center, double y_center) {
//         random = new Random();
//         xc = x_center;
//         yc = y_center;
//         r = radius;
//     }
    
//     public double[] randPoint() {
//         while (true) {
//             double x = random.nextDouble() * (2 * r) - r;
//             double y = random.nextDouble() * (2 * r) - r;
//             if (x * x + y * y <= r * r) {
//                 return new double[]{xc + x, yc + y};
//             }
//         }
//     }
// }

// 作者：LeetCode-Solution
// 链接：https://leetcode.cn/problems/generate-random-point-in-a-circle/solution/zai-yuan-nei-sui-ji-sheng-cheng-dian-by-qp342/
// 来源：力扣（LeetCode）
// 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。



//random
//public int nextInt(int bound)
//[0, bound)
//public double nextDouble()
//[0.0, 1,0)