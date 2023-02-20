package vn.com.iam.core.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerDTO implements Serializable {
    String username;
    String customerName;
    String customerCode;
    Integer age;
    String address;
    @JsonFormat(pattern = "dd/MM/yyyy")
    LocalDate dateOfBirth;
    String idNumber;
}
