package vn.com.iam.core.util.factory;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import vn.com.iam.core.constant.Constants;
import vn.com.iam.core.constant.ResponseStatusCode;

import java.util.List;

@Component
public class ResponseFactory {
    public <T> ResponseEntity<BodyResponse<T>> success(T data) {
        return ResponseEntity.ok(new BodyResponse<>(0, ResponseStatusCode.SUCCESS, data));
    }
    public <T> ResponseEntity<BodyResponse<T>> success(String uuid, T data) {
        return ResponseEntity.ok(new BodyResponse<>(0, ResponseStatusCode.SUCCESS, uuid, data));
    }
    public <T> ResponseEntity<BodyResponse<T>> success(List<T> dataList) {

        return ResponseEntity.ok(new BodyResponse<>(0, ResponseStatusCode.SUCCESS, dataList));
    }

    public <T> ResponseEntity<BodyResponse<T>> success(String uuid, List<T> dataList) {

        return ResponseEntity.ok(new BodyResponse<>(0, ResponseStatusCode.SUCCESS, uuid, dataList));
    }

    public <T> ResponseEntity<BodyResponse<T>> success(Page<T> page) {

        return ResponseEntity.ok(new BodyResponse<>(0, ResponseStatusCode.SUCCESS, page));
    }

    public ResponseEntity<BodyResponse<Object>> fail(HttpStatus status, ResponseStatusCode statusCode) {
        BodyResponse<Object> generalRes = new BodyResponse<>(statusCode, null, Constants.ResponseStatus.RESPONSE_STATUS_FAIL);
        return ResponseEntity.status(status).body(generalRes);
    }

    public <T> ResponseEntity<BodyResponse<T>> success(String requestId) {
        return ResponseEntity.ok(new BodyResponse<>(ResponseStatusCode.SUCCESS, requestId, Constants.ResponseStatus.RESPONSE_STATUS_SUCCESS));
    }

    public <T> ResponseEntity<BodyResponse<T>> success(String requestId, T data, ResponseStatusCode statusCode) {
        return ResponseEntity.ok(new BodyResponse<>(statusCode, requestId, Constants.ResponseStatus.RESPONSE_STATUS_SUCCESS, data));
    }

}
