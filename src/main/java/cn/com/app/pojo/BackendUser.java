package cn.com.app.pojo;


import java.util.Date;

/**
* 后台管理类
*/

public class BackendUser {

  private Long id;  //主键id
  private String userCode;  //用户账户
  private String userName;  //用户名称
  private Long userType;  //用户角色类型（来源于数据字典表，分为：超管、财务、市场、运营、销售）
  private Long createdBy;  //创建者（来源于backend_user用户表的用户id）
  private Date creationDate;  //创建时间
  private Long modifyBy;  //更新者（来源于backend_user用户表的用户id）
  private Date modifyDate;  //最新更新时间
  private String userPassword;  //用户密码

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserCode() {
    return userCode;
  }

  public void setUserCode(String userCode) {
    this.userCode = userCode;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Long getUserType() {
    return userType;
  }

  public void setUserType(Long userType) {
    this.userType = userType;
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

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  @Override
  public String toString() {
    return "BackendUser{" +
            "id=" + id +
            ", userCode='" + userCode + '\'' +
            ", userName='" + userName + '\'' +
            ", userType=" + userType +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            ", userPassword='" + userPassword + '\'' +
            '}';
  }
}
