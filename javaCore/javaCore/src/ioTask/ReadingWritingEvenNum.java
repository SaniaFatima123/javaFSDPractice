package ioTask;

import java.io.*;

public class ReadingWritingEvenNum {
    public static void main(String[] args) {
        ReadingWritingEvenNum readingWritingEvenNum = new ReadingWritingEvenNum();
        readingWritingEvenNum.evenNum();
    }

    public void evenNum() {
        File myNumFile = new File("D:/Java FSD Practice/Numbers/numbers.txt");
        File myEvenFile = new File("D:/Java FSD Practice/Numbers/evenNumbers.txt");
        Reader reader = null;
        Writer writer = null;
        try {
            reader = new FileReader(myNumFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            writer = new FileWriter(myEvenFile);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String readLine;
            int sumOfEvenNum = 0;
            while ((readLine = bufferedReader.readLine()) != null) {
                int num = Integer.parseInt(readLine);
                 if (readLine.equals("\n")) {
                    bufferedWriter.write("\n");
                }
                if (num % 2 == 0) {
                    sumOfEvenNum += num;
                    bufferedWriter.write(String.valueOf(num)+"\n");
                }

                System.out.println(num);
                //bufferedWriter.write(num);
            }
            bufferedWriter.flush();
            System.out.println("Sum of even numbers are = " + sumOfEvenNum);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(reader);
            close(writer);
        }
    }

    public void close(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close(Writer writer) {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
