import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment4 {
    public static void main(String[] args) {
        Map<String, List<String>> athletes = new HashMap<>();
        athletes.put("Badminton", Arrays.asList("Riko", "Andi", "Zahra", "Bella", "Dimas"));
        athletes.put("Table Tennis", Arrays.asList("Lina", "Ardi", "Nina", "Budi", "Citra"));
        athletes.put("Basketball", Arrays.asList("Toni", "Rina", "Gilang", "Fajar", "Eka"));
        athletes.put("Volleyball", Arrays.asList("Sinta", "Yoga", "Dewi", "Bayu", "Hana"));

        for (String sport : athletes.keySet()) {
            List<String> names = new ArrayList<>(athletes.get(sport));
            Collections.sort(names);
            System.out.println(sport + ": " + String.join(", ", names));
        }
    }


}