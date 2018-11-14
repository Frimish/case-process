package com.bm.process.dto.comm;

/**
* @Package com.bm.process.pojo.comm 
* @Title: QueryParam.java   
* @Description: TODO  
* @author steven  
* @date 2018年6月1日 下午4:38:47
* @version V1.0
 */
public class QueryParamDTO {

	private Integer start = 0;
	private Integer pageSize = 25;
	private Integer page = 1;
	private String sortBy;

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
