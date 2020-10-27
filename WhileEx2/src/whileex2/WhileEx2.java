package whileex2;
import java.io.*;
import java.util.*;

public class WhileEx2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		String str;
		
		
		while( (str=br.readLine()) != null)
		{
			StringTokenizer st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append((a+b)).append("\n");
		}
		System.out.print(sb);

	}

}