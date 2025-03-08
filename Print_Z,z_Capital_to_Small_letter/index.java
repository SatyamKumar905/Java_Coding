import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        
        for(char ch = 'Z'; ch >= 'A'; ch --){
            System.out.print(ch+" ");
            System.out.print((char)(ch + 32)+" ");
        }
    }
}
