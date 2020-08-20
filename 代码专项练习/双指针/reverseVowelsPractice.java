package 代码专项练习.双指针;
//编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
public class reverseVowelsPractice {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right&&!isVowel(arr[left])){
                left++;
            }
            while(right>=0&&!isVowel(arr[right])){
                right--;
            }
            if(left>=right){
                break;
            }
            swap(arr,left,right);
            left++;
            right--;
        }
        return new String(arr);
    }

    private void swap(char[] arr, int left, int right) {
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                ||ch=='A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
