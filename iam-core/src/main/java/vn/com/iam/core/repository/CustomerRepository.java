package vn.com.iam.core.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import vn.com.iam.core.document.CustomerDoc;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerDoc, String> {

    Optional<CustomerDoc> findByCustomerCode(String customerCode);
}
