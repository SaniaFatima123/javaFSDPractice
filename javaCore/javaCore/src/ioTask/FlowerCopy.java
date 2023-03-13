package ioTask;
import java.io.*;

public class FlowerCopy {
    public static void main(String[] args) {
          FlowerCopy flowerCopy = new FlowerCopy();
          flowerCopy.readWrite();
    }
    public void readWrite(){
        File originalFile = new File("D:/Java FSD Practice/Flower.jpg");
        File copyFile = new File("D:/Java FSD Practice/flowerCopy.jpg");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try{
            inputStream = new FileInputStream(originalFile);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream(copyFile);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            byte[] readBytes = new byte[50];
            int bytesCount = 0;
            int totalBytes = 0;
            while((bytesCount = bufferedInputStream.read(readBytes))!=-1){
                bufferedOutputStream.write(readBytes, 0,bytesCount);
                totalBytes+=bytesCount;
            }
            System.out.println("Flower copied");
            System.out.println("Total Bytes count = "+totalBytes);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
            close(inputStream);
            close(outputStream);
        }
    }

    public void close(InputStream inputStream){
        try{
            if(inputStream!=null){
                inputStream.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public void close(OutputStream outputStream){
        try{
            if(outputStream!=null){
                outputStream.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }





}
