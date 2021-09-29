package com.company;

public class RecordNotFound extends Exception{
    public String toString(){
        return "Record with this identifier does not exist";
    }
}
