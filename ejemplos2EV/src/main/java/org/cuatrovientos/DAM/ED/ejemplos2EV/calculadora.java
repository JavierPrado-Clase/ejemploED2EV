package org.cuatrovientos.DAM.ED.ejemplos2EV;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class calculadora 
{
	private static Logger logger = LogManager.getLogger();
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        logger.error("AAAAAAAAAAAAAAAA"+args[0]);
    }
}