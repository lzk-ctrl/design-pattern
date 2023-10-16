package Adapter;

public abstract class Adaptee {
    public String encryptApi(String str) {
        StringBuffer ans = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            ans.append((char)(c + 1));
        }
        return ans.toString();
    }

}
