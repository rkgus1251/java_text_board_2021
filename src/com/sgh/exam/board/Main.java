package com.sgh.exam.board;


import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println(" == 게시판 v0.1 == ");
    System.out.println(" == 프로그램 시작 == ");
    System.out.printf("명령 ) ");
    Scanner in = new Scanner(System.in);
    String cmd = in.nextLine();
    System.out.printf("입력된 명령어 : %s\n", cmd);
    System.out.println(" == 프로그램 종료 == ");
    in.close();

  }
}
