/**
 * Created by safomichev on 01.06.2017.
 */
public class InvestiagateBaseClassA {
    public static void main(String [] args) {
        System.out.println("Start InvestigateBaseClassA");
        BaseClassA baseClassA = new BaseClassA();
        BaseClassA baseClassA1 = new BaseClassA("Sergey Fomichev");
        BaseClassA baseClassA2 = new BaseClassA(342);
        BaseClassA baseClassA3 = new BaseClassA("Alex", 4243);

        ClassB classB = new ClassB(baseClassA1.getName());
        ClassB classB1 = new ClassB(baseClassA2.getI());

        classB.someEvent();

        BaseClassA baseClassA4 = new ClassB("This is not class A");
        System.out.println(baseClassA4.getName());
        //baseClassA4.someEven();

    }
}
