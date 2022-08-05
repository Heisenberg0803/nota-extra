package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncoesSobreListas {
    private List<String> bancoDeDadosDoAluno = new ArrayList<>();

    private List<String> nomeDosAlunos(String s){
        this.bancoDeDadosDoAluno.add(s);
        return bancoDeDadosDoAluno;
    }
    void metodoDeAdicionamento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza onome do aluno: ");
        for(int i=0;i<5;i++){
         String str = scanner.nextLine();
         List<String> listDeNomes = this.nomeDosAlunos(str);
        }
        for(String s: this.bancoDeDadosDoAluno){
            System.out.println("Nome do aluno: " + s);
        }
    }
}
