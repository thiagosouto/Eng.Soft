package Visao;

import java.util.*;

public class PrincipalMenu extends Menu{

    public void mostrarMenu(){
        Scanner ler = new Scanner(System.in);
        int operador = 5;
        while(operador != 0){
            System.out.println("Menu Principal\n");
            System.out.println("1- Produto\n");
            System.out.println("2- Venda\n");
            System.out.println("0- Sair\n");

            operador = ler.nextInt();

            switch(operador){
                case 1:
                break;

                case 2:
                break;

                case 0:
                operador = 0;
                break;

                default:
                break;

            }

        }
    }
    
}
