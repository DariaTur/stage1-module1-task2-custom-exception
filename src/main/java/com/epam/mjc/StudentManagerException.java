package com.epam.mjc;

public class StudentManagerException extends IllegalArgumentException{

    public StudentManagerException(){
        super();
    }

    public StudentManagerException(String message){
        super(message);
    }
}
