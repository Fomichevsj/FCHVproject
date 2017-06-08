/**
 * Created by safomichev on 01.06.2017.
 */
public class ClassB extends BaseClassA {
    public String BirthDate;
    public Integer j;

    ClassB() {
        System.out.println("Default constructor of ClassB");
    }
    ClassB(String BirhDate) {
        System.out.println("string consturctor of ClassB");
        this.BirthDate = new String(BirhDate);
    }
    ClassB(Integer j) {
        System.out.println("int consturctor of ClassB");
        this.j = new Integer(j);
    }
    ClassB(String BirhDate, Integer j) {
        System.out.println("both consturctor of ClassB");
        this.BirthDate = new String(BirhDate);
        this.j = new Integer(j);
    }
    public void someEvent() {
        System.out.println("Function of ClassB");
    }
}
