public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;
    public Student(String id,String name ,String dateOfBirth,String classList){
        this.id =  id;
        this.name =  name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }
//? this toString() is java class function and doing this lets us create the current state of our object.
//? override tells us that it is the special type of method in java.
    //? it is a special method in java that other classes can implement if htey use a  specified method signature
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
