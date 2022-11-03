public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.yearOfBirth = 35;
        maksim.town = "Минск";
        maksim.jobTitle = "бренд-менеджер";

        Human anya = new Human();
        anya.name = "Аня";
        anya.yearOfBirth = 29;
        anya.town = "Москва";
        anya.jobTitle = "методист образовательных программ";

        Human katya = new Human();
        katya.name = "Катя";
        katya.yearOfBirth = 28;
        katya.town = "Калининград";
        katya.jobTitle = "продакт-менеджер";

        Human artem = new Human();
        artem.name = "Артем";
        artem.yearOfBirth = 27;
        artem.town = "Москва";
        artem.jobTitle = "директора по развитию бизнеса";

        System.out.println("Привет! Меня зовут " + maksim.name + ". Я из города " + maksim.town +
                ". Я родился в " + (currentYear - maksim.yearOfBirth) + "году. Я работаю " + maksim.jobTitle + ".  Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.town +
                ". Я родился в " + (currentYear - anya.yearOfBirth) + " году. Я работаю " + anya.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.town +
                ". Я родился в " + (currentYear - katya.yearOfBirth) + " году. Я работаю " + katya.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + ". Я из города " + artem.town +
                ". Я родился в " + (currentYear - artem.yearOfBirth) + " году. Я работаю " + artem.jobTitle + ". Будем знакомы!");




    }
}