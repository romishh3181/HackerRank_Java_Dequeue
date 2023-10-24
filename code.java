    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int maxintegers=0;
            Set<Integer> uniqueIntegers=new HashSet<>();

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               deque.add(num);
               uniqueIntegers.add(num);
               if(deque.size()==m){
                   if(uniqueIntegers.size()>maxintegers){
                       maxintegers=uniqueIntegers.size();
                   }
                   int removed=(int)deque.removeFirst();
                   if(!deque.contains(removed)){
                       uniqueIntegers.remove(removed);
                   }
               }
            }
            System.out.println(maxintegers);
        }
    }



