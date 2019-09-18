package Arrays;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int arrayNumbers[]={1,2,4,5,6,8,10,7};
        int halflengh= arrayNumbers.length/2;
        int splitarray1[]= new int[halflengh];
        int splitArray2[]= new int [arrayNumbers.length-halflengh];
        for (int i=0; i<halflengh;i++) {
            splitarray1[i]=arrayNumbers[i];
        }
        for (int j =0; j < splitArray2.length; j++) {
            splitArray2[j]= arrayNumbers[j+halflengh];
        }
        System.out.println(Arrays.toString(splitarray1));
        System.out.println(Arrays.toString(splitArray2));


        String a = "ali";
        String sub = a.substring(a.length()-2,a.length());
        System.out.println(sub);

    }
}
