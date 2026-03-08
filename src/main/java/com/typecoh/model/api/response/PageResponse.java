package com.typecoh.model.api.response;

import com.typecoh.model.enums.ResultCode;
import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * @author Typecoh
 * @date 2025/10/5  23:43
 * @description
 */
@Data
public class PageResponse<T> implements Serializable {

    // 当前页
    private int currentPage;
    // 每页大小
    private int pageSize;
    // 总记录数
    private long totalSize;
    // 总页数
    private long totalPages;
    // 当前页的开始坐标
    private Integer startIndex = 1;
    // 当前页的结束坐标
    private Integer endIndex = 0;
    // 结果集
    private List<T> result = Collections.emptyList();

    public PageResponse() {
    }


    public PageResponse(int currentPage, int pageSize) {
        this.currentPage = currentPage <= 0 ? 1 : currentPage;
        this.pageSize = pageSize <= 0 ? 10 : pageSize;
    }


    public PageResponse(int currentPage, int pageSize, long totalSize, long totalPages, List<T> result) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalSize = totalSize;
        this.totalPages = totalPages;
        this.result = result;
    }
}

