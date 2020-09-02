package 算法;

import java.util.ArrayList;
import java.util.Collections;

public class PrintMinNumberPractice {
    public String PrintMinNumber(int[] numbers) {
        ArrayList<String> result = new ArrayList<>();
        if (numbers != null) {
            PrintWriterHelper(numbers, 0, result);
            Collections.sort(result);
        }
        return result.get(0);
    }

    private void PrintWriterHelper(int[] numbers, int start, ArrayList<String> result) {
        if (start == numbers.length) {
            if (!IsExist(result, numbers)) {
                result.add(IntArraychangeString(numbers));
            }
            //Arrays.toString(numbers);
            return;
        }
        for (int i = 0; i < numbers.length; i++) {
            Swap(numbers, start, i);
            PrintWriterHelper(numbers, start + 1, result);
            Swap(numbers, start, i);
        }
    }

    private boolean IsExist(ArrayList<String> result, int[] numbers) {
        return result.contains(IntArraychangeString(numbers));
    }

    private void Swap(int[] numbers, int x, int y) {
        int temp = numbers[x];
        numbers[x] = numbers[y];
        numbers[y] = temp;
    }

    private String IntArraychangeString(int[] numbers) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < numbers.length; i++) {
            sb.append(numbers[i]);
        }
        return sb.toString();
    }


//    public String PrintMinNumber(int [] numbers){
//        if(numbers==null){
//            return new String();
//        }
//        ArrayList<Integer> list=new ArrayList<>();
//        for(int num:numbers){
//            list.add(num);
//        }
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                String xs=o1+""+o2;
//                String ys=o2+""+o1;
//                return xs.compareTo(ys);
//            }
//        });
//        String result=new String();
//        for(Integer e:list){
//            result+=e;
//        }
//        return result;
//    }
}


