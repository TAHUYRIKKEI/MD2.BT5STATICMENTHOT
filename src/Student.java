
public class Student {
    private String name = "John";
    private String Class = "Co2";
    public Student (){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Class='" + Class + '\'' +
                '}';
    }
}

