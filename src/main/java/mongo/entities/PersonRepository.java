
package mongo.entities;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

    public Person findByFirstName(String firstName);

}