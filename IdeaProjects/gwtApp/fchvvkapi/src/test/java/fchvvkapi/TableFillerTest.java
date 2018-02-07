package fchvvkapi;

import fchvvkapi.Helpers.TableFiller;
import org.testng.annotations.Test;

public class TableFillerTest {
    @Test
    public void t() {
        for (String s: TableFiller.getNames()
             ) {
            System.out.println(s.substring(0, Math.min(s.length(), 10)));
        }
    }
}
