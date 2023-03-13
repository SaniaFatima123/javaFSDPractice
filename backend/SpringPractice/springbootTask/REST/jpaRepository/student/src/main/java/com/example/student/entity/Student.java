package com.example.student.entity;

import javax.persistence.*;
import java.util.Objects;
@Entity
@Table(name="students")
public class Student {
        @Id
        @GeneratedValue
        private int id;
        @Column(nullable = false)
        private String name;
        private int age;
        private String school;
        private int standard;

        public Student() {
        }

        public Student(String name, int age, String school, int standard) {
            this.name = name;
            this.age = age;
            this.school = school;
            this.standard = standard;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public int getStandard() {
            return standard;
        }

        public void setStandard(int standard) {
            this.standard = standard;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", school='" + school + '\'' +
                    ", standard='" + standard + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && age == student.age && Objects.equals(name, student.name) && Objects.equals(school, student.school) && Objects.equals(standard, student.standard);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }


