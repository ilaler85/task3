package com.company;


import java.io.*;

public class task3 {
    public static void ls(boolean r)
            //Вывод файлов в папке utilit
    {
        File a = new File("C:\\Users\\ivano\\IdeaProjects\\utilit");
        if (r)
        {
            for (int i = a.listFiles().length-1; i>=0; i-- )
            {
                System.out.println(a.listFiles()[i].getName());
            }
        }
        else
        {
            for(File file: a.listFiles())
            {
                System.out.println(file.getName());
            }

        }
    }

    public static void mkdir(String fileName)
            //Добавление папки
    {
        File a = new File("C:\\Users\\ivano\\IdeaProjects\\utilit\\"+fileName);
        a.mkdir();
    }

    public static void echo(String fileName, String text) throws IOException
            //создание текстового файла
    {
        File a = new File("C:\\Users\\ivano\\IdeaProjects\\utilit\\"+ fileName+".txt");
        a.createNewFile();
        FileWriter writer = new FileWriter("C:\\Users\\ivano\\IdeaProjects\\utilit\\"+ fileName+".txt", false);
        writer.write(text);
        writer.flush();
        writer.close();
    }

    public static void cat (String[] fileName) throws IOException
            //вывод текста из файла(файлов)
    {
        for (int i =1; i<fileName.length; i++) {
            FileReader fr = new FileReader("C:\\Users\\ivano\\IdeaProjects\\utilit\\"+ fileName[i]+".txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null)
            {
                System.out.println(line);
                line = reader.readLine();
            }
        }
    }
}
