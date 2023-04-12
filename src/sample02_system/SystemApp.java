package sample02_system;

import java.util.Enumeration;
import java.util.Set;

public class SystemApp {

	public static void main(String[] args) {
		
		// System 클래스의 주요 메소드
		
		// currentTimeMillis() - 시스템의 현재 날짜와 시간정보를 표현하는 유닉스 타임값을 long타입의 정수값으로 반환한다.
		// 유닉스 타임은 1970년 1월 1일 00:00:00부터 현재 시간까지의 시간정보를 1/1000초 단위로 환산한 값이다.
		long unixTime = System.currentTimeMillis();
		System.out.println("유닉스타임 -> " + unixTime);
		
		// getenv(시스템환경변수이름) - 지정된 시스템환경변수값을 반환한다.
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("자바홈 디렉토리 경로 -> " + javaHome);
		
		System.out.println("##### 시스템 환경 변수 #####");
	      Set<String> keys = System.getenv().keySet();
	      for (String key : keys) {
	         System.out.println("["+key+"] -> ["+System.getenv(key)+"]");
	      }
	      
	   // getProperty(시스템프로퍼티명) - 지정된 이름의 시스템프로퍼티값을 반환한다.
	      System.out.println("##### 시스템 프로퍼티 값 #####");
	      Enumeration<Object> enumerations = System.getProperties().keys();
	      while (enumerations.hasMoreElements()) {
	         String key = (String) enumerations.nextElement();
	         System.out.println("["+key+"] -> ["+System.getProperty(key)+"]");
	      }
	}
}
