package com.company;

import java.io.IOException;
import java.util.Scanner;
import static com.company.task3.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите действие ");
        String tmp = scanner.nextLine();
        String[] tmp2 = tmp.split(" ");
        switch (tmp2[0])
        {
            case ("ls"):
                ls(tmp2.length == 2);
                break;
            case ("mkdir"):
                mkdir(tmp2[1]);
                break;
            case ("echo"):
                String text = "";
                for(int i = 2; i< tmp2.length;i++)
                {
                    text= text+tmp2[i]+" ";
                }
                echo(tmp2[1], text);
                break;
            case ("cat"):
                cat(tmp2);
                break;
        }
    }
}
