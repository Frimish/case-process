package com.bm.process.pojo.comm;

import java.util.List;

/**
* @Package com.bm.process.pojo.comm 
* @Title: PagedResult.java   
* @Description: TODO  
* @author steven  
* @date 2018年6月1日 上午11:24:11
* @version V1.0
 */
public class PagedResult {
    private long total;
    private List<?> rows;

    /**
     * @return the total
     */
    public long getTotal() {
        return total;
    }

    /**
     * @param total
     *            the total to set
     */
    public void setTotal(long total) {
        this.total = total;
    }

    /**
     * @return the rows
     */
    public List<?> getRows() {
        return rows;
    }

    /**
     * @param rows
     *            the rows to set
     */
    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
