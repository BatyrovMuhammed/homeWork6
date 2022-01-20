package org.example.dao2.dao.imple;

import org.example.dao2.Cities;
import org.example.dao2.Countries;
import org.example.dao2.dao.UserService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class jdbc implements UserService {

    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private final static String user = "postgres";
    private final static String password = "1234";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server \n" + "successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static int getUsercount() {
        String SQL = "select count(*) from cities,";
        int count = 0;
        try (
                Connection conn = connection();
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(SQL)) {
            resultSet.next();
            count = resultSet.getInt(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return count;
    }
    public static int getUsercount2() {
        String SQL = "select count(*) from countries,";
        int count2 = 0;
        try (
                Connection conn2 = connection();
                Statement statement = conn2.createStatement();
                ResultSet resultSet = statement.executeQuery(SQL)) {
            resultSet.next();
            count2 = resultSet.getInt(1);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return count2;
    }

    public static void addUser(String name, int formed_year,String is_located,int live_people) {
        String SQL = "insert into cities (name,formed_year,is_located,live_people) values(?,?)";
        try (Connection conn = connection();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1, name);
            statement.setInt(2, formed_year);
            statement.setString(3, is_located);
            statement.setInt(4, live_people);
            statement.executeUpdate();
        } catch (SQLException ox) {
            System.out.println(ox.getMessage());
        }

    }
    public static void addUser2(String name, String religion,String neighboring_countries,int live_people) {
        String SQL = "insert into countries (name,religion,neighboring_countries,live_people) values(?,?)";
        try (Connection conn = connection();
             PreparedStatement statement = conn.prepareStatement(SQL)) {
            statement.setString(1, name);
            statement.setString(2, religion);
            statement.setString(3, neighboring_countries);
            statement.setInt(4, live_people);
            statement.executeUpdate();
        } catch (SQLException ox) {
            System.out.println(ox.getMessage());
        }
    }
    @Override
    public List<Cities> printUsersjdbc1() {
        ArrayList<Cities> list1 = new ArrayList<>();
        String SQL = "SELECT * FROM cities";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                list1.add(new Cities(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("formed_year"),
                        rs.getString("is_located"),
                        rs.getLong("live_people")));
            }
            return list1;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
@Override
    public  List<Countries> printUsersjdbc2() {
        ArrayList<Countries> list2 = new ArrayList<>();
        String SQL = "SELECT * FROM countries";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                list2.add(new Countries(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("religion"),
                        rs.getString("neighboring_countries"),
                        rs.getLong("live_people")
                ));
            }
            return list2;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    public static void printId1(int id) throws SQLException{
        try (PreparedStatement preparedStatement = connection().
                prepareStatement("select * from cities where id=(?)")){
            preparedStatement.setInt(1,id);
            ResultSet rs=preparedStatement.executeQuery();
            if (rs.next()){
           int idID =rs.getInt("id");
           String name = rs.getString("name");
           int  formedYear = rs.getInt("formed_year");
           String isLocated =  rs.getString("is_located");
           Long livePeople = rs.getLong("live_people");
        System.out.println(idID);
        System.out.println(name);
        System.out.println(formedYear);
        System.out.println(isLocated);
        System.out.println(livePeople);
    }
}finally {
            connection().close();
        }
    }

}