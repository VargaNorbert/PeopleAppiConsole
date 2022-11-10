package hu.petik.peopleappiconsole;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String url="https://retoolapi.dev/qyv1iw/people";

    public static void main(String[] args) {

        try {
            newPersonFromConsole();
            String people = RequestHandler.get(url);
            System.out.println(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void newPersonFromConsole() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a nevét: ");
        String name = sc.nextLine();
        System.out.println("Adja meg az email címét: ");
        String email = sc.nextLine();
        System.out.println("Adja meg az életkorát: ");
        String age = sc.nextLine();
        String json = String.format("{\"name\" : \"%s\" , \"email\" : \"%s\" ,\"age\" : \"%s\"Teszt Elek}",name,email,age);
        RequestHandler.post(url,json);
    }
}
