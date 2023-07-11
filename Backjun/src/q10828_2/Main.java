package q10828_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String nums = bf.readLine();
			int num = Integer.parseInt(nums);
			String str = "";
			Stack0 stack = new Stack0(new int [num]);
			
			
			for(int i = 0; i<num; i++) {
				str = bf.readLine();
				StringTokenizer st = new StringTokenizer(str);
				
				String str1 = st.nextToken();

				if(str1.equals("push")) {
					int cmd = Integer.parseInt(st.nextToken());
					stack.push(cmd);
				}
				else if(str1.equals("pop")) {
					stack.pop();
				}
				else if(str.equals("size")) {
					stack.size();
				}
				else if(str.equals("empty")) {
					stack.empty();
				}
				else if(str.equals("top")) {
					stack.top();
				}
			}
			
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
}
}
