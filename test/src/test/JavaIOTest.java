package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JavaIOTest {
	//stream�̶� ���������� �����ϸ� �ȴ�. ���������� Ʋ�� ����
	//������ ���������� ��׸� ���� ������ �ʴ´�.
	//����� �ϱ� ���ؼ��� ��Ʈ���� �޸� �ȴ�.
	//��Ʈ���̶� ���� �帧�̶�� �� �� �ִ�.
	//��Ʈ���̶� byte��Ʈ���̴�.
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
