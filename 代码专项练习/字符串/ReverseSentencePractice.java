package 代码专项练习.字符串;

//牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
// 同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
// 例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
// 正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
public class ReverseSentencePractice {
    public String ReverseSentence(String str) {
        if(str.length()==0){
            return str;
        }
        char[] ch=str.toCharArray();
        int len=str.length();
        int i=0;
        int j=0;
        while(i<len){
            while(i<len&&ch[i]!=' '){//一直遍历知道第一个空格出现
                i++;
            }
            ReverseString(ch,j,i-1);//当上面while循环执行完了之后，i多加了一次，所以是i-1
            while(i<len&&ch[i]==' '){//此处可能有多个空格，找到下个字符出现的索引
                i++;
            }
            j=i;
        }
        //结束循环的条件是i=len，最后一个有效的字符串没有被逆置
        ReverseString(ch,j,i-1);
        //整体进行逆置
        ReverseString(ch,0,i-1);
        return new String(ch);
    }

    private void ReverseString(char[] ch, int j, int i) {
        while(j<i){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            j++;
            i--;
        }
    }
}
