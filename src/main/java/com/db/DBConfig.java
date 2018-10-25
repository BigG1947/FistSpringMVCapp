package com.db;

class DBConfig {

    private String host = "localhost";
    private int port = 1521;
    private String sid = "xe";
    private String user = "HelloWorldAPP";
    private String pwd = "helloWorld666";

    String getHost() {
        return host;
    }

    int getPort() {
        return port;
    }

    String getSid() {
        return sid;
    }

    String getUser() {
        return user;
    }

    String getPwd() {
        return pwd;
    }
}
