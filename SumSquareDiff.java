public class SumSquareDiff {
    public static void main(String[] args){
        long a = 0L;
        for(int i=1; i<=100;i++){
            a+=i*i;
        }
        System.out.println(25502500-a);
    }
}