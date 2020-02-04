package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.startRacing();
        m.inputMonsterCount();
        m.inputAttemptCount();
        m.runRacing();
        m.showResult();
    }

    public void startRacing() {
        System.out.println("<스릴만점 건전한 몬스터 경주>");
    }

    public int inputMonsterCount() throws IOException {
        System.out.println("몬스터는 모두 몇 마리인가요?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public int inputAttemptCount() throws IOException {
        System.out.println("시도할 회수는 몇 회 인가요?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public void runRacing() { }

    public void showResult() { }
}
