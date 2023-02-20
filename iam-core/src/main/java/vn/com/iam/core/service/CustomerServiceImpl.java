package vn.com.iam.core.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.com.iam.core.document.CustomerDoc;
import vn.com.iam.core.dto.CustomerDTO;
import vn.com.iam.core.exception.ResourceNotFoundException;
import vn.com.iam.core.repository.CustomerRepository;
import vn.com.iam.core.util.factory.mapper.CustomerMapper;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerDTO getCustomerInfo(String customerDTO) {

        CustomerDoc customerDoc = customerRepository.findByCustomerCode(customerDTO).orElseThrow(
                () -> new ResourceNotFoundException(CustomerDoc.class, customerDTO));
        return customerMapper.documentToDTO(customerDoc);
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {

        CustomerDoc customerDoc = customerMapper.DTOToDocument(customerDTO);
        customerDoc = customerRepository.save(customerDoc);

        return customerMapper.documentToDTO(customerDoc);
    }

    @Override
    public Page<CustomerDTO> getListCustomer(Pageable page) {
        Page<CustomerDoc> customerDocPage = customerRepository.findAll(page);

        return customerDocPage.map(customerMapper::documentToDTO);
    }
}
