package vn.com.iam.core.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.com.iam.core.dto.CustomerDTO;

public interface CustomerService {
    CustomerDTO getCustomerInfo(String customerCode);

    CustomerDTO createCustomer(CustomerDTO customerDTO);

    Page<CustomerDTO> getListCustomer(Pageable page);
}
