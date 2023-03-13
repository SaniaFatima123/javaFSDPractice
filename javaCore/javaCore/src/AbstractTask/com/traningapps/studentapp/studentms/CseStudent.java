package AbstractTask.com.traningapps.studentapp.studentms;


import AbstractTask.com.traningapps.studentapp.departmentms.Department;

public class CseStudent extends Student{
    private String language;

    private int codingExperienceInYrs;

    public CseStudent() {
    }

    public CseStudent(long id, String name, Department department, String language, int codingExperienceInYrs) {
        super(id, name, department);
        this.language = language;
        this.codingExperienceInYrs = codingExperienceInYrs;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCodingExperienceInYrs() {
        return codingExperienceInYrs;
    }

    public void setCodingExperienceInYrs(int codingExperienceInYrs) {
        this.codingExperienceInYrs = codingExperienceInYrs;
    }

    @Override
    public String toString() {
        return "CseStudent{" +
                "language='" + language + '\'' +
                ", codingExperienceInYrs=" + codingExperienceInYrs +
                '}';
    }
}
