package com.practiceapps;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppMain {
    public static void main(String[] args) {
      AppMain appMain = new AppMain();
      appMain.runUi();
    }
    private EntityManager em;
    void runUi(){
        EntityManagerFactory emf  = Persistence.createEntityManagerFactory("studentms");
        em = emf.createEntityManager();
        System.out.println("Students Added in the database********************");
        Student student1 = add("Sohan",18);
        System.out.println(student1+ " Added");
        Student student2 = add("Rohan", 17);
        System.out.println(student2+ " Added");
        Student student3 = add("Raj", 16);
        System.out.println(student3+ " Added");
        System.out.println("******************************************************");

        System.out.println("Updating Students in the database********************");
        student1.setAge(19);
        Student updatedStudent = update(student1);
        System.out.println(updatedStudent+ " Student Updated");
        System.out.println("******************************************************");

        System.out.println("Finding Students in the database**********************");
        int id = 2;
        Student student = findById(id);
        System.out.println(student+ " Found");
        System.out.println("*******************************************************");

        System.out.println("Deleting Students in the database********************");
        String msg = delete(student3);
        System.out.println(msg);
        System.out.println("*******************************************************");


        em.close();
        emf.close();
    }
    Student add(String name,int age){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Student student = new Student(name,age);
        em.persist(student);
        transaction.commit();
        return student;
    }
    Student update(Student student){
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.merge(student);
        transaction.commit();
        return student;
    }
    Student findById(int id){
        Student student = em.find(Student.class,id);
        return student;
    }
    String delete(Student student){
       int id = student.getId();
       Student foundStudent = findById(id);
       EntityTransaction transaction = em.getTransaction();
       transaction.begin();
       em.remove(foundStudent);
       transaction.commit();
       return "Student deleted with id "+id;
    }
}
