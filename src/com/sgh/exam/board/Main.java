package com.sgh.exam.board;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(" == 게시판 v0.1 == ");
    System.out.println(" == 프로그램 시작 == ");
    while (true) {
      System.out.printf("명령) ");
      String cmd = in.nextLine();

      if (cmd.equals("exit")) {
        break;
      }

      System.out.printf("입력된 명령어 : %s\n", cmd);
    }

    System.out.println("== 프로그램 종료 ==");

    in.close();
  }

}
