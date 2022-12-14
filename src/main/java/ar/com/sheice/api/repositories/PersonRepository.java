package ar.com.sheice.api.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.sheice.api.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    public abstract ArrayList<Person> findByFirstName(String firstName);
}
