package com.hunau.myboot.properties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/**
 * @param
 * @Description:
 * @Return:
 * @Author: 蔡文静
 * @单位：湖南农业大学物联网工程专业
 * @Date:
 * @开发版本：综合练习VO.1
 */
@Component                              //构件
@ConfigurationProperties()
public class MysqlProperties {
    private String jdbcName;
    private String dbUrl;
    private String userName;
    private String password;
    public String getJdbcName() {
        return jdbcName;
    }
    public void setJdbcName(String jdbcName) {
        this.jdbcName = jdbcName;
    }
    public String getDbUrl() {
        return dbUrl;
    }
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
