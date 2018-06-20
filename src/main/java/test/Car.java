package test;  
  
import java.io.Serializable;  
  
/** 
 * @author zhuc 
 * @version 2012-5-17 ÏÂÎç10:29:18 
 */  
public class Car implements Serializable {  
  
    /** 
     *  
     */  
    private static final long serialVersionUID = -1115598660168001267L;  
  
    private String name;  
  
    /** 
     * @return the name 
     */  
    public String getName() {  
        return name;  
    }  
  
    /** 
     * @param name the name to set 
     */  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    /** 
     * @return the serialversionuid 
     */  
    public static long getSerialversionuid() {  
        return serialVersionUID;  
    }  
      
      
}  