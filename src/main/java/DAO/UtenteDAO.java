package DAO;

import entities.Prestito;
import entities.Utente;
import exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UtenteDAO {
    private final EntityManager entityManager;

    public UtenteDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Utente utente) {

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(utente);
        transaction.commit();
    }

    public Utente findByUtenteId(long id) {
        Utente found = entityManager.find(Utente.class, (id));
        if (found == null) throw new NotFoundException(id);
        return found;
    }
}
