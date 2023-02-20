package vn.com.iam.core.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {

    public static final class ResponseStatus {
        public static final int RESPONSE_STATUS_SUCCESS = 1;
        public static final int RESPONSE_STATUS_FAIL = 0;
    }

}
