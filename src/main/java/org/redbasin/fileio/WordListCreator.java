package org.redbasin.fileio;

import com.oracle.tools.packager.IOUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

/**
 * String line;
 * try (
 * InputStream fis = new FileInputStream("the_file_name");
 * InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
 * BufferedReader br = new BufferedReader(isr);
 * ) {
 * while ((line = br.readLine()) != null) {
 * // Deal with the line
 * }
 * }
 * <p>
 * URL url = new URL("http://www.example.com/");
 * URLConnection con = url.openConnection();
 * InputStream in = con.getInputStream();
 * String encoding = con.getContentEncoding();
 * encoding = encoding == null ? "UTF-8" : encoding;
 * String body = IOUtils.toString(in, encoding);
 * System.out.println(body);
 * <p>
 * Created by jtanisha-ee on 5/8/16.
 */
public class WordListCreator {

    public static void mineWords(String textFile) {

        String line;
        try (
                InputStream fis = new FileInputStream(textFile);
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
        ) {
            Set<String> s = new HashSet<>();
            while ((line = br.readLine()) != null) {
                // Deal with the line
                //System.out.println(line);
                String[] tokens = line.split(" ");
                for (String token : tokens) {
                    token = token.trim();
                    if (token.matches("[a-z]+") && token.length() > 0)
                        s.add(token.toLowerCase());
                }
            }
            for (String token : s) {
                System.out.println(token);
            }
            System.out.println("number of tokens found = " + s.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void mineWebWords(String urls) throws Exception {

        String line;
        URL oracle = new URL(urls);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));

        Set<String> s = new HashSet<>();
        while ((line = in.readLine()) != null) {               // Deal with the line
            //System.out.println(line);
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                token = token.trim();
                if (token.matches("[a-z]+") && token.length() > 0)
                    s.add(token.toLowerCase());
            }
        }

        for (String token : s) {
            System.out.println(token);
        }
        System.out.println("number of tokens found = " + s.size());
    }

    public static void main(String[] args) throws Exception {
        //mineWords("textfile");
        mineWebWords("file:///Users/manojjoshi/git/ap-cs/textfile");
        //mineWebWords("https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html");
    }

}
