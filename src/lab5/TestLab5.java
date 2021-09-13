package lab5;

public class TestLab5 {
    public static String Zadanie_1(int n){
        int sum=0,v=0;
        if(n==1){
            System.out.print(1);
        }else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                v = i;
            }
            System.out.print(Zadanie_1(n-1) + "," + v);
        }
        return "";
    }
    public static String Zadanie_2(int n){
        if (n==1){
            System.out.print(1);
        }else {
            System.out.print(Zadanie_2(n - 1) + "," + n);
        }
        return "";
    }
    public static String Zadanie_3(int a,int b){
        if(a>b){
            if(a==b){
                return ("" + a);
            }
            return (a + "," + Zadanie_3(a-1,b));
        }else {
            if (a==b) {
                return ("" + a);
            }
            return (a + "," + Zadanie_3(a+1,b));
        }
        //return "";
    }
    public static int Zadanie_5(int n){
        int sum =0;
        if(n<10){
            return n%10;
        }
        sum+=n%10;
        sum+=Zadanie_5(n/10);
        return sum;
    }
    public static void main(String[] args){
        int n=6;
        Zadanie_2(n);

    }
}
