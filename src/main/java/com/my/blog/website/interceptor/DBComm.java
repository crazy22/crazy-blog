package com.my.blog.website.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class DBComm {

    private static String DB_URL;

    private static String USER_NAME;

    private static String PWD;


    @Autowired
    public DBComm(@Value("${spring.datasource.url}") String dbUrl,
                  @Value("${spring.datasource.username}") String userName,
                  @Value("${spring.datasource.password}") String pwd) {
        DBComm.setDbUrl(dbUrl);
        DBComm.setUserName(userName);
        DBComm.setPWD(pwd);
    }

    public static void setDbUrl(String dbUrl) {
        DBComm.DB_URL = dbUrl;
    }

    public static void setUserName(String userName) {
        DBComm.USER_NAME = userName;
    }

    public static void setPWD(String PWD) {
        DBComm.PWD = PWD;
    }

    public static String getDbUrl() {
        return DB_URL;
    }

    public static String getUserName() {
        return USER_NAME;
    }

    public static String getPwd() {
        return PWD;
    }
}
