package ua.opnu;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Петренко", "Іван", 45);
        Student student = new Student("Коваленко", "Марія", 20, "КН-21", "СТ12345");
        Lecturer lecturer = new Lecturer("Сидоренко", "Петро", 38, "Інформатики", 25000);
        Person[] people = new Person[3];
        people[0] = person;
        people[1] = student;
        people[2] = lecturer;
        System.out.println("=== Інформація про людей ===");
        for (Person p : people) {
            System.out.println(p);
            System.out.println("-------------------");
        }
        Person[] university = new Person[5];
        university[0] = new Person("Шевченко", "Тарас", 70);
        university[1] = new Student("Франко", "Іван", 19, "Ф-11", "СТ67890");
        university[2] = new Lecturer("Котляревський", "Іван", 55, "Філології", 28000);
        university[3] = new Student("Українка", "Леся", 21, "Л-31", "СТ54321");
        university[4] = new Lecturer("Сковорода", "Григорій", 62, "Філософії", 32000);
        System.out.println("\n=== Весь університет ===");
        for (Person p : university) {
            System.out.println(p);
        }
    }
}