package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world! lolol
 *
 */
public class App 
{ 
    public static void main( String[] args )
    {
    	 System.out.println(FigletFont.convertOneLine( "Hello World!  I  rock !" ));
    	System.out.println(FigletFont.class.getResourceAsStream("/flf/font2.flf"));
    }
    }
