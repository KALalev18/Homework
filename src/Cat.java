import java.util.ArrayList;

public class Cat {
     private String name;
     private byte age;
     private String color;
     private ArrayList<Cat> cats;
    public Cat() {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public byte getAge(byte age) {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int checkAge()
    {
        System.out.println("\nIt is impossible for your cat to be a minus age!");
        System.exit(0);
        return 0;
    }

    public String getColor(String color) { return color;}

    public void setColor(String color) {
        this.color = color;
    }

}
