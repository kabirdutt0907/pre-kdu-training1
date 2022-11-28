import java.io.*;
import java.util.*;
public class exercise3 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        String input_to_CSV = sc.nextLine();
        /*
        * Instead of making a CSV file manually
        * I have created a writer which writes to file ,based on user input.
        * And then calculated the top 3 frequent words.
        * */
        try{
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("sample.csv")
            );
            bw.write(input_to_CSV);
            bw.close();
            BufferedReader br = new BufferedReader(new
                    FileReader("sample.csv")
            );
            String s;
            HashMap<String , Integer> hm = new HashMap<>();
            while((s = br.readLine()) != null){
                String [] words = s.split(", ");
                for(String text : words){
                    if(hm.containsKey(text)){
                        hm.put(text , hm.get(text)+1);
                    }
                    else{
                        hm.put(text , 1);
                    }
                }
            }
            List<String>res = new ArrayList<>(hm.keySet());
            /*
            * Sorting
            * if two words have the same frequency, then the word with the lower alphabetical order comes first.
            * else most frequent words will come first
            * */
            Collections.sort(res , (w1 , w2)->hm.get(w1).equals(hm.get(w2)) ? w1.compareTo(w2) : hm.get(w2) - hm.get(w1));
            /*
            * Output part */
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            System.out.println(res.get(2));




        }
        catch (Exception e){
            return;
        }

    }
}
