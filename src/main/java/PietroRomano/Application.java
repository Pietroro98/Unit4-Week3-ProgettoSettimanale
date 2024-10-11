package PietroRomano;

import DAO.CatalogoDAO;
import DAO.PrestitoDAO;
import DAO.UtenteDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4-W3-ProgettoSettimanale");
    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        CatalogoDAO cd = new CatalogoDAO(em);
        PrestitoDAO pd = new PrestitoDAO(em);
        UtenteDAO ud = new UtenteDAO(em);






        em.close();
        emf.close();

    }
}
