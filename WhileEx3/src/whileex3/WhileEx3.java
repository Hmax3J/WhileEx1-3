package whileex3;
import java.io.*;
import java.util.*;

public class WhileEx3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //�ʱⰪ �Է�
		int sum = n; //�ʱⰪ ����
		int count = 0; // ����Ŭ Ƚ�� ����

		while(true)
		{
			n = ( (n % 10) * 10 ) + ( (n / 10 + n % 10) % 10);
			count++;
			if(sum==n) break;
		}
		System.out.println(count);
		
	}

}