package forGit.BitMap;

public class swapTwoNumbers {
    public static void swapBit(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        swapBit(a,b);
    }
}
