package vn.com.iam.core.document;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class BaseDocument implements Serializable {

    @Id
    String id;

    @CreatedDate
    LocalDateTime createdAt;

    @LastModifiedDate
    LocalDateTime updatedAt;

    @CreatedBy
    String createdBy;

    @LastModifiedBy
    String updatedBy;

}
