package test;  
  
import java.util.List;  
  
/** 
 * @author zhuc 
 * @version 2012-5-17 ÏÂÎç9:15:50 
 */  
public interface IService {  
    /** 
     * @param name 
     * @return 
     */  
    public String sayHello(String name);  
      
    /** 
     * @return 
     */  
    public Car getMyCar();  
      
    /** 
     * @return 
     */  
    public List<String> getList();  
}