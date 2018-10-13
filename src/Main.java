import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.SynchronousQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean collectpath = true;
		
		System.out.print("아이디 : ");
		String id = br.readLine();
	
		System.out.print("비밀번호 : ");
		String passwd = br.readLine();
		System.out.println();
	while(collectpath) {
		if( id != null && passwd != null) { //아이디비밀번호 일치 확인
			System.out.println("1.학적");
			System.out.println("2.성적");
			System.out.println("3.강의");
			System.out.println("4.관리");
			System.out.println("5.종료");
			System.out.println("----------원하는 목록을 선택해주세요.----------");
			int selectnum = Integer.parseInt(br.readLine());
			
			
			switch( selectnum) {
				case 1:
					System.out.println("");
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					collectpath = false;
					break;
				default:
					System.out.println("잘못된 목록을 선택하였습니다.");
					break;
				}
				
			}
		}
	}

}
