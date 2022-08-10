package com.SpitalSpring.SpitalSpring.exceptions;

public class NoSpecialityException extends Exception{
    public NoSpecialityException(){
        super("Speciality doesn't exist.");
    }
}
