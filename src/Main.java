//  Домашние задания к Уроку 7 «Строки»
public class Main {
    public static void main(String[] args) {
        System.out.println();

//  ДЗ 7.1
        String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov";
        String fullName = getFullName(firstName, middleName, lastName);
        System.out.println(fullName + "\n");

//  ДЗ 7.2
        String fullNameUC = getUpperCase(fullName);
        System.out.println(fullNameUC + "\n");

//  ДЗ 7.3
        fullName = "Иванов Семён Семёнович";
        String fullNameCorrected = fullName.replace('ё', 'е');
        System.out.println(fullNameCorrected + "\n");

        System.out.println();
    }

    static String getUpperCase(String str){
        if (str.length() > 0) {
            return str.toUpperCase();
        } else throw new RuntimeException("Нечего преобразовывать.");
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