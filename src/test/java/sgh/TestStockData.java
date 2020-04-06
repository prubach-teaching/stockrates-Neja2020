package sgh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static sgh.StockData.getAndProcessChange;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

public class TestStockData {

    @Test
    public void testStockData() throws IOException
    {
        int filesFound = 0;
        String[] stocks = new String[] { "ORCL", "INTC", "SAP" };
        for (String stock : stocks) {
            getAndProcessChange(stock);
            File outFile = new File("data_out/" + stock + ".csv");
            System.out.println("Testing file: " + outFile);
            Scanner scanner = new Scanner(outFile);
            String header = scanner.nextLine();
            System.out.println("Checking header: " + header);
            assertEquals(8, header.split(",").length);
            String firstLine = scanner.nextLine();
            System.out.println("Checking first line: " + firstLine);
            assertEquals(8, firstLine.split(",").length);
            scanner.close();
            filesFound++;
        }
        assertTrue(filesFound>0);
    }
}