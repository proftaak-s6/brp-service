package nl.fontysproject.brp.service.implementation;

import nl.fontysproject.brp.model.Person;
import nl.fontysproject.brp.service.PersonService;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class JPAPersonService implements PersonService {

    @PersistenceContext(unitName = "PU")
    private EntityManager manager;

    @Override
    public Person getByBsn(String bsn) {
        return manager.createNamedQuery(Person.GET_BY_BSN, Person.class)
                .setParameter("bsn", bsn)
                .getSingleResult();
    }

    @Override
    public Person getById(long id) {
        return manager.createNamedQuery(Person.GET_BY_ID, Person.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
