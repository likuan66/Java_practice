package biteHomework.TreePractice;

import java.util.Scanner;
import java.util.Stack;

public class BuildTreeDemo {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while(sc.hasNext()){
                char[] ch = sc.nextLine().toCharArray();
                Stack<Character> st = new Stack<>();
                st.push(ch[0]);
                for(int i=1;i<ch.length-1;i++){
                    if(ch[i] == '#'){
                        System.out.print(st.pop()+" ");
                    }else{
                        st.push(ch[i]);
                    }
                }
                System.out.println();
            }
        }
    }
