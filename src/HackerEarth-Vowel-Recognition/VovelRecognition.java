import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger; 

public class VovelRecognition {

	static char vovels[] = {'a','e','i','o','u','A','E','I','O','U'};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
        
        	String input = br.readLine();
            BigInteger count = BigInteger.ZERO;
            int m = input.length();
        	for (int j =0;j<m ;j++ ) {
        		if(contains(input.charAt(j))){
        			count = count.add(BigInteger.valueOf(m).add(BigInteger.valueOf(j).multiply(BigInteger.valueOf(m-j-1))));
        		}
        	}
        	System.out.println(count);

    	}
    }
    static boolean contains(char a){
    	for (int i=0;i<10 ;i++ ) {
    		if(a==vovels[i])
    			return true;
    	}
    	return false;
    }
}