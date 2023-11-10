package pl.gornik;

import pl.gornik.model.Book;
import pl.gornik.model.Disc;
import pl.gornik.model.Product;
import pl.gornik.model.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Koszyk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book crimeNovel = new Book("Złodziejka cienia", 50, 29.99, "Anna Kowalska");
        Book adventureBook = new Book("Skarb Atlantydy", 30, 39.99, "Jan Nowak");
        Book educationalBook = new Book("Matematyka dla początkujących", 20, 24.99, "Maria Wiśniewska");
        Book fantasyBook = new Book("Smocza Opowieść", 40, 34.99, "Piotr Kowalczyk");

        Toy babyToy = new Toy("Miękki pluszowy miś", 100, 19.99, 0);
        Toy educationalToy = new Toy("Klocki logiczne", 50, 29.99, 3);
        Toy remoteControlCar = new Toy("Zdalnie sterowany samochód", 30, 39.99, 6);
        Toy doll = new Toy("Lalka z akcesoriami", 40, 24.99, 4);

        Disc rockCD = new Disc("Greatest Hits", 20, 14.99, "Queen");
        Disc concertDVD = new Disc("Live in Concert", 15, 29.99, "The Rolling Stones");
        Disc movieBluRay = new Disc("Inception", 10, 19.99, "Hans Zimmer");
        Disc jazzVinyl = new Disc("Kind of Blue", 25, 34.99, "Miles Davis");


        List<Product> products = new ArrayList<>();
        products.add(crimeNovel);
        products.add(adventureBook);
        products.add(educationalBook);
        products.add(fantasyBook);
        products.add(babyToy);
        products.add(educationalToy);
        products.add(remoteControlCar);
        products.add(doll);
        List<Product> koszyk = new ArrayList<>();


        System.out.println("---------------------------------------------------");
        System.out.println("Wybierz produkty, które chcesz zakupić, wpisując nazwę");
        System.out.println("---------------------------------------------------");
        for (Product product : products) {
            System.out.println(product.displayProduct());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Podaj nazwę produktu, który chcesz zakupić");
        System.out.println("---------------------------------------------------");

        String choosed = scanner.nextLine();


        for (Product product : products) {
            if (choosed.equals(product.getTitle())) {
                System.out.println("Podaj ilość: ");
                int ilosc = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Czy dodać do koszyka? T/N");
                String TN = scanner.nextLine();

                if (TN.equalsIgnoreCase("T")) {
                    System.out.println("Dodano do koszyka: " + product.getTitle() + " w ilości " + ilosc);
                    int usuwanie = 0;
                    ilosc = usuwanie;
                    koszyk.add(product);
                    System.out.println("Zawartość koszyka:");
                    for (Product Koszyk : koszyk) {
                        System.out.println(Koszyk.displayProduct());
                    }
                } else {
                    System.out.println("Powrót do menu");
                }

            }
        }
        products.remove(choosed);

    }


}