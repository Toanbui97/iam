package vn.com.iam.api.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.com.iam.core.dto.CustomerDTO;
import vn.com.iam.core.service.CustomerService;
import vn.com.iam.core.util.factory.BodyResponse;
import vn.com.iam.core.util.factory.ResponseFactory;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final ResponseFactory responseFactory;
    private final CustomerService customerService;

    @PostMapping("/performCreateCustomer")
    public ResponseEntity<BodyResponse<CustomerDTO>> performCreateCustomer(@RequestBody CustomerDTO req) {

        return responseFactory.success(customerService.createCustomer(req));
    }

    @GetMapping("/receiveCustomer/{customerCode}")
    public ResponseEntity<BodyResponse<CustomerDTO>> receiveCustomerInfo(@PathVariable String customerCode) {

        return responseFactory.success(customerService.getCustomerInfo(customerCode));
    }

    @GetMapping("/receiveCustomerList")
    public ResponseEntity<BodyResponse<CustomerDTO>> receiveCustomerList(@PageableDefault Pageable page) {

        return responseFactory.success(customerService.getListCustomer(page));
    }
}
