import java.util.*; 

class LargestPrimeFactor {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        long number = 600851475143L;
        long total = 1;
        int i=8;
        while(true){
            if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                if(number%(long)i==0){
                    list.add(i);
                    total *= i;
                    if(total == number){
                        break;
                    }
                }
            } 
            i++;
        }
        int largestPrimeNum = list.getLast();
        System.out.println(largestPrimeNum);
    }
}