package cn.com.app.pojo;

/**
 * Created by 张鹏 on 2019/1/14
 * App信息扩展类
 */
public class AppInfoExt extends AppInfo{

    private DevUser devUser;
    private DataDictionary dataDictionary;
    private AppCategory appCategory;

    public DevUser getDevUser() {
        return devUser;
    }

    public void setDevUser(DevUser devUser) {
        this.devUser = devUser;
    }

    public DataDictionary getDataDictionary() {
        return dataDictionary;
    }

    public void setDataDictionary(DataDictionary dataDictionary) {
        this.dataDictionary = dataDictionary;
    }

    public AppCategory getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(AppCategory appCategory) {
        this.appCategory = appCategory;
    }
}
