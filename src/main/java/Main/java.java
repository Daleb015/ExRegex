/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daleb
 */
public class java {

    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("C:\\Users\\daleb\\Documents\\results.csv");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            Pattern pat = Pattern.compile("^2011\\-.*[zk].*$");
            
            String lineaActual;

            while ((lineaActual = br.readLine()) != null) {
                Matcher matcher = pat.matcher(lineaActual);
                if (matcher.find()) {
                    System.out.println(lineaActual);
                }
            }

        } catch (IOException e) {
            System.out.println("Se revento");
        }

    }
}
