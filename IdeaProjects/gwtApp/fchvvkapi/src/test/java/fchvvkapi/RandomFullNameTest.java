package fchvvkapi;

import fchvvkapi.Helpers.RandomFullName;
import org.testng.annotations.Test;

public class RandomFullNameTest {

    @Test
    public void t() {
        for (int i = 0; i < 20; i++) {
            System.out.println(RandomFullName.getNextFIO());
        }

        System.out.println("*******");

        for(int i = 0; i < 20; i++) {
            System.out.println(RandomFullName.getNextLastName() + " "
                    + RandomFullName.getNextFirstName() + " " + RandomFullName.getNextMidName());
        }
    }

}
