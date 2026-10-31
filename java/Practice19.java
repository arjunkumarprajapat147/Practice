/*
 * Practice 19: HashMap - Student Marks
 * Task: Store student marks in a HashMap and find the topper.
 * Author: Arjun Kumar
 * Run: javac Practice19.java && java Practice19
 */
import java.util.HashMap;
import java.util.Map;

public class Practice19 {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Arjun", 85);
        marks.put("Ravi", 72);
        marks.put("Priya", 91);
        marks.put("Amit", 64);
        String topper = "";
        int best = -1;
        for (Map.Entry<String, Integer> e : marks.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
            if (e.getValue() > best) { best = e.getValue(); topper = e.getKey(); }
        }
        System.out.println("Topper: " + topper + " with " + best);
    }
}
