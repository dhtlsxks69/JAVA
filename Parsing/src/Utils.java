import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
	public static void main(String[] args) {
		String a = "A";
		String b = "가";

//		System.out.println(a.length());
//		System.out.println(a.getBytes().length);
//
//		System.out.println(b.length());
//		System.out.println(b.getBytes().length);

//		String content1 = "버퍼 캐시를 이용하여 처리하는 방식과 직접 디스크에 접근하여 데이터를 접근하는 방식에 차이는 무엇인지 알아보자. 논리적 I/O 와 물리적 I/O 오라클에";
//		System.out.println(content1.length());
//
//		String content2 = "오라클 버퍼캐시 hit ratio를 저하시키는 쿼리를 찾을때 사용합니다. --buffer cache hit ratio select buffer_gets,disk_reads,executions";
//		System.out.println(content2.length());
//
//		String content3 = "read) - 오라클에서 I/O는 블록단위 When? - 메모리 버퍼캐시에서 버퍼블록을 액세스 할때 - 데이터파일에 저장된 데이터 블록을 DB 버퍼캐시에 적재할때";
//		System.out.println(content3.length());
//
//		System.out.println(content1.getBytes().length);
//		System.out.println(content2.getBytes().length);
//		System.out.println(content3.getBytes().length);

		// byte 계산
		String content4 = "오라클에서 SQL을 파싱하는 것을 내부에 저장하고 있는 라이브러리 캐시와 데이터를 캐시하고 있는 DB 버퍼캐시가 존재한다. 이 데이터를 저장하고 있는 캐시 또한 SGA의 중요한 요소 중 하나이다.데이터 블록에 대해 캐시를 해두어서 다음번에 읽어들일때 같은 작업을 반복해서 하지 않도록 하는 기능을 제공한다.그럼 이런 버퍼 캐시를 이용하여 처리하는 방식과 직접 디스크에 접근하여 데이터를 접근하는 방식에 차이는 무엇인지 알아보자.논리적 I/O 와 물리적 I/O오라클에서 SQL 문장을 처리하는 과정에는 두 가지 I/O가 존재한다. 하나는 논리적 블록 I/O 나머지는 물리적 블록 I/O이다. 논리적 I/O는 SQL 문장을 처리하는 과정에서 메모리 버퍼캐시에서 발생한 총 블록 I/O로써 메모리에 접근하여 데이터를 가져온 블록 수를 말한다.물리적 I/O는 디스크에서 발생한 총 블록 I/O를 말한다. 대부분의 경우가 논리적 I/O와 물리적 I/O가 동시에 발생한다. (물리적 I/O가 비용이 비싸기 때문에 캐시가 적절하게 되어있는것이 중요하다.)";
		String content5 = "- DB 버퍼캐시는 해시테이블 구조- 해시 함수에 DBA를 입력해 리턴 받은 Hash value가 같은 블록들을 Hash bucket에 Linked list 구조로 연결- 찾고자 하는 데이터 블록주소를 해시 값으로 변환해서 해당 해시 버킷에서 체인을 따라 스캔하다가 거기서 찾 아지면 바로 읽고(Cache Hit), 찾지못하면 디스크에서 읽어(Cache Miss) 해시 체인에 연결한 후 읽는다.- 버퍼 헤더만 해시체인에 연결되며, 실제의 데이터 값이 필요해지면 버퍼 헤더에 있는 포인터를 이용해 버퍼블록을 찾아가는 구조- DBA(Data Block Address) : 데이터 블록 주소이며 데이터블록을 해싱하기위해 사용되는 키 값 - 해시체인(Hash Chain) : 각각의 연결리스트(Linked list)";
		String content6 = "오라클 버퍼캐시 hit ratio를 저하시키는 쿼리를 찾을때 사용합니다.--buffer cache hit ratioselect buffer_gets,disk_reads,executions,trunc(buffer_per_exec) buffer_per_exec,sql_text from (select buffer_gets,disk_reads,executions,buffer_gets/decode(executions,0,1,executions) buffer_per_exec,sql_textfrom v$sqlarea order by 4 desc)where rownum <= &p_rank;";
		System.out.println(content4.getBytes().length);
		System.out.println(content5.getBytes().length);
		System.out.println(content6.getBytes().length);

		// 영어개수 계산
		Pattern nonValidPattern = Pattern.compile("[a-zA-Z]");

		Matcher matcher = nonValidPattern.matcher(content4);
		String result = "";

		while (matcher.find()) {
			result += matcher.group();
		}
		System.out.println("4의 영어개수 : "+result.length());

		// 영어개수 계산
		Pattern nonValidPattern1 = Pattern.compile("[a-zA-Z]");

		Matcher matcher1 = nonValidPattern1.matcher(content5);
		String result1 = "";

		while (matcher1.find()) {
			result1 += matcher1.group();
		}
		System.out.println("5의 영어개수 : "+result1.length());
		
		// 영어개수 계산
		Pattern nonValidPattern2 = Pattern.compile("[a-zA-Z]");

		Matcher matcher2 = nonValidPattern2.matcher(content6);
		String result2 = "";

		while (matcher2.find()) {
			result2 += matcher2.group();
		}
		System.out.println("6의 영어개수 : "+result2.length());
		
		// 한글개수 계산
		Pattern nonValidPattern3 = Pattern.compile("[\\u3131-\\u318E\\uAC00-\\uD7A3]");

		Matcher matcher3 = nonValidPattern3.matcher(content4);
		String result3 = "";

		while (matcher3.find()) {
			result3 += matcher3.group();
		}
		System.out.println("4의 한글개수 : "+result3.length());

		// 한글개수 계산
		Pattern nonValidPattern4 = Pattern.compile("[\\u3131-\\u318E\\uAC00-\\uD7A3]");

		Matcher matcher4 = nonValidPattern3.matcher(content5);
		String result4 = "";

		while (matcher4.find()) {
			result4 += matcher4.group();
		}
		System.out.println("5의 한글개수 : "+result4.length());

		// 한글개수 계산
		Pattern nonValidPattern5 = Pattern.compile("[\\u3131-\\u318E\\uAC00-\\uD7A3]");

		Matcher matcher5 = nonValidPattern5.matcher(content6);
		String result5 = "";

		while (matcher5.find()) {
			result5 += matcher5.group();
		}
		System.out.println("6의 한글개수 : "+result5.length());

		// 영어6자 = 한글4자

		// 문자열 자르기 알고리즘
	}
}
