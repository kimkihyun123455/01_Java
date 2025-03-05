package edu.kh.io.pack2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class ByteService {

	/*
	 * 스트림(Stream) : 데이터가 이동하는 통로 기본적으로 한 방향으로 흐름
	 * 
	 * Byte 기반 스트림
	 * -1byte 단위로 데이터를 입/추렭하는 스트림
	 * -최상위 클래스 : InputSteam, OutputStream
	 * -문자열, 이미지, 영상, 오디오, pdf 등 모두 입출력 가능
	 * -단 통로가 1btye로 작다보니 속도가 느리고 깨질 위험이 있음
	 * 
	 */
	
	//IO 관련된 코드 IOException이 발생할 가능성이 높다
	//IO 관련 코드는 거의 모든 메서드가 throws IOException 작성
	//IOException 예외 처리 구문을 필수적으로 작성
	
	/**
	 * 바이트 기반 스트림을 이용한 파일 출력
	 * +데이터 출력
	 */
	public void fileByteOuput() {

		//FileOutputStream 참조 변수 선언
		FileOutputStream fos = null;
		
		try{
			//new FileOutputStream("경로)
			//경로에 작성된 파일과 연결된 파이 룿쳑 스트림 객체 생성
			//출력스트림에 연결된 파일이 존재하지 않으면 자동 생성
			//단 폴더는 생성해주지 않는다
			//기존 파일이 존재하면 내용을 덮어쓰기함
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트.txt");
			
			//String 의 불변성 문제를 해결한 객체 StringBuilder(비동기)/StringBuffer(동기)
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!!\n");
			sb.append("Delete World!!\n");
			sb.append("!@#%#$!^%\n");
			sb.append("짜잔 내가 돌아왔다");
			System.out.println(sb);
			
			//출력방법 1 : 한글자씩 파일로 출력
			
			//StringBuilder -> String 변환 -> charAt()
			String content = sb.toString();
			
			/*for(int i=0; i<content.length(); i++){
				
				char ch = content.charAt(i);
				fos.write(ch);//1byte 출력 스트림이 연결된 파일에 ch쓰기
			}*/
			
			//2byte 범주의 문자(영어 숫자 기본특수문자를 제외한 문자)는
			//바티으 기반 스트림 통과 시
			//데이터 손실이 발생하여 글자가 깨지는 문자가 발생한다
			
			//출력 방법 2 : String 을 byte[]로 변환 후 출력
			
			//****수행시간 확인할 수 있는 방법****
			//write() 수행시간 측정
			//System.nanoTime() : 1970.01.01 오전 9:00:00 부터
			//현재 시간까지의 차이를 ns(nano second)로 반환
			//1ms(밀리) == 1/1000s
			//1us(마이크로) == 1/1000ms
			//1ns(나노) == 1/1000us
			
			//이전
			long startTime = System.nanoTime();
			
			
			fos.write(content.getBytes());//byte[]로 만들어 반환
			
			//이후
			long endTime = System.nanoTime();
			
			System.out.println("[수행시간 : ]"+ (endTime - startTime)+"ns");
			
			
			fos.flush(); //스트림 안에 남아있는 모든 데이터를 밀어냄
			// FileOutputStream에서는 선택사항
			
			System.out.println("출력완료");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {//try 예외 발생 여부 관계 없이 무조건 수행
			//finally는 사용 완료한 스트림 닫거나 메모리 반환하는데 주로 쓰임
			//->메모리 누수 방지
			
			try{
				//스트림이 정상 생성된 경우
				//스트림을 닫는다
				//close() 메서드도 IOException을 방생시키기 때문에
				//try-catch 이용하여 예외 처리 필수
				if(fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}
	
	/**
	 * 버퍼를 이용한 파일 출력
	 * BufferedOutputStream 보조 스트림 이용
	 * 
	 */
	public void bufferedFileByteOutput() {
		
		/*
		 * 버퍼(Buffer)란?
		 * -데이터를 모아두는 공간, 마치 바구니 같은 메모리 공간 
		 * 
		 * 	BufferedOutputStream / BufferedInputStream
		 *  출력용 보조 스트림(바이트) / 입력용 보조 스트림(바이트)
		 * 
		 * -FileOutputStream 은 1바이트 씩 데이터를 입출력
		 * ->통로가 좁아서 데이터 입출력시 속도가 느림
		 * 
		 * ->보조스트림 이용 시 버퍼에 입출력할 내용을 모아서 한버넹 입출력
		 * (내부 버퍼에 데이터를 모아두었다가 일정 크기가 되면 한번에 출력)
		 * ->기반 스트림을 이용하는 획수가 적어져 성능, 시간효율이 상승한다
		 * 
		 * 
		 */
		FileOutputStream fos = null; //기반 스트림 참조변수 선언
		BufferedOutputStream bos = null; //보조 스트림 참조변수 선언
		
		try {
			
			fos = new FileOutputStream("/io_test/20250305/바이트기반_테스트_Buffered.txt");
			
			//기반 스트림 fos를 이용해 보조스트림 bos를 생성
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("Hello World!!\n");
			sb.append("Delete World!!\n");
			sb.append("!@#%#$!^%\n");
			sb.append("짜잔 내가 돌아왔다");
			System.out.println(sb);
			
			String content = sb.toString();
			//이전
			long startTime = System.nanoTime();
			
			bos.write(content.getBytes());//버퍼에 저장
			
			long endTime = System.nanoTime();
			
			System.out.println("[수행시간 : ]"+ (endTime - startTime)+"ns");
			
			bos.flush();//스트림 안에 남아있는 모든 데이터 밀어냄
			
			System.out.println("출력완료");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	public void fileByteINput() {
FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			//FileInputStream 이용시 해당 경로에 반드시 실제 파일이 존재해야한다
			//없으면 FileNouFoundException 발생한다
			
			//방법 1. 파일 내부 내용을 1byte씩 끊어서 가져오기
			//2byte 범주의 글자들은 깨져서 온다
			
			//byte : 자바에서 사용하는 정수형
			//다루기 힘들기 때문에 정수형 기본형은 int로 변환해서 사용
			
			int value =0; //읽어온 바이트값을 저장할 변수
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				
				value = fis.read(); //1byte 씩 끊어서 읽어오는 메서드
				//더 이상 읽을 값이 없을 때 read() 는 -1을 반환
				
				if(value==-1) break;
				
				sb.append((char)value);//텍스트 문자를 1byte 씩 들여오면서 정수형으로 들어오고
				//이를 char 형태로 강제 형변환해주면 다시 문자로 바뀐다. 이를 sb에 추가
			}
			
			System.out.println(sb.toString());
			
			//ImputStream은 flush() 없음
			//flush()는 출력 스트림에만 관련된 동작
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void fileByteInput2() {
		
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("\\io_test\\20250305\\노래가사.txt");
			
			//방법 2. 파일에 저장된 모든 byte 값을 다 읽어와 byte[]형태로 반환 받기
			//byte[] 배열을 이용해서 String 객체 생성
			
			byte[] bytes = fis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * BufferedInputStream 보조 스트림을 이용해 성능 향상
	 * 
	 * InputStream의 경우 외부 파일의 데이터를 읽어올 때 사용
	 * 읽어오는 파일의 크기가 작으면 보조 스트림의 성능 이점이 크게 눈에 띄지는 않는다
	 * 
	 * 
	 */
	public void bufferedFileByteInput() {
		
		//파일 입력용 바이트 기반 스트림 선언
		FileInputStream fis = null;
		//파일 입력용 바이트 보조 스트림 선언
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream("/io_test/20250305/노래가사.txt");
			
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			
			String content = new String(bytes);
			
			System.out.println(content);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(bis!=null) bis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
		}
		
		
		
		
	}
	
	/**
	 *외부에 있는 config.properties을 입출력하기
	 *->Map 계열인 Properties 클래서 사용하기
	 * 
	 */
	public void readProperties() {
		
		//Properties 클래스는 Hahtable의 하위클래스로 Map 계열 클래스 중 하나
		//Key와 Value 모두 String 타입으로 이루어짐
		
		//Properties 객체 생성
		Properties properties = new Properties();
		
		//바이트 기반 파일 입력 스트림 참조변수 선언
		FileInputStream fis = null;
		
		//바이트 기반 파일 출력 스트림 참조변수 선언
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("/io_test/20250305/config.properties");
			
			//읽기
			properties.load(fis); //파일 로드
			
			//Properties.getProperties(key) : key에 대응하는 value 반환
			System.out.println("username : "+properties.getProperty("username"));
			System.out.println("password : "+properties.getProperty("password"));
			System.out.println("language : "+properties.getProperty("language"));
			
			//쓰기
			
			fos = new FileOutputStream("/io_test/20250305/config.properties");
			
			properties.setProperty("theme", "lovecomedy"); //새로운 속성 추가
			//theme = dark 
			
			properties.store(fos, "그런건 없다");//저장
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
		
	}
	
	/**
	 * 파일 경로를 입력 받아 지정된 파일과 같은 결로에 복사된 파일 출력
	 * 
	 * [실행화면]
	 * 파일 경로 입력 : /io_test/20250305/노래가사.txt
	 * 복사완료 : /io_test/20250305/노래가사_copy.txt
	 * 
	 * 1)입력된 경로에 파일 있는지 확인
	 * 2)있으면 파일 내용을 모두 읽어고기 : FileInputStream + BufferedInputStream
	 * 3)읽어온 파일을 같은 경로 위치에 "파일명_copy.확장자" 이름으로 출력
	 * : FileOutputStream + BufferedOutputStream
	 * 
	 * Scanner 대신 BufferedReader(문자열 입력용 스트림) 이용
	 * BufferedReader는 보조 스트림으로 단독사용 불가능!
	 * BufferedReader 생성 시 보조스트림인 InputStreamReader 사용
	 * InputStreamReader는 기반스트림 InputStream을 이용하여 생성
	 * 
	 */
	public void fileCopy() {

		//스트림 참조변수 선언
		BufferedReader br = null; //문자열 입력용 스트림(Scanner 대신 사용)
		
		FileInputStream fis = null; //파일 입력 기반 스트림
		BufferedInputStream bis = null; //파일 입력 보조 스트림
		
		FileOutputStream fos = null; //파일 출력 기반 스트림
		BufferedOutputStream bos = null;//파일 출력 보조 스트림
		
		try {
			
			//키보드 입력을 받기 위한 스트림 객체 새엇ㅇ
			br = new BufferedReader(new InputStreamReader(System.in));
			//System.in(바이트 스트림)에서 받은 바이트형식을 InputStreamReader에서 문자열로 변환하고
			//이를 BufferedReader로 br에 입력한다
			
			//경로 입력 받기
			System.out.print("파일 경로 입력 : ");
			String target = br.readLine(); // 입력된 한 줄 읽어오기
			
			//해당 경로에 파일이 존재하는지 확인
			File file = new File(target);
			
			if(!file.exists()) {
				
				System.out.println("해당 경로에 파일이 존재하지 않습니다");
				return;
			}
		
			//해당 경로에 파일이 존재하면
			//target이 가르키는 파일을 입력 받을 수 있도록 입력용 스트림 생성
			fis = new FileInputStream(target);
			bis = new BufferedInputStream(fis);
			
			//입력용 스트림을 이용해서 target 파일의 내용 입력받기
			
			byte[] bytes = bis.readAllBytes();
			
			//---------------------------------------
			
			//출력할 파일의 경로에 _copy가 붙은 파일 이름
			//target : /io_test/20250305/노래가사.txt
			//copy : /io_test/20250305/노래가사_copy.txt
			
			StringBuilder sb = new StringBuilder();
			sb.append(target);
			
			// int String.lastIndexOf("문자열")
			//-주어진 문자열이 마지막으로 등장하는 인덱스를 찾아
			//해당 인덱스 번호를 int값으로 반환한다. 없을 경우 -1 반환
			
			int insertPoint = target.lastIndexOf(".");
			
			//System.out.println(insertPoint); .은 22번째 index에 위치
			
			sb.insert(insertPoint, "_copy"); //22번째 인덱스에 _copy 붙이기
			
			String copy = sb.toString();//복사 파일 경로를 String으로 변환
			
			//출력용 스트림 생성
			fos = new FileOutputStream(copy);
			bos = new BufferedOutputStream(fos);
			
			//원본에서 읽어온 bytes를 bos를 이용해서 출력
			
			bos.write(bytes);
			bos.flush();
			
			System.out.println("복사완료 : "+ copy);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(br != null) br.close();
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				if(fis != null) fis.close();
				if(fos != null) fos.close();
				
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		
		
	}
	
	
}


