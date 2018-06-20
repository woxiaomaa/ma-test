package client;
import java.net.MalformedURLException;  
import java.util.List;  
  
import com.caucho.hessian.client.HessianProxyFactory;

import test.Car;
import test.IService;  
  
/** 
 * @author zhuc 
 * @version 2012-5-17 ÏÂÎç9:31:14 
 */  
public class ClientTest {  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        String url = "http://localhost:8080/Hello";  
        HessianProxyFactory factory = new HessianProxyFactory();  
        try {  
            IService hello = (IService) factory.create(IService.class, url);  
            System.out.println(hello.sayHello("zhuc-no"));  
  
            Car c = hello.getMyCar();  
            System.out.println(c.getName());  
  
            List<String> list = hello.getList();  
            for (String string : list) {  
                System.out.println(string);  
            }  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        }  
  
    }  
  
}  