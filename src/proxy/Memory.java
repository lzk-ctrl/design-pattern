package proxy;

import java.util.HashMap;

public abstract class Memory {
    protected HashMap<Integer,String> memoryMap ;
    public String getData(int address){
        return memoryMap.get(address);
    }
    public void addData(int address,String data){
        memoryMap.put(address,data);
    }
}
