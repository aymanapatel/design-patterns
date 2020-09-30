package creational.prototype.api.databasestatement;


import java.util.*;
public class Main {


    public static void main(String[] args) {

        String sql = "SELECT * FROM emp";

        List<String> parameters = new ArrayList<>();

        parameters.add("Ayman");

        Record record = new Record();

        Statement firstStatement = new Statement(sql, parameters, record);

        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord()); //creational.prototype.databasestatement.Record@1540e19d
        System.out.println(firstStatement.getSql());

        Statement secondStatement = firstStatement.clone();
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord()); //creational.prototype.databasestatement.Record@1540e19d
        System.out.println(secondStatement.getSql());

        /**
         * Shallow copy: //creational.prototype.databasestatement.Record@1540e19d
         * Bad because one change affects both Record objects
         */

    }
}
