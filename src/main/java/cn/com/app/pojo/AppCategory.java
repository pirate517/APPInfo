package cn.com.app.pojo;


import java.util.Date;

/**
* APP类别类
*/

public class AppCategory {

  private Long id;  //主键ID
  private String categoryCode;  //分类编码
  private String categoryName;  //分类名称
  private Long parentId;  //父级节点id
  private Long createdBy;  //创建者（来源于backend_user用户表的用户id）
  private Date creationTime;  //创建时间
  private Long modifyBy;  //更新者（来源于backend_user用户表的用户id）
  private Date modifyDate;  //最新更新时间

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCategoryCode() {
    return categoryCode;
  }

  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  public Long getModifyBy() {
    return modifyBy;
  }

  public void setModifyBy(Long modifyBy) {
    this.modifyBy = modifyBy;
  }

  public Date getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(Date modifyDate) {
    this.modifyDate = modifyDate;
  }

  @Override
  public String toString() {
    return "AppCategory{" +
            "id=" + id +
            ", categoryCode='" + categoryCode + '\'' +
            ", categoryName='" + categoryName + '\'' +
            ", parentId=" + parentId +
            ", createdBy=" + createdBy +
            ", creationTime=" + creationTime +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            '}';
  }
}
