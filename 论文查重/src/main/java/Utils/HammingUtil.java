package Utils;

public class HammingUtil {
   /**
    * Description:  通过比较simHash1和simHash2的每一位数是否相同计算两组数据的海明距离，从而判断两组数据的相似程度
    * date: 2024/9/10
    * @param simHash1
    * @param simHash2
    * @author: cjx
    * @return  返回海明距离
    */
   public static int getHammingDistance(String simHash1, String simHash2){
       if(simHash1.length()!=simHash2.length())
           return -1;
       int distance=0;
       System.out.println("str1的simHash值："+simHash1);
       System.out.println("str2的simHash值："+simHash2);
       for (int i=0;i<simHash1.length();i++){
           if(simHash1.charAt(i)!=simHash2.charAt(i))
               distance++;

       }
       System.out.println("海明距离为："+distance);
       return distance;
   }

   public static double getSimilarity(int distance){

       return 1-distance/128.0;
   }

}
