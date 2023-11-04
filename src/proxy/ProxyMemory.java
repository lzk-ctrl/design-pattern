package proxy;

import java.util.HashMap;

public class ProxyMemory extends Memory{
    private ActuralMemory acturalMemory=null;
    public ProxyMemory(){
        memoryMap = new HashMap<Integer,String>();
    }
    public String getData(int address){
        if(acturalMemory == null){
            realize();
        }
        String result=memoryMap.get(address);
        if(result == null){
            result = acturalMemory.getData(address);
            memoryMap.put(address,result);
        }
        return result;
    }
    public void addData(int address,String data){
        if(acturalMemory == null){
            realize();
        }
        acturalMemory.addData(address,data);
    }
    public void realize(){
        if(acturalMemory == null){
            acturalMemory = new ActuralMemory();
        }
    }
}
