package test;  
  
import java.util.ArrayList;  
import java.util.List;  
  
import com.caucho.hessian.server.HessianServlet;  
  
/** 
 * @author zhuc 
 * @version 2012-5-17 ÏÂÎç9:16:35 
 */  
public class ServiceImpl extends HessianServlet implements IService {   
  
    /** 
     *  
     */  
    private static final long serialVersionUID = 8385639368192939451L;  
  
    public String sayHello(String name) {  
        return "hello: " + name;  
    }  
  
    public Car getMyCar() {  
        Car c = new Car();  
        c.setName("¹þ¹þ³µ");  
        return c;  
    }  
  
    public List<String> getList() {  
        List<String> list = new ArrayList<String>();  
        list.add("haha");  
        list.add("hehe");  
        return list;  
    }  
  
} 