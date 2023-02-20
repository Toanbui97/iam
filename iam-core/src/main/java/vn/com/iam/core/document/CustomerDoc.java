package vn.com.iam.core.document;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "customer")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class CustomerDoc extends BaseDocument {

    String username;
    String password;
    String customerName;
    String customerCode;
    Integer age;
    String address;
    LocalDate dateOfBirth;
    String idNumber;

}
