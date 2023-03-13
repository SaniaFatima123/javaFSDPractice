package collectionTasks.task3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();

        PhoneStore phoneStore = new PhoneStore();

        List<Phone> phones = phoneStore.readPhoneData("jobms/src/collectionTasks/task3/mobile.csv");
        //printing using toString method in phone class
        obj.display(phones);
        //Finding by brand
        System.out.println("****************************************************************");
        List<Phone> foundByBrand = phoneStore.findByBrand("Sony");
        obj.display(foundByBrand);
        //Finding by cost
        System.out.println("****************************************************************");
        List<Phone> foundByCost = phoneStore.findPhoneCostMoreThan500$();
        obj.display(foundByCost);
        //Finding by Pixels
        System.out.println("****************************************************************");
        List<Phone> foundByPixels = phoneStore.findPhonePixelMoreThan12MP();
        obj.display(foundByPixels);
    }

    public void display(List<Phone> phones) {
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }
}
