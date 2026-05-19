package ai0523;

import java.util.ArrayList;
import java.util.Scanner;

public class budgetBook {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 데이터들을 순서대로 저장할 4개의 ArrayList 생성
        ArrayList<String> dates = new ArrayList<>();   // 날짜 저장
        ArrayList<String> types = new ArrayList<>();   // "수입" 또는 "지출" 저장
        ArrayList<Integer> amounts = new ArrayList<>();// 금액 저장
        ArrayList<String> memos = new ArrayList<>();   // 내역(메모) 저장

        int balance = 0;          // 총 잔액을 누적해서 저장할 변수
        String currentMonth = ""; // 현재 달을 확인하기 위한 변수 (예: "2026-05")

        boolean run = true; // while 반복문을 실행, 종료 결정

        // run이 true인 동안 반복 실행
        while (run) {
            System.out.println("\n=================================");
            System.out.println("       💰 심플 가계부 💰       ");
            System.out.println("=================================");
            System.out.println("1. 내역 추가");
            System.out.println("2. 조회 (이번 달)");
            System.out.println("3. 프로그램 종료");
            System.out.print("메뉴 번호를 입력하세요: ");

            String menu = s.nextLine();

            switch (menu) {
                case "1":
                    System.out.println("\n[내역 추가를 시작합니다]");

                    // 1. 수입/지출 구분 입력받기
                    System.out.print("1. 수입입니까 지출입니까? (1: 수입, 2: 지출): ");
                    String typeInput = s.nextLine();
                    // 1을 입력하면 "수입", 그 외의 값이면 "지출"로 저장
                    String type = typeInput.equals("1") ? "수입" : "지출";

                    // 2. 날짜 입력받기
                    System.out.print("2. 날짜를 입력하세요 (반드시 yyyy-MM-dd 형식, 예: 2026-05-19): ");
                    String date = s.nextLine();

                    // 3. 금액 입력받기
                    System.out.print("3. 금액을 입력하세요 (숫자만): ");
                    int amount = Integer.parseInt(s.nextLine());

                    // 4. 내역 입력받기
                    System.out.print("4. 내역(메모)을 입력하세요 (예: 점심식사, 용돈): ");
                    String desc = s.nextLine();

                    // --- [월 단위 초기화 처리] ---
                    String inputMonth = "";
                    // 입력받은 날짜(예: 2026-05-19)가 7글자 이상이면
                    if (date.length() >= 7) {
                        // 0번째부터 7번째 글자 앞까지 잘라서 "2026-05"만 추출
                        inputMonth = date.substring(0, 7);
                    }

                    // 가계부에 처음 입력하는 상황이면 현재 달을 세팅해줌
                    if (currentMonth.equals("")) {
                        currentMonth = inputMonth;
                    }
                    // 새로 입력한 달이 기존에 저장하던 달과 다르면 (달이 넘어갔으면)
                    else if (!currentMonth.equals(inputMonth)) {
                        System.out.println("\n*** 달이 바뀌어 이전 내역을 삭제합니다! ***");
                        // 4개의 리스트를 싹 비우고 새 출발 (단, 잔액은 유지)
                        dates.clear();
                        types.clear();
                        amounts.clear();
                        memos.clear();
                        currentMonth = inputMonth;
                    }

                    // --- [날짜순으로 정렬] ---
                    int index = 0;
                    // 처음부터 리스트 크기만큼 돌면서 들어갈 자리(index)를 찾음
                    while (index < dates.size()) {
                        // 문자열 비교(compareTo)로 기존 날짜보다 입력한 날짜가 더 앞선 날짜면 반복 멈춤
                        if (date.compareTo(dates.get(index)) < 0) {
                            break;
                        }
                        index++;
                    }

                    // 찾은 자리(index)에 4개의 데이터를 동시에 추가
                    dates.add(index, date);
                    types.add(index, type);
                    amounts.add(index, amount);
                    memos.add(index, desc);

                    // --- [잔액 계산] ---
                    if (type.equals("수입")) {
                        balance += amount; // 수입
                    }
                    else {
                        balance -= amount; // 지출
                    }

                    System.out.println(">> 내역이 성공적으로 저장되었습니다!");
                    break;

                case "2":
                    System.out.println("\n---------------------------------------------------------");
                    System.out.println("날짜\t\t\t구분\t\t\t금액\t\t\t내역");
                    System.out.println("---------------------------------------------------------");

                    if (dates.size() == 0) {
                        System.out.println("아직 입력된 내역이 없습니다.");
                    }
                    else {
                        // 0번부터 리스트에 들어있는 개수만큼 for문을 돌면서 데이터를 하나씩 꺼냄(get)
                        for (int i = 0; i < dates.size(); i++) {
                            System.out.printf("%s\t%s\t\t\t%d원\t\t%s\n",
                                    dates.get(i), types.get(i), amounts.get(i), memos.get(i));
                        }
                    }
                    System.out.println("---------------------------------------------------------");
                    System.out.printf("💰 현재 잔액: %d원\n", balance);
                    break;

                case "3":
                    System.out.println("\n프로그램을 종료합니다. 수고하셨습니다!");
                    // run을 false로 바꿔서 while 무한 반복문을 끝냄
                    run = false;
                    break;

                default:
                    // 1, 2, 3 이외의 값을 입력했을 때 예외 처리
                    System.out.println("\n잘못 입력하셨습니다. 1~3번 중에서 선택해주세요.");
                    break;
            }
        }
        s.close();
    }
}