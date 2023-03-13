package exceptionTask.com.traningapps.jobapp.ui;

import exceptionTask.com.traningapps.jobapp.companyms.Company;
import exceptionTask.com.traningapps.jobapp.jobms.*;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        //For ITJobs
        ITJobServiceImpl itJobService = new ITJobServiceImpl(5);
        ITJob itJob1 = new ITJob(1, "Service Based", new Company("DS56", "Wipro"), "Java", 1);
        ITJob itJob2 = new ITJob(2, "Product Based", new Company("GT45", "Amazon"), "Python", 1);
        ITJob itJob3 = new ITJob(3, "Service Based", new Company("DH56", "Accenture"), "Java", 1);
        itJobService.addJob(itJob1);
        itJobService.addJob(itJob2);
        itJobService.addJob(itJob3);

        System.out.println("Finding all Jobs ********************************");
        ITJob[] foundAllItJobs = itJobService.findAll();
        obj.display(foundAllItJobs);
        System.out.println("*********************************");

        System.out.println("Finding job by id ********************************");
        try {
            ITJob itJob = itJobService.findById(2);
            obj.display(itJob);
        } catch (InvalidIdEcxeption e) {
            System.out.println(e.getMessage());
        } catch (JobNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //For ElectronicsJob
        ElectronicsServiceImpl electronicsService = new ElectronicsServiceImpl(5);
        ElectronicsJob electronicsJob1 = new ElectronicsJob(1, "Government Job", new Company("GF52", "DSP"), "Resistor", 1);
        ElectronicsJob electronicsJob2 = new ElectronicsJob(2, "Private Job", new Company("HY56", "HCL"), "Diode", 1);
        ElectronicsJob electronicsJob3 = new ElectronicsJob(3, "Government Job", new Company("JU23", "Railways"), "NPM Transistor", 1);
        electronicsService.addJob(electronicsJob1);
        electronicsService.addJob(electronicsJob2);
        electronicsService.addJob(electronicsJob3);

        System.out.println("Finding all Jobs ********************************");
        ElectronicsJob[] foundAllElectronicsJobs = electronicsService.findAll();
        obj.display(foundAllElectronicsJobs);
        System.out.println("*********************************");

        System.out.println("Finding job by id ********************************");
        try {
            ElectronicsJob electronicsJob = electronicsService.findById(2);
            obj.display(electronicsJob);
        } catch (InvalidIdEcxeption e) {
            System.out.println(e.getMessage());
        } catch (JobNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    //display method for ITJobs
    public void display(ITJob[] itJobs) {
        for (ITJob itJob : itJobs) {
            if (itJob != null) {
                display(itJob);
            }
        }
    }

    public void display(ITJob itJob) {
        System.out.println("Id is " + itJob.getId() + " Type is " + itJob.getType() + " Company Id is " + itJob.getCompany().getId() +
                " and name is " + itJob.getCompany().getName() + " Language is " + itJob.getLanguage());


    }
    //display method for ElectronicsJobs
    public void display(ElectronicsJob[] electronicsJobs) {
        for (ElectronicsJob electronicsJob : electronicsJobs) {
            if (electronicsJob != null) {
                display(electronicsJob);
            }
        }
    }

    public void display(ElectronicsJob electronicsJob) {
        System.out.println("Id is " + electronicsJob.getId() + " Type is " + electronicsJob.getType() + " Company Id is " + electronicsJob.getCompany().getId() +
                " and name is " + electronicsJob.getCompany().getName() + " Device used is " + electronicsJob.getDeviceUsed());


    }

}
