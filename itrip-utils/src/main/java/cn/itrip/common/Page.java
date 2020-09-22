package cn.itrip.common;

import java.util.List;

/**
 * 分页封装类
 * @param <T>
 */
public class Page<T> {
    public Page(int pageIndex, int pageSize, int totalCount, List<T> data) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.data = data;
        this.totalPageCount = this.totalCount % this.pageSize == 0 ?
                this.totalCount / this.pageSize : this.totalCount / this.pageSize + 1;
    }

    private int pageIndex;
    private int pageSize;
    private int totalCount;
    private int totalPageCount;
    private List<T> data;
    private boolean hasPrevious;
    private boolean hasNext;

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public List<T> getData() {
        return data;
    }

    public boolean isHasPrevious() {
        return this.pageIndex > 1;
    }

    public boolean isHasNext() {
        return this.pageIndex < this.totalPageCount;
    }
}
