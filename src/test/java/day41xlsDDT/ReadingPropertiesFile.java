package day41xlsDDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {
    static void main(String[] args) throws IOException {

        //location of properties file
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\config.properties");

        //loading properties file
        Properties propertiesobj = new Properties();
        propertiesobj.load(file);

        //Reading data from properties file
        String url=propertiesobj.getProperty("appurl");
        String email=propertiesobj.getProperty("email");
        String pwd=propertiesobj.getProperty("password");
        String orid=propertiesobj.getProperty("orderid");
        String custid=propertiesobj.getProperty("customerid");

        System.out.println(url+" "+email+" "+pwd+" "+orid+" "+custid);

        //Reading all the keys from properties file
        //Approach 1
        Set<String> keys1=propertiesobj.stringPropertyNames();
        System.out.println(keys1);

        //Approach 2
        Set<Object> keys2=propertiesobj.keySet();
        System.out.println(keys2);

        //Reading all the values from properties file
        Collection<Object> values=propertiesobj.values();
        System.out.println(values);

        file.close();

    }
}
