package PietroRomano;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4-W3-ProgettoSettimanale");
    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}
