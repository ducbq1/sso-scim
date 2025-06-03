package lol.maki.dev.todo.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lol.maki.dev.todo.exception.ErrorCode;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private int code = ErrorCode.OK.getCode();

    private String message;
    private T result;

    public ApiResponse() {}

    private ApiResponse(Builder<T> builder) {
        this.setCode(builder.code);
        this.setMessage(builder.message);
        this.setResult(builder.result);
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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    // ✅ Builder Pattern
    public static class Builder<T> {
        private int code = ErrorCode.OK.getCode();
        private String message;
        private T result;

        public Builder<T> code(int code) {
            this.code = code;
            return this;
        }

        public Builder<T> message(String message) {
            this.message = message;
            return this;
        }

        public Builder<T> result(T result) {
            this.result = result;
            return this;
        }

        public ApiResponse<T> build() {
            return new ApiResponse<>(this);
        }
    }

    // ✅ Phương thức tạo Builder nhanh
    public static <T> Builder<T> builder() {
        return new Builder<>();
    }
}
