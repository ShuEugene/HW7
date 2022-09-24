//  Домашние задания к Уроку 7 «Строки»
public class Main {
    public static void main(String[] args) {
        System.out.println();

//  ДЗ 7.1
        String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov";
        String fullName = getFullName(firstName, middleName, lastName);
        System.out.println(fullName);

        System.out.println();
    }

    static String getFullName(String firstName, String middleName, String lastName) {
        if (lastName.length() == 0 || firstName.length() == 0) {
            throw new RuntimeException("Отсутствуют сведения об имени и/или фамилии.");
        } else if (middleName.length() > 0){
            return lastName + " " + firstName + " " + middleName;
        } else {
            return lastName + " " + firstName;
        }
    }
}