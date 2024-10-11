package DAO;

import entities.Catalogo;
import exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

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

    public Catalogo findByCatalogoByIsbn(String ISBN) {
        Catalogo found = entityManager.find(Catalogo.class, (ISBN));
        if (found == null) throw new NotFoundException(ISBN);
        return found;
    }
}
