package collectionTasks.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PhoneStore {
    List<Phone> phones = new ArrayList<>();

    public List<Phone> readPhoneData(String fileName) {
        Reader reader = null;
        try {
            reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                Phone phone = new Phone(values[0], values[1], Double.parseDouble(values[2]), values[3]
                        , values[4], values[5], Integer.parseInt(values[6]));
                phones.add(phone);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(reader);
        }
        return phones;

    }

    private void close(Reader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Phone> findByBrand(String brandName) {
        List<Phone> foundPhoneByBrand = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone != null && phone.getBrandName().equalsIgnoreCase(brandName)) {
                foundPhoneByBrand.add(phone);
            }
        }
        return foundPhoneByBrand;
    }
    public List<Phone> findPhoneCostMoreThan500$(){
        List<Phone> foundPhoneByCost = new ArrayList<>();
        for(Phone phone : phones){
            if(phone!=null && phone.getCost()>=500){
                foundPhoneByCost.add(phone);
            }
        }
        return foundPhoneByCost;
    }
    public List<Phone> findPhonePixelMoreThan12MP(){
        List<Phone> foundPhoneByCamera = new ArrayList<>();
        for(Phone phone : phones){
            if(phone!=null && phone.getCameraPixels()>=12){
                foundPhoneByCamera.add(phone);
            }
        }
        return foundPhoneByCamera;
    }


}
