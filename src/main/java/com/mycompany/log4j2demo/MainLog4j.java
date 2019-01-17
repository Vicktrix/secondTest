package com.mycompany.log4j2demo;
/*
    This is example from https://www.youtube.com/watch?v=rbuR9Q_55h4 
    and used gitHub Example from https://www.youtube.com/watch?v=MbwHOw6JXI8 
*/
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainLog4j{

    private static Logger logger = LogManager.getLogger(MainLog4j.class);
    public static void main(String[] args){
        System.out.println("\n Hello World!!! \n");
        
        logger.trace("This is trsce message");
        logger.info("This is information message");
        logger.error("This is error message");
        logger.fatal("This is fatal message");
        logger.warn("This is warn message");
        
        System.out.println("\n Comleted \n");
    }
}
