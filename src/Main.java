import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.SynchronousQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean collectpath = true;
		
		System.out.print("���̵� : ");
		String id = br.readLine();
	
		System.out.print("��й�ȣ : ");
		String passwd = br.readLine();
		System.out.println();
	while(collectpath) {
		if( id != null && passwd != null) { //���̵��й�ȣ ��ġ Ȯ��
			System.out.println("1.����");
			System.out.println("2.����");
			System.out.println("3.����");
			System.out.println("4.����");
			System.out.println("5.����");
			System.out.println("----------���ϴ� ����� �������ּ���.----------");
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
					System.out.println("�߸��� ����� �����Ͽ����ϴ�.");
					break;
				}
				
			}
		}
	}

}
