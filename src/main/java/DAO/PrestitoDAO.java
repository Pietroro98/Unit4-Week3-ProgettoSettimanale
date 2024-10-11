package DAO;

import entities.Catalogo;
import entities.Prestito;
import exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PrestitoDAO {
    private final EntityManager entityManager;

    public PrestitoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Prestito prestito) {

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(prestito);
        transaction.commit();
    }

    public Prestito findByPrestitoId(long id) {
        Prestito found = entityManager.find(Prestito.class, (id));
        if (found == null) throw new NotFoundException(id);
        return found;
    }
}
