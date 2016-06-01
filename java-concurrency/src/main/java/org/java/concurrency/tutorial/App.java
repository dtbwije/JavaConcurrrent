package org.java.concurrency.tutorial;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 * Hello world!
 *
 */
public class App 
{
    private static String getDefaultCharSet() {
        OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
        String enc = writer.getEncoding();
        return enc;
    }

    public static void main( String[] args )
    {
        FirstRunnableClass firstClass = new FirstRunnableClass();
        firstClass.run();

        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.setProperty("file.encoding", "Latin-1");
        System.out.println("file.encoding=" + System.getProperty("file.encoding"));
        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.out.println("Default Charset in Use=" + getDefaultCharSet());

    }
}
