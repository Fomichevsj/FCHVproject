/**
 * Created by safomichev on 01.06.2017.
 */
public class BaseClassA {

    protected String name;
    protected Integer i;

    BaseClassA() {
        System.out.println("Default constructor of BaseClassA");
    }

    BaseClassA(String name) {
        System.out.println("constructor with param name");
        this.name = new String(name);
    }
    BaseClassA(Integer i) {
        System.out.println("constructor with para int");
        this.i = new Integer(i);
    }
    BaseClassA(String name, Integer i) {
        System.out.println("constructor with both param");
        this.name = new String(name);
        this.i = new Integer(i);
    }
    public String getName() {
        System.out.println("getter for name");
        return this.name;
    }
    public Integer getI() {
        System.out.println("getter for i");
        return this.i;
    }
    public void setName(String name) {
        System.out.println("setter for name");
        this.name = new String(name);
    }
    public void setI(Integer i) {
        System.out.println("setter for i");
        this.i = new Integer(i);
    }
}
