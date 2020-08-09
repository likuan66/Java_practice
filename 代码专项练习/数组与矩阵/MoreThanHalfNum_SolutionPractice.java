package 代码专项练习.数组与矩阵;

/*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
超过数组长度的一半，因此输出2。如果不存在则输出0
 */
public class MoreThanHalfNum_SolutionPractice {
    //方法一：如果次数超过数组的一半，则给数组排完序之后，中间位置肯定就是数
//    public int MoreThanHalfNum_Solution(int [] array) {
//        if(array.length==0){
//            return 0;
//        }
//        Arrays.sort(array);
//        int temp=array[array.length/2];
//        int count=0;
//        for(int i=0;i<array.length;i++){
//            if(array[i]==temp){
//                count++;
//            }
//        }
//        if(count>array.length/2){
//            return temp;
//        }else{
//            return 0;
//        }
//    }
        //方法二：利用hashmap统计次数
//        public int MoreThanHalfNum_Solution(int [] array){
//            if(array==null){
//                return 0;
//            }
//            Map<Integer,Integer> map=new HashMap<>();
//            for(int i=0;i<array.length;i++){
//                if(map.containsKey(array[i])){
//                    int count=map.get(array[i]);
//                    count++;
//                    map.put(array[i],count);
//                }else{
//                    map.put(array[i],1);
//                }
//                if(map.get(array[i])>array.length/2){
//                    return array[i];
//                }
//            }
//            return 0;
//        }
    /*
    目标条件：目标数据超过数组长度的一半，那么对数组，我们同时去掉两个不同的数字，
    到最后剩下的一个数就是 该数字。如果剩下两个，那么这两个也是一样的，就是结果），
    在其基础上把最后剩下的一个数字或者两个回到原来数组中， 将数组遍历一遍统计一下数字出现次数进行最终判断
     */
    public int MoreThanHalfNum_Solution(int [] array){
        if(array==null){
            return 0;
        }
        int temp=array[0];
        int time=1;
        for(int i=1;i<array.length;i++){
            if(time==0){
                temp=array[i];
                time++;
            }else if(array[i]==temp){
                time++;
            }else{
                time--;
            }
        }
        time=0;
        for(int i=0;i<array.length;i++){
            if(temp==array[i]){
                time++;
            }
        }
        if(time>array.length/2){
            return temp;
        }
        return 0;
    }
}
