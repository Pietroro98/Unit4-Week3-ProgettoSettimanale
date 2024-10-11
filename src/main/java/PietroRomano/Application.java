package PietroRomano;

import DAO.CatalogoDAO;
import DAO.PrestitoDAO;
import DAO.UtenteDAO;
import entities.Catalogo;
import entities.Libro;
import entities.Periodicita;
import entities.Rivista;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.UUID;


public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4-W3-ProgettoSettimanale");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        CatalogoDAO cd = new CatalogoDAO(em);
        PrestitoDAO pd = new PrestitoDAO(em);
        UtenteDAO ud = new UtenteDAO(em);





        System.out.println("Esercizio 1: Aggiunta di un elemento del catalogo");

        Libro libro1 = new Libro("java", 2024, 500, "pippo","jazz");
        cd.save(libro1);
        Rivista rivista1 = new Rivista("css", 2024, 600, Periodicita.MENSILE);
        cd.saveRivista(rivista1);






        System.out.println("Esercizio 2: Rimozione di un elemento del catalogo dato un codice ISBN");

             cd.findByCatalogoByIsbn(UUID.fromString("75b79a96-bedf-48a4-8cf2-838d9923bbe5"));

        System.out.println("Esercizio 4: Ricerca per anno pubblicazione");
        List<Catalogo> cataloghiAnno = cd.trovaPerAnnoPubblicazione(2024);
        cataloghiAnno.forEach(c -> System.out.println("Trovato per anno: " + c.getTitolo()));












        em.close();
        emf.close();

    }
}
