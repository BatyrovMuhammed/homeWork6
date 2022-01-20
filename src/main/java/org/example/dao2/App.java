package org.example.dao2;

import org.example.dao2.dao.imple.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
   public static Scanner scanner= new Scanner(System.in);
    public static void main( String[] args ) throws SQLException {
        while (true){
        Cities.prn();
        int a = scanner.nextInt();
      if (a == 1){
          jdbc jdbc=new jdbc();
          System.out.println(jdbc.printUsersjdbc1());
        }else if (a == 2){
          jdbc jdbc=new jdbc();
          System.out.println(jdbc.printUsersjdbc2());
        }else if (a == 3){
            jdbc.printId1(scanner.nextInt());
        }else {
            System.out.println(" ~~~ Kechiresiz myndai id jok ~~~ ");
          System.out.println(" ~~~ Kairadan tandap korsonuz ~~~ ");
          System.out.println("  ");
        }
    }
}
}