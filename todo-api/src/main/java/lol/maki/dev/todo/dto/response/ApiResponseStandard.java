package lol.maki.dev.todo.dto.response;

import java.util.List;

import org.springframework.http.HttpStatus;

public class ApiResponseStandard<T> {
    private String status;
    private int code;
    private String message;
    private T data;
    private List<ApiError> errors;

    public static <T> ApiResponseStandard<T> success(T data, String message) {
        ApiResponseStandard<T> response = new ApiResponseStandard<>();
        response.setData(data);
        response.setMessage(message);
        response.setCode(HttpStatus.OK.value());
        response.setStatus(HttpStatus.OK.getReasonPhrase());
        return response;
    }

    public static <T> ApiResponseStandard<T> error(T data, String message) {
        ApiResponseStandard<T> response = new ApiResponseStandard<>();
        response.setData(data);
        response.setMessage(message);
        response.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        return response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<ApiError> getErrors() {
        return errors;
    }

    public void setErrors(List<ApiError> errors) {
        this.errors = errors;
    }

    public static class ApiError {
        private String field;
        private String message;
    }
}
