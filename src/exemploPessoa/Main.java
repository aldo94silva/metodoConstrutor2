package exemploPessoa;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

                                //método construtor
        pessoa pessoa1 = new pessoa("Ronaldo", 45);
        pessoa1.setNome("Gilberto");
        pessoa1.setIdade(35);
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Nome: " + pessoa1.getIdade());
        System.out.println();

        System.out.print("Informe um novo nome: ");
        String nome2 = ler.next();
        pessoa1.setNome(nome2);


        System.out.print("Informe uma nova idade: ");
        int idade2 = ler.nextInt();
        pessoa1.setIdade(idade2);
        System.out.println();
        System.out.println("Nome atualizado: " + pessoa1.getNome());
        System.out.println("Idade atualizada " + pessoa1.getIdade());
    }
}
