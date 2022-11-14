public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String phone = "+7 960 415-75-37";
        phone = phone.replace("-", "");// убрали -
        phone = phone.replace(" ", "");// убрали пробел
        phone = phone.replace("+", "");// убрали +
        if (phone.length() == 10) {
            phone = '7' + phone; ]// добавили 7
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный)");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') { // если в номере вместо 7 другая цифра
            throw new RuntimeException("Среди нас посторонний");

        }
        System.out.println("phone = " + phone);
        String expectedPhone = "79604157537";// задали нужный формат  номера
        if (phone.equals(expectedPhone)) {
            System.out.println("Усрпех!");
        } else {
            System.out.println("Неудача :(");
        }

    }
}