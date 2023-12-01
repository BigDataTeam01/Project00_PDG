import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		// 몇 개의 숫자를 입력할지 결정한 후, 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악
		
		// 변수 선언 
		Scanner sc = new Scanner(System.in); // 2. 숫자를 입력받아야 하기 때문에 Scanner 필요
		int num = 0;
		int a = 0;
		int count = 0;
		
		
		// 입력
		System.out.print("입력할 숫자의 개수 ? : "); // 1. 숫자를 입력받기 위해 사용자에게 요청
		num = sc.nextInt(); // 3. 입력받은 숫자를 변수에 저장
		int[] arr = new int[num];  // 5. 저장된 순서를 알아야하기에 int형 배열을 선언

		System.out.println(arr.length + "개의 숫자를 입력하세요!"); // 4. 여러개의 숫자를 입력받아 어딘가에 저장해두어야 함
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"의 숫자 :"); // 6. 입력받을 숫자의 순서를 고지하고,
			arr[i] = sc.nextInt(); // 7. 입력받은 숫자를 배열에 순서대로 저장
		}
		
		System.out.print("검색할 숫자는 ? :"); // 8. 검색 할 숫자를 사용자에게 요청
		a = sc.nextInt(); // 9. 검색 할 숫자를 변수에 저장
		
		
		
		// 처리 및 출력 
		for(int j=0; j<arr.length; j++) { // 10. 숫자가 저장되어 있는 모든 배열 값들을 검색 할 숫자와 비교를 해야함
			if(arr[j] == a) { // 11. 만약 검색하고 있는 숫자가 배열에 저장되어 있는 값 이라면, 
				System.out.println(a+"의 위치는 "+(j+1)+"번째 입니다."); // 12. 순서대로 저장되어 있기 때문에 순차적으로 가장 낮은 Index 값부터 비교하여 그 순서를 출력
				count++; // 15. 원하는 값을 찾지 못하였다면, 위의 if문으로 처리 할 수 없으므로 count를 설정하여 원하는 수를 찾았을때 증가시킴
				break; // 13. 중복 입력을 안했다는 가정하에 원하는 숫자를 찾았으니 더이상 찾을 필요가 없음 -> 프로그램 종료
			}
		}
		
		if(count == 0) System.out.println("검색하신 숫자는 존재하지 않습니다."); // 14. 만약 원하는 숫자를 찾지 못하였다면 찾지 못하였다는 메시지를 출력
																		// 16. count 조건을 설정해 주어 count가 0이라면,33번째 줄의 if문을 처리 하지 못하였다는 말이고, 이 말은 if문의 조건인 '저장되어있는 모든 배열값 != 검색하는 숫자' 이기에,  
	}																	// 16. 검색하신 숫자가 존재하지 않는다는 설명 출력

}
