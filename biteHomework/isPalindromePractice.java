package day05;

public class isPalindromePractice {
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String s) {
        if(s==null){
            return true;
        }
        s=s.toLowerCase();//将字符串中的字符全部转换为小写
        int len=s.length();
        StringBuilder str = new StringBuilder(len);
        for(char c:s.toCharArray()){
            if((c>='0'&&c<='9')||(c>='a'&&c<='z')){
                str.append(c);
            }
        }
        return str.toString().equals(str.reverse().toString());//reverse（）方法是逆置数组中的元素

    }
}
