package nl.fontysproject.brp.graphql;

import com.kumuluz.ee.graphql.annotations.GraphQLClass;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import nl.fontysproject.brp.model.Person;
import nl.fontysproject.brp.service.PersonService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@GraphQLClass
@RequestScoped
public class PersonEndpoint {

    @Inject
    private PersonService service;

    @GraphQLQuery
    public Person personByBsn(@GraphQLArgument(name = "bsn") String bsn) {
        return service.getByBsn(bsn);
    }

    @GraphQLQuery
    public Person personById(@GraphQLArgument(name = "id") long id) {
        return service.getById(id);
    }
}
