package com.typecoh.model.api.request;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 分页请求参数
 */
@Data
public class PageRequest<T> implements Serializable {
    // 当前页
    private Integer currentPage;
    // 每页大小
    private Integer pageSize;

    public PageRequest() {
    }

    public PageRequest(int currentPage, int pageSize) {
        this.currentPage = currentPage <= 0 ? 1 : Math.min(currentPage, Integer.MAX_VALUE);
        this.pageSize = pageSize <= 0 ? 10 : Math.min(pageSize, Integer.MAX_VALUE);
    }
}