package com.SpitalSpring.SpitalSpring.exceptions;

public class NoDoctorException extends Exception{
    public NoDoctorException(){
        super("Doctor doesn't exist.");
    }
}
