package cn.com.app.pojo;

import java.util.List;

/**
*分页类
*/

public class Page<T> {
    private int pageSize;  //每页条数
    private int pageNumber;  //页码
    private int totalRecode;  //总条数
    private List<T> pageData;  //页面数据
    private String servletURL;  //连接地址

    public Page() {
    }

    public Page(int pageSize, int pageNumber, int totalRecode, List<T> pageData) {
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.totalRecode = totalRecode;
        this.pageData = pageData;
    }

    /**
     * 计算总页码数
     * @return totalPage
     */
    public int getTotalPage(){
        return totalRecode%pageSize==0? totalRecode/pageSize : totalRecode/pageSize+1;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getTotalRecode() {
        return totalRecode;
    }

    public void setTotalRecode(int totalRecode) {
        this.totalRecode = totalRecode;
    }

    public List<T> getPageData() {
        return pageData;
    }

    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }

    public String getServletURL() {
        return servletURL;
    }

    public void setServletURL(String servletURL) {
        this.servletURL = servletURL;
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageSize=" + pageSize +
                ", pageNumber=" + pageNumber +
                ", totalRecode=" + totalRecode +
                ", pageData=" + pageData +
                '}';
    }
}
