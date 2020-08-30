package 算法;

public class MoreThanHalfNum_SolutionPractice {
    //方法一：定义map，使用<数字，次数>的映射关系，最后统计每个字符出现的次数
//    public int MoreThanHalfNum_Solution(int [] array) {
//        if(array==null){
//            return 0;
//        }
//        Map<Integer,Integer> map=new HashMap<>();
//        for(int i=0;i<array.length;i++){
//            if(map.containsKey(array[i])){
//                int count=map.get(array[i]);
//                count++;
//                map.put(array[i],count);
//            }else{
//                map.put(array[i],1);
//            }
//            if(map.get(array[i])>array.length/2){
//                return array[i]
//            }
//        }
//        return 0;
//    }
    //方法二：排序，出现次数最多的数字，一定在中间位置。然后检测中间出现的数字出现的次数是否符合要求
//    public int MoreThanHalfNum_Solution(int [] array){
//        if(array==null){
//            return 0;
//        }
//        Arrays.sort(array);
//        int target=array[array.length/2];
//        int count=0;
//        for(int i=0;i<array.length;i++){
//            if(target==array[i]){
//                count++;
//            }
//        }
//        if(count>array.length/2){
//            return target;
//        }
//        return 0;
//    }
    /*
    方法三：目标数据超过数组长度的一半，那么对数组，我们同时去掉两个不同的数字，
    到最后剩下的一个数就是 该数字。如果剩下两个，那么这两个也是一样的，就是结果），
    在其基础上把最后剩下的一个数字或者两个回到原来数组中， 将数组遍历一遍统计一下数字出现次数进行最终判断。
     */
    public int MoreThanHalfNum_Solution(int [] array){
        if(array==null){
            return 0;
        }
        int target=array[0];
        int time=1;
        for(int i=1;i<array.length;i++){
            if(time==0){
                target=array[i];
                time++;
            }else if(target==array[i]){
                time++;
            }else if(target!=array[i]){
                time--;
            }
        }
        time=0;
        for(int i=0;i<array.length;i++){
            if(target==array[i]){
                time++;
            }
        }
        if(time>array.length/2){
            return target;
        }
        return 0;
    }
}
