import java.util.*; 

class EvenFibonnaciNums {
    public static void main(String[] args){        
        LinkedList<Integer> list = new LinkedList<Integer>(); 
        list.add(1);
        list.add(2);
        int total = 0;
        while(true){
            int firstElement = list.get(0);
            int secondElement = list.get(1);
            if(secondElement % 2 == 0){
                if(secondElement > 4000000){
                    break;
                }
                total+=secondElement;
            }

            list.remove();
            int thirdElement = firstElement + secondElement;
            list.addLast(thirdElement);
        }   
        System.out.println(total);
    }
}