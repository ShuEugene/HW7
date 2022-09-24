//  Домашние задания к Уроку 7 «Строки»
public class Main {
    public static void main(String[] args) {
        System.out.println();

//  ДЗ 7.1
        System.out.println(getFullName("Ivan", "Ivanovich", "Ivanov"));

        System.out.println();
    }

    static String getFullName(String firstName, String middleName, String lastName) {
                return lastName + " " + firstName + " " + middleName;
    }
}