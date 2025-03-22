import java.util.*;
import java.io.*;

public class index {
    public static void main(String[] args) {
        for(char ch = 'z'; ch > 'a'; ch --){
            if(ch % 2 == 0){
                System.out.print(ch+"\t");
            }else{
                System.out.print((char)(ch-32) + "\t");
            }
        }
    }
}
