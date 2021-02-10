package com.practice;

import java.io.*;

public class FolderMaker {

    public static void main(String[] args) {

        String path = "C:\\Users\\My Pc\\Desktop\\Test\\PENALE S05.csv";
        String[] values;
        String myValues;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String ncFile;
            for (int i = 1; i <= 52; i++) {
                while ((ncFile = br.readLine()) != null) {
                    values = ncFile.split(",");
                    myValues = values[0];
                    String nameFoldersUntil10;
                    if (i < 10) {
                        nameFoldersUntil10 = "0" + i++;
                        File file = new File("C:\\Users\\My Pc\\Desktop\\Test\\" + nameFoldersUntil10 + ". " + myValues);
                        if (!file.exists()) {
                            file.mkdir();
                        } else {
                            System.out.println("File exist");
                        }
                    } else {
                        File file = new File("C:\\Users\\My Pc\\Desktop\\Test\\" + i++ + ". " + myValues);
                        if (!file.exists()) {
                            file.mkdir();
                        } else {
                            System.out.println("File exist");
                        }
                    }
                }
            }
            br.close();
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
    }
}