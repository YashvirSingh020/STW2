package OOPS;

public class Students {
    public String name;
    private int age;
    private int rollNo;
    private String level;
    private int contact;

    //constructor
    public Students(String nam, int ages, int rollNo, String lev, int con){
        this.age =  ages;
        this.name = nam;
        this.rollNo = rollNo;
        this.level = lev;
        this.contact = con;
    }

    //default constructer
    public Students(){

    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setLevel(String lev) {
        this.level = lev;
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

    public int getRollNo() {
        return this.rollNo;
    }

    public String getLevel() {
        return this.level;
    }

    public int getContact() {
        return this.contact;
    }

    //method / function
    public void printStudentDetails(){
        System.out.println("Student details are as follow");
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Roll : " + this.rollNo);
        System.out.println("Level : " + this.level);
        System.out.println("Contact : " + this.contact);
    }
}
