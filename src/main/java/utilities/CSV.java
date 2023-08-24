package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {


    //    Read date from CSV file and return as a list
    public static List<String[]> read(String file) throws IOException {
        List<String[]> data = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String row;
        while ((row = reader.readLine()) != null) {
            String[] dataRow = row.split(",");
            data.add(dataRow);
        }
        reader.close();
        return data;
    }


    public static void main(String[] args) throws IOException {
//        read("NewBankAccounts.csv");

    }
}
