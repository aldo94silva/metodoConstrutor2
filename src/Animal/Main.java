package Animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Entre com o nome do animal: ");
        String nome = ler.next();
        System.out.print("Entre com o tipo de animal: ");
        String tipoDeAnimal = ler.next();
        System.out.print("Entre com a idade do animal: ");
        int idade = ler.nextInt();
        System.out.print("Entre com o som do animal: ");
        String som = ler.next();

        animal animal1 = new animal(nome,tipoDeAnimal,idade);
        animal animal2 = new animal();
        System.out.println();


            }
        }


