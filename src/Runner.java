public class Runner {
    public static void main(String[] args) {
        System.out.println(helloName("Matt"));
        System.out.println(icyHot(-1, 120));
        int[] x = {1, 1, 2, 3, 1};
        System.out.println(array123(x));
        String y = "slowly";
        System.out.println(endsLy(y));
        int[] a = {1, 2, 3};
        int[] b = {1, 3};
        System.out.println(start1(a, b));
        System.out.println(teenSum(10, 11));
        System.out.println(luckySum(1, 13, 3));
        System.out.println(repeatEnd("hello", 3));
        System.out.println(countTriple("xxxabyyyycd"));
        int[] c = {2, 1, 2, 3, 4};
        System.out.println(countEvens(c));
    }

    public static String helloName(String name) {
        return "hi " + name;
    }


    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            int b = nums[i + 1];
            int c = nums[i + 2];
            if ((a == 1) && (b == 2) && (c == 3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean endsLy(String str) {
        int x = str.length();
        if(x<2){
            return false;
        }
        String y = str.substring(x-2);
        if (y.equals("ly")){
            return true;
        }
        return false;
    }

    public static int start1(int[] a, int[] b){
        int z =0;
        if (a.length>0 && a[0]==1){
            z=z+1;
        }
        if (b.length>0 && b[0]==1){
            z=z+1;
        }
        return z;
    }

    public static int teenSum(int a, int b) {
        if ((a>=13 && a <=19) || (b>=13 && b <=19)){
            return 19;
        }
        int z = a+b;
        return z;
    }

    public static int luckySum(int a, int b, int c) {
        int x = 0;
        if (a==13){
            return x;
        }else{
            x=x+a;
        }
        if (b==13){
            return x;
        }else{
            x=x+b;
        }
        if (c==13){
            return x;
        }else{
            x=x+c;
        }
        return x;
    }

    public  static String repeatEnd(String str, int n) {
        String x = str.substring(str.length()-n);
        String y = "";
        for(int i = 0; i<n;i++){
            y = y+x;
        }
        return y;
    }



    public static int countTriple(String str) {
        int x = 0;
        for(int i = 0; i<str.length()-2;i++){
            if ((str.substring(i,i+1).equals(str.substring(i+1,i+2))) && (str.substring(i+1,i+2).equals(str.substring(i+2,i+3)))){
                x=x+1;
            }
        }
        return x;
    }



    public static int countEvens(int[] nums) {
        int x = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]%2==0){
                x=x+1;
            }
        }
        return x;
    }

    




}