package cn.com.app.pojo;


import java.util.Date;

/**
* 字典类
*/

public class DataDictionary {

  private Long id;  //主键id
  private String typeCode;  //类型编码
  private String typeName;  //类型名称
  private Long valueId;  //类型值ID
  private String valueName;  //类型值Name
  private Long createdBy;  //创建者（来源于backend_user用户表的用户id）
  private Date creationDate;  //创建时间
  private Long modifyBy;  //更新者（来源于backend_user用户表的用户id）
  private Date modifyDate;  //最新更新时间

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public Long getValueId() {
    return valueId;
  }

  public void setValueId(Long valueId) {
    this.valueId = valueId;
  }

  public String getValueName() {
    return valueName;
  }

  public void setValueName(String valueName) {
    this.valueName = valueName;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
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
    return "DataDictionary{" +
            "id=" + id +
            ", typeCode='" + typeCode + '\'' +
            ", typeName='" + typeName + '\'' +
            ", valueId=" + valueId +
            ", valueName='" + valueName + '\'' +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            '}';
  }
}
