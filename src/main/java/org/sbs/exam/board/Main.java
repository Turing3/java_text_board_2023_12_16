package org.sbs.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("== 게시판 v 0.1 ==");
    System.out.println("== 게시판 시작 ==");

    while (true) {
      System.out.printf("명령)");
      String cmd = sc.nextLine();

      if (cmd.equals("/usr/article/write")) {
        System.out.println("== 계시물 등록 ==");
        System.out.printf("제목 :");
        String title = sc.nextLine();

        System.out.printf("내용 :");
        String body = sc.nextLine();

        int id = 1;

        System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
      }

        else if (cmd.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }
    }

    // System.out.println("== 게시판 실행 끝 ==");

    // sc.close();
  }
}