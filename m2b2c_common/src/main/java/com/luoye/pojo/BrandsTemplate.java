package com.luoye.pojo;

import java.util.ArrayList;
import java.util.List;

public class BrandsTemplate<T> {
    private List<T> rows =new ArrayList<>();
    private long total;

    public BrandsTemplate() {
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
