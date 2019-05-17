package nl.fontysproject.brp.service;

import nl.fontysproject.brp.model.Person;

public interface PersonService {
    Person getByBsn(String bsn);
    Person getById(long id);
}
