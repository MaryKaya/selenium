package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(reverseWord());

    }
    public static String reverseWord(){
        String word= "ANNa";
        String reversed="";
        for (int i=word.length()-1; i>=0;i--){
            reversed+=word.charAt(i);
        }
        return reversed;
    }
}
