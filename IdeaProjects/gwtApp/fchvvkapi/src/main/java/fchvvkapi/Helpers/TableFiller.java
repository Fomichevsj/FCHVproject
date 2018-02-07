package fchvvkapi.Helpers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TableFiller {
    public static List<String> getNames() {
        List<String> r = new ArrayList<String>(32);
        Connection con = null;
        try {
            con =
                    DriverManager
                            .getConnection(
                                    "jdbc:postgresql://localhost:5432/FCHVTestDataBase",
                                    "postgres", "qwerty");
            Statement st = con.createStatement();
            ResultSet resultSet = null;

            resultSet  = st.executeQuery("SELECT s.\"LastName\", s.\"FirstName\", s.\"MiddleName\" FROM \n" +
                    "public.\"Sudent\" s, public.\"ClassRoom\" c\n" +
                    "WHERE s.\"ClassId\" = c.\"Id\"");

            while (resultSet.next()) {
                r.add(resultSet.getString("LastName"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }
}
