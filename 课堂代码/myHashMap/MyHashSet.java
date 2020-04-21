package biteHomework.MyHsahMap;

import java.util.Arrays;

public class MyHashSet {
    int[] hashKey;
    int n=20007;
    public MyHashSet() {
        hashKey=new int[n];
        Arrays.fill(hashKey,-1);
    }

    int find(int key){
        int index=key%n;
        while (hashKey[index]!=key&&hashKey[index]!=-1){
            index++;
            if(index==1){
                index=0;
            }
        }
        return index;
    }

    public void add(int key) {
        int index=find(key);
        hashKey[index]=key;
    }

    public void remove(int key) {
        int index=find(key);
        if(hashKey[index]!=-1){
            hashKey[index]=-2;
        }
    }
    public boolean contains(int key) {
        int index=find(key);
        return hashKey[key]>=0;
    }
}
