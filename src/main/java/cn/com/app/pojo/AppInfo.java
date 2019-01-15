package cn.com.app.pojo;


import java.util.Date;

/**
*APK软件类
*/

public class AppInfo {

  private Long id;  //主键id
  private String softwareName;  //软件名称
  private String apkName;  //APK名称（唯一）
  private String supportRom;  //支持ROM
  private String interfaceLanguage;  //界面语言
  private Double softwareSize;  //软件大小（单位：M）
  private Date updateDate;  //更新日期
  private Long devId;  //开发者id（来源于：dev_user表的开发者id）
  private String appInfo;  //应用简介
  private Long status;  //状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）
  private Date onSaleDate;  //上架时间
  private Date offSaleDate;  //下架时间
  private Long flatformId;  //所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）
  private Long downloads;  //下载量（单位：次）
  private Long createdBy;  //创建者（来源于dev_user开发者信息表的用户id）
  private Date creationDate;  //创建时间
  private Long modifyBy;  //更新者（来源于dev_user开发者信息表的用户id）
  private Date modifyDate;  //最新更新时间
  private Long categoryLevel1;  //所属一级分类（来源于：app_category）
  private Long categoryLevel2;  //所属二级分类（来源于：app_category）
  private Long categoryLevel3;  //所属三级分类（来源于：app_category）
  private String logoPicPath;  //LOGO图片url路径
  private String logoLocPath;  //LOGO图片的服务器存储路径
  private Long versionId;  //最新的版本id

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSoftwareName() {
    return softwareName;
  }

  public void setSoftwareName(String softwareName) {
    this.softwareName = softwareName;
  }

  public String getApkName() {
    return apkName;
  }

  public void setApkName(String apkName) {
    this.apkName = apkName;
  }

  public String getSupportRom() {
    return supportRom;
  }

  public void setSupportRom(String supportRom) {
    this.supportRom = supportRom;
  }

  public String getInterfaceLanguage() {
    return interfaceLanguage;
  }

  public void setInterfaceLanguage(String interfaceLanguage) {
    this.interfaceLanguage = interfaceLanguage;
  }

  public Double getSoftwareSize() {
    return softwareSize;
  }

  public void setSoftwareSize(Double softwareSize) {
    this.softwareSize = softwareSize;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public Long getDevId() {
    return devId;
  }

  public void setDevId(Long devId) {
    this.devId = devId;
  }

  public String getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(String appInfo) {
    this.appInfo = appInfo;
  }

  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public Date getOnSaleDate() {
    return onSaleDate;
  }

  public void setOnSaleDate(Date onSaleDate) {
    this.onSaleDate = onSaleDate;
  }

  public Date getOffSaleDate() {
    return offSaleDate;
  }

  public void setOffSaleDate(Date offSaleDate) {
    this.offSaleDate = offSaleDate;
  }

  public Long getFlatformId() {
    return flatformId;
  }

  public void setFlatformId(Long flatformId) {
    this.flatformId = flatformId;
  }

  public Long getCategoryLevel3() {
    return categoryLevel3;
  }

  public void setCategoryLevel3(Long categoryLevel3) {
    this.categoryLevel3 = categoryLevel3;
  }

  public Long getDownloads() {
    return downloads;
  }

  public void setDownloads(Long downloads) {
    this.downloads = downloads;
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

  public Long getCategoryLevel1() {
    return categoryLevel1;
  }

  public void setCategoryLevel1(Long categoryLevel1) {
    this.categoryLevel1 = categoryLevel1;
  }

  public Long getCategoryLevel2() {
    return categoryLevel2;
  }

  public void setCategoryLevel2(Long categoryLevel2) {
    this.categoryLevel2 = categoryLevel2;
  }

  public String getLogoPicPath() {
    return logoPicPath;
  }

  public void setLogoPicPath(String logoPicPath) {
    this.logoPicPath = logoPicPath;
  }

  public String getLogoLocPath() {
    return logoLocPath;
  }

  public void setLogoLocPath(String logoLocPath) {
    this.logoLocPath = logoLocPath;
  }

  public Long getVersionId() {
    return versionId;
  }

  public void setVersionId(Long versionId) {
    this.versionId = versionId;
  }

  @Override
  public String toString() {
    return "AppInfo{" +
            "id=" + id +
            ", softwareName='" + softwareName + '\'' +
            ", apkName='" + apkName + '\'' +
            ", supportRom='" + supportRom + '\'' +
            ", interfaceLanguage='" + interfaceLanguage + '\'' +
            ", softwareSize=" + softwareSize +
            ", updateDate=" + updateDate +
            ", devId=" + devId +
            ", appInfo='" + appInfo + '\'' +
            ", status=" + status +
            ", onSaleDate=" + onSaleDate +
            ", offSaleDate=" + offSaleDate +
            ", flatformId=" + flatformId +
            ", categoryLevel3=" + categoryLevel3 +
            ", downloads=" + downloads +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", modifyBy=" + modifyBy +
            ", modifyDate=" + modifyDate +
            ", categoryLevel1=" + categoryLevel1 +
            ", categoryLevel2=" + categoryLevel2 +
            ", logoPicPath='" + logoPicPath + '\'' +
            ", logoLocPath='" + logoLocPath + '\'' +
            ", versionId=" + versionId +
            '}';
  }
}
