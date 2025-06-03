package lol.maki.dev.todo.dto.request;

import lombok.Data;

import java.util.Map;

@Data
public class SearchRequest {
    private Map<String, String> filters;
    private int page;
    private int size;
    private String sort;
}
