package List_02;
import java.util.List;

class Employee{
    public int id;
    public int importance;
    public List<Integer> subordinates;
}
public class Importance {
    public int getImportance(List<Employee> employees, int id) {
        for (Employee e: employees) {
            if (e.id == id) {
                if (e.subordinates.size() == 0) {  // 没有子结点
                    return e.importance;
                }
                for (int subId: e.subordinates) {
                    e.importance += getImportance(employees, subId);
                }
                return e.importance;
            }
        }
        return 0;
    }
}
