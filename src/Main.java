public class Main {
    public static void main(String[] args) {

        Car granta = new Car();
        granta.brand = "Lada";
        granta.model = "Granta";
        granta.year = 2015;
        granta.country = "Россия";
        granta.color = "желтый";
        granta.engineVolume = 1.7;
        System.out.println( "Марка автомобиля " + granta.brand +
                ", модель " + granta.model +
                ", год выпуска " + granta.year +
                ", сборка в " + granta.country +
                ", цвет " + granta.color +
                ", обьем двигателя " + granta.engineVolume + " литра.");


        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.year = 2020;
        audi.country = "Германии";
        audi.color = "черный";
        audi.engineVolume = 3.0;
        System.out.println( "Марка автомобиля " + audi.brand +
                ", модель " + audi.model +
                ", год выпуска " + audi.year +
                ", сборка в " + audi.country +
                ", цвет " + audi.color +
                ", обьем двигателя " + audi.engineVolume + " литра.");


        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.year = 2021;
        bmw.country = "Германии";
        bmw.color = "черный";
        bmw.engineVolume = 3.0;
        System.out.println( "Марка автомобиля " + bmw.brand +
                ", модель " + bmw.model +
                ", год выпуска " + bmw.year +
                ", сборка в " + bmw.country +
                ", цвет " + bmw.color +
                ", обьем двигателя " + bmw.engineVolume + " литра.");


        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4-го поколения";
        kia.year = 2018;
        kia.country = "Южной Корее";
        kia.color = "красный";
        kia.engineVolume = 2.4;
        System.out.println( "Марка автомобиля " + kia.brand +
                ", модель " + kia.model +
                ", год выпуска " + kia.year +
                ", сборка в " + kia.country +
                ", цвет " + kia.color +
                ", обьем двигателя " + kia.engineVolume + " литра.");


        Car hyndai = new Car();
        hyndai.brand = "Hyundai";
        hyndai.model = "Avante";
        hyndai.year = 2016;
        hyndai.country = "Южной Корее";
        hyndai.color = "оранжевый";
        hyndai.engineVolume = 1.6;System.out.println( "Марка автомобиля " + hyndai.brand +
                ", модель " + hyndai.model +
                ", год выпуска " + hyndai.year +
                ", сборка в " + hyndai.country +
                ", цвет " + hyndai.color +
                ", обьем двигателя " + hyndai.engineVolume + " литра.");


    }
}