package OOPS;

public class Faculty {
    private String name;
    private int age; 
    private int id;
    private String department;
    private int contact;

    // Default Constructor
    public Faculty(){
        
    }

    //Constructor
    public Faculty(String name,int age,int id,String dep,int con){
        this.name = name;
        this.age = age;
        this.department = dep;
        this.contact = con;
        this.id = id;
    }

    // Method
    public void printFacultyDetail(){
        System.out.println("Facaluty details are as follow: ");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Id: " + this.id);
        System.out.println("Department: " + this.department);
        System.out.println("Contact: " + this.contact);
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String dep) {
        this.department = dep;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }

    public String getDepartment() {
        return this.department;
    }

    public int getContact() {
        return this.contact;
    }
}
