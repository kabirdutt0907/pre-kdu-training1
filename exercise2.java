import java.util.*;

public class exercise2 {

    public static void main(String [] args){

        List<String> lt = new ArrayList<>();
        HashSet<String>ht = new HashSet<>();
        HashMap<String , Integer> mp = new HashMap<String , Integer>();
        for(int i = 0 ; i < 10 ; ++i){
            Scanner sc = new Scanner(System.in);
            String s1 = sc.nextLine();
            lt.add(s1);
            ht.add(s1);
            if(mp.containsKey(s1)) {
                mp.put(s1, mp.get(s1) + 1);
            }
            else{
                mp.put(s1, 1);
            }
        }
        System.out.println("");
        System.out.println("List Contains:");
        for(String s : lt){
            System.out.println(s);
        }
        System.out.println("");
        System.out.println("Set Contains:");
        for(String s : ht){
            System.out.println(s);
        }
        System.out.println("");
        System.out.println("Frequency of the words:");

        mp.forEach((k , v) -> System.out.println("Word = " +k + ", Frequency = " +v));
    }
}
