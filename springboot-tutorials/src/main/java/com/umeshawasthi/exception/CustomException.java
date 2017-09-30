package com.umeshawasthi.exception;

/**
 * Created by umesh on 7/10/17.
 */
public class CustomException extends  Exception {

    public  CustomException(){

    }

    public CustomException(String message){
        super(message);
    }
}
