package DAO;

import entities.Catalogo;
import entities.Libro;
import entities.Rivista;
import exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.UUID;

public class CatalogoDAO {

    private final EntityManager entityManager;

    public CatalogoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Catalogo catalogo) {

            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(catalogo);
            transaction.commit();
    }

    public void saveLibro(Libro libro) {

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(libro);
        transaction.commit();
    }

    public void saveRivista(Rivista rivista) {

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(rivista);
        transaction.commit();
    }

    public Catalogo findByCatalogoByIsbn(UUID ISBN) {
        Catalogo found = entityManager.find(Catalogo.class, (ISBN));
        if (found == null) throw new NotFoundException(ISBN);
        return found;
    }

    public void delete(UUID ISBN) {
        Catalogo catalogo = findByCatalogoByIsbn(ISBN);
        if (catalogo != null) entityManager.remove(catalogo);
    }

    public List<Catalogo> trovaPerAnnoPubblicazione(int anno) {
        return entityManager.createQuery("SELECT c FROM Catalogo c WHERE c.annoPubblicazione = :anno", Catalogo.class)
                .setParameter("anno", anno)
                .getResultList();
    }


}
