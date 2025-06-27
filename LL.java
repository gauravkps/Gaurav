import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LL {
    public static void main(String[] args) {
//     Integer a=100;
//     Integer b=100;
//     Integer c=400;
//     Integer d=400;
//     System.out.println(a==b);
//     System.out.println(a.equals(b));
//     System.out.println(c.equals(d));
//
//     System.out.println(c==d);

//     HashMap<String,Integer> hs =new HashMap<>();
//     hs.put("Gaurav",47000);
//     hs.put("Vivek",18000);
//     System.out.println(hs.getOrDefault("Gaurav",50000));

        String filePath = "C:\\Users\\gara0322\\Downloads/rbresync-service.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Process the line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
