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

		while (collectpath) {
			if (id != null && passwd != null) { // 아이디비밀번호 일치 확인
				System.out.println("1.학적");
				System.out.println("2.성적");
				System.out.println("3.강의");
				System.out.println("4.관리");
				System.out.println("5.종료");
				System.out.println("-----------------------------------");
				System.out.print("원하는 목록을 선택해 주세요.");
				int selectnum = Integer.parseInt(br.readLine());
				System.out.println("-----------------------------------");
				
				int ndSelect; // 세부 사항 선택
				switch (selectnum) {
				case 1:
					System.out.println("1. 학적 등록");
					System.out.println("2. 학적 수정");
					System.out.println("3. 학적 삭제");
					System.out.println("4. 개인정보 등록, 수정"); // 들어가면 휴복학도
					System.out.print("원하는 목록을 선택해 주세요.");
					ndSelect = Integer.parseInt(br.readLine());
					break;
				case 2:
					System.out.println("1. 성적 관리");
					System.out.println("2. 성적 조회");
					System.out.println("3. 장학 여부 조회");
					System.out.print("원하는 목록을 선택해 주세요.");
					ndSelect = Integer.parseInt(br.readLine());
					break;
				case 3:
					System.out.println("1. 내 시간표 조회");
					System.out.println("2. 강의 편람 조회");
					System.out.println("3. 강의 편람 관리");
					System.out.println("4. 수강 신청");
					System.out.print("원하는 목록을 선택해 주세요.");
					ndSelect = Integer.parseInt(br.readLine());
					break;
				case 4:
					System.out.println("1. 카테고리 등록");
					System.out.println("2. 카테고리 수정");
					System.out.println("3. 카테고리 삭제");
					System.out.println("4. 회원 조회");
					System.out.println("5. 회원 삭제");
					System.out.println("6. 회원 추가");
					System.out.print("원하는 목록을 선택해 주세요.");
					ndSelect = Integer.parseInt(br.readLine());
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
