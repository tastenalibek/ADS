import java.util.Scanner;

public class ADS{
    public static Scanner sc = new Scanner(System.in);

    public static int printMinimum(int n , int min) {

        if(n == 0){
            return min;
        }
        int a = sc.nextInt();
        if(a < min){
            min = a;
        }
        return printMinimum(n-1, min);
    }
    public static void task1() {// complexity O(n)
        int n = sc.nextInt();
        System.out.println(printMinimum(n, Integer.MAX_VALUE));
    }
    private static double printAvarage(int n , double sum , int k){ // complexity O(n)

        if(n == 0){
            return sum / k;
        }

        int a = sc.nextInt();

        sum += a;

        return printAvarage(n-1, sum , k);

    }

    public static double printAvarage(int n) {
        int sum = 0;
        int z = n;
        return printAvarage(n, sum , z);
    }
    public static void task2() { // complexity O(n)
        int n = sc.nextInt();
        System.out.println(printAvarage(n));
    }
    private static boolean isPrimeRec(int n , int lim , int i) { // complexity O(sqrt(n))
        if(n == 1){
            return false;
        }
        if(i > lim){
            return true;
        }
        if(n % i == 0){
            return false;
        }
        return isPrimeRec(n, lim, i+1);

    }

    public static String isPrimeRec(int n) {
        if(n == 1){
            return "Composite";
        }

        return isPrimeRec(n, (int)Math.sqrt(n), 2)? "Prime" : "Composite";
    }
    public static void task3() {// complexity O(sqrt(n))
        int n = sc.nextInt();
        System.out.println(isPrimeRec(n));
    }

    public static int facorial(int n) {
        if(n == 1){
            return 1;
        }

        return n * facorial(n-1);
    }
    public static void task4() {//complexity O(n
        int n = sc.nextInt();
        System.out.println(facorial(n));
    }
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 2) + fibonacci(n - 1);
    }
    public static void task5() {//complexity O(2^n)
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
    private static int nM(int n , int m , int s) {
        if(m == 0){
            return s;
        }
        s *= n;
        return nM(n, m-1,s);
    }

    public static int nM(int n , int m){
        int s = 1;
        return nM(n, m,s);
    }
    public static void task6() {//complexity O(m
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(nM(n, m));
    }


    public static String swap(String str, int i, int j) {
        StringBuilder sp = new StringBuilder(str);
        sp.setCharAt(i, str.charAt(j));
        sp.setCharAt(j, str.charAt(i));
        return sp.toString();
    }
    private static void allPerm(String s , int i) {
        if(i == s.length()){
            System.out.println(s);
            return;
        }

        for(int j=i;j<s.length();j++){
            s = swap(s, i, j);
            allPerm(s, i+1);
            s = swap(s, i, j);
        }

    }

    public static void allPerm(String s) {
        allPerm(s, 0);
    }
    public static void task7() {//complexity O(n!)
        String s = sc.next();
        allPerm(s);
    }

    private static boolean Digits(String s , int i){

        if(i == s.length()){
            return true;
        }
        if(s.charAt(i) < '0' || s.charAt(i) > '9'){
            return false;
        }
        return Digits(s, i+1);
    }

    public static String Digits(String s) {
        return Digits(s, 0)? "Yes" : "No";
    }
    public static void task8() {//complexity O(M)
        String s = sc.next();
        System.out.println(Digits(s));
    }

    public static int bCoef(int n ,  int k) {
        if(k == 0 || k == n){
            return 1;
        }

        return bCoef(n-1, k-1) + bCoef(n-1, k);
    }
    public static void task9() {//complexity O(n)
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(bCoef(n, k));
    }
    public static int GCD(int n , int m) {
        if(m == 0){
            return n;
        }
        return GCD(m, n % m);
    }
    public static void task10() {//complexity O(log(n))
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(GCD(n, m));
    }

    public static void main(String[] args) {
        task10();
    }
}