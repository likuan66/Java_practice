package biteHomework.MyHsahMap;

import java.util.HashMap;

public class mostCommonWordPractice {
    public String mostCommonWord(String paragraph, String[] banned){
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:banned){
            map.put(str,0);
        }
        paragraph=paragraph.toLowerCase().replace("[^a-z]"," ");
        String[] words=paragraph.split("\\s+");
        int max=1;
        String result="";
        boolean flag=true;
        for(String str:words){
            if(!map.containsKey((str))){
                map.put(str,1);
                if(flag){
                    flag=false;
                    result=str;
                }
            }else if(map.get(str)!=0){
                int times=map.get(str)+1;
                if(times>max){
                    max=times;
                    result=str;
                }
                map.put(str,times);
            }
        }
        return result;
    }
}
