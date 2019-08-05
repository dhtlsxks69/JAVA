package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JavaIOTest {
	//stream이랑 수도꼭지를 생각하면 된다. 수도꼭지를 틀면 물이
	//나오고 수도꼭지를 잠그면 물이 나오지 않는다.
	//통신을 하기 위해서는 스트림을 달면 된다.
	//스트림이란 물의 흐름이라고 할 수 있다.
	//스트림이란 byte스트림이다.
	public static void main(String[] args) {
//		InputStream in = System.in;
//		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String input = br.readLine();
			System.out.println(input);
		} catch (Exception e) {
			
		}
	}

}
