import java.util.Scanner;

public class Testing {
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        Cat myCat = new Cat();

        System.out.println("Еnter your cat's attributes down below");

        System.out.print("\nName: ");
        String name = scanner.nextLine();

        System.out.print("\nAge: ");
        byte age = Byte.parseByte(scanner.nextLine());
        if (age <= -1)
        {
            myCat.checkAge();
        }

        System.out.print("\nColor: ");
        String color = scanner.nextLine();

        System.out.print("\nYour cat is named "+myCat.getName(name)+" and it is a "
                +myCat.getAge(age)+ " year old with "+myCat.getColor(color)+" fur color.");
    }
}
