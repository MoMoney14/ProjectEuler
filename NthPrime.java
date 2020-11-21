import java.util.*; 

public class NthPrime {
    public static void main(String[] args){
        LinkedList<Long> list = new LinkedList<Long>();
        long number = 15L;
        int numPrimes = 6;
        //list.add(2L);
        list.add(3L);
        list.add(5L);
        list.add(7L);
        list.add(11L);
        list.add(13L);
        boolean divisible = false;
        boolean foundPrime = false;
        while(true){
            for(int i=0; i<list.size(); i++){
                if(number%list.get(i)==0){
                    divisible = true;
                    break;
                } 
                if(i == list.size()-1){
                    divisible = false;
                }
            }
            if(!divisible){
                numPrimes++;
                list.add(number);
                if(numPrimes == 10001){
                    foundPrime = true;
                    break;
                }
                divisible = true;
            }
            if(foundPrime){
                break;
            }
            number+=2;
        }
        System.out.println(list.get(list.size()-1));
    }
}
