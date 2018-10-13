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
					System.out.println("1. 학적 등록");
					System.out.println("2. 학적 수정");
					System.out.println("3. 학적 삭제");
					System.out.println("4. 개인정보 등록, 수정"); // 들어가면 휴복학도
					break;
				case 2:
					System.out.println();
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
