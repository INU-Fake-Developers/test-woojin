package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class s_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(st.nextToken());;
		int m = Integer.parseInt(st.nextToken());;

		HashSet<String> h_person = new HashSet<>();
		ArrayList<String> s_person = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			h_person.add(bf.readLine());
		}
		for (int i=0; i<m; i++) {
			String text = bf.readLine();
			if(h_person.contains(text)) {
				s_person.add(text);
			}
		}
		Collections.sort(s_person);
		
		System.out.println(s_person.size());
		for (int i=0; i<s_person.size(); i++) {
			System.out.println(s_person.get(i));
		}
	}
}
