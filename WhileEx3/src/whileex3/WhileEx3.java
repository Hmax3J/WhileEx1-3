package whileex3;
import java.io.*;
import java.util.*;

public class WhileEx3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //초기값 입력
		int sum = n; //초기값 복사
		int count = 0; // 싸이클 횟수 선언

		while(true)
		{
			n = ( (n % 10) * 10 ) + ( (n / 10 + n % 10) % 10);
			count++;
			if(sum==n) break;
		}
		System.out.println(count);
		
	}

}