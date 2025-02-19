package datamodel.repositories;

import datamodel.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  // Marks this interface as a repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
