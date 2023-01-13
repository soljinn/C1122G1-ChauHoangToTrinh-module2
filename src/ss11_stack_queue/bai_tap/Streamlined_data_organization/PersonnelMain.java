package ss11_stack_queue.bai_tap.Streamlined_data_organization;

import java.time.LocalDate;
import java.util.*;

public class PersonnelMain {
    public static void main(String[] args) {
        List<personnel> personnelList = new ArrayList<>();
        Queue<personnel> NAM = new LinkedList<>();
        Queue<personnel> NU = new LinkedList<>();

        personnelList.add(new personnel("Trinh","NU", LocalDate.of(1997,05,31), "Tester"));
        personnelList.add(new personnel("Trinh","NU", LocalDate.of(1997,05,31), "Tester"));
        personnelList.add(new personnel("Trinh","NU", LocalDate.of(1997,05,31), "Tester"));
        personnelList.add(new personnel("Trinh","NU", LocalDate.of(1997,05,31), "Tester"));
        //Collections.sort(personnelList,);
    }
}
