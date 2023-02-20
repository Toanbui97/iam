package vn.com.iam.core.util.factory.mapper;

import org.mapstruct.Mapper;
import vn.com.iam.core.document.CustomerDoc;
import vn.com.iam.core.dto.CustomerDTO;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDTO documentToDTO(CustomerDoc customerDoc);
    CustomerDoc DTOToDocument(CustomerDTO customerDTO);
}
