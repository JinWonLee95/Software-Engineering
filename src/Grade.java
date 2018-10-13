
public class Grade {

	private String stdName;
	private String stdNo;
	private String subject;
	private String grade;
	
	public Grade(String stdName,String stdNo,String subject , String grade) {
		this.stdName= stdName;
		this.stdNo = stdNo;
		this.subject = subject;
		this.grade = grade;
	}
	
	private void Register() { //로그인한 아이디의 권한 인자로 받음
		/*
		if(교수만) 권한 확인
			강의 선택 -> 학생 선택 , 학점부여 -> 학생의 과목성적에 부여 , 이수학점 3점 + 
			예외: A~F입력 아닐시 등록 불가
		*/
	}
	private void Modify() {
		/*
		 if(교수만) 권한 확인
		 	 강의선택 -> 학생 선택 , 학점수정 
		 	 예외 : F학점 부여시 이수학점 x , A~F입력 아닐 시 수정 불가
		 */ 
		 
	}
	
	private void Lookup() {
	/*
	 if(학생만) 권한 확인 
	   	강의 선택 -> 학점 조회
	 */	
	}
}
