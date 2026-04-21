package coms.PersonRestApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.PersonRestApi.bean.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
