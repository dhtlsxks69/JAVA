package craw;

public class CrawTest {

	public static void main(String[] args) {
		String oid = "001";
		String aid = "0000000001";
		
		while(true){
			String url = "https://news.naver.com/main/read.nhn?mode=LSD&mid=shm&sid1=100&oid=" + oid + "&aid=" + aid;
			
			//ũ�ѷ�
			try {
				
			} catch (Exception e) {
				
			}
			
			//1���� ���Ѿ���.
			//static�޼ҵ� ȣ��
			oid = Utils.makeOid(oid);
			aid = Utils.makeAid(aid);
			
//			System.out.println("oid : "+oid);
			
			if(aid.equals("0000000099")){
				break;
			}
			
			System.out.println("aid : "+aid);
		}
		
	}

}