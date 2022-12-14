package ar.com.sheice.api.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.sheice.api.models.Person;
import ar.com.sheice.api.repositories.PersonRepository;

@Service
public class PersonService {
    
    @Autowired
    private PersonRepository personRepository;

    public ArrayList<Person> getAllPersons(){
        return (ArrayList<Person>)personRepository.findAll();
    }

    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    public Optional<Person> getOnePerson(Long id) {
        return personRepository.findById(id);
    }

    public ArrayList<Person> getPersonByFirstName(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    public boolean deletePerson(Long id) {
        try {
            personRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
