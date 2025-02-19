package datamodel.repositories;

import datamodel.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Marks this interface as a repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
