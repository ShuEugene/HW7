//  Домашние задания к Уроку 7 «Строки»
public class Main {
    public static void main(String[] args) {
        hw7_1();

    }

    static void hw7_1() {
        String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov",
                fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);
    }
}