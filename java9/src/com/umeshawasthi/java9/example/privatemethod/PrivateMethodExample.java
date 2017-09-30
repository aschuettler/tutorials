package com.umeshawasthi.java9.example.privatemethod;

public interface PrivateMethodExample {

    private static String getDBDetails(){
        return "MySQL";
    }

    private boolean checkConnection(String DBDetails){
        return  DBDetails.equalsIgnoreCase("MySQL") ? true : false;
    }

    default void checkDBConnection(){
        String dbName = getDBDetails();
        boolean isAlive =   checkConnection(dbName);
    }
}
