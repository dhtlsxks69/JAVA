package test;

class Earth{
	String name = "����";
	
	public String getName() {
		return name;
	}
}

class Asia extends Earth{ //���
	String name = "�ƽþ�";
	
	public String getName() {
		return name;
	}
}

class Korea extends Asia{ //���
	String name = "�ѱ�";
	
	public String getName() {
		return name;
	}
}

class Daejeon extends Korea{ //���
	String name = "����";
	
	public String getName() {
		return name;
	}
}

public class BindApp {
	public static void main(String[] args) {
		Earth d = new Asia();
		System.out.println( d.getName());
	}
}