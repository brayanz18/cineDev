//importando as bibliotecas
import java.util.Scanner;
import java.util.Arrays;
public class cineDev {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int opcao;
        //ENTRADA NO SISTEMA(CADASTRO)
        System.out.println("Dígite o seu nome");
        String nome = sc.next();
        //definindo as variáveis
        int[][] acentos = {
            // Fileira 1
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            // Fileira 2
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            // Fileira 3
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            // Fileira 4
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            // Fileira 5
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            // Fileira 6
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            // Fileira 7
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            // Fileira 8
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            // Fileira 9
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},
            // Fileira 10
            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
        };//criação da variávl que vai denominar os acentos 
        
        System.out.println("Tem certeza que esses são seus dados?");
        String opc = sc.next();
        if(opc.equals("Sim")||opc.equals("SIM")||opc.equals("sim")){
        System.out.println("Bem vindo "+nome+".");
            do {
        //MENU PRINCIPAL  
        System.out.println("MENU PRINCIPAL");
        System.out.println("1.Mapa dos acentos");
        System.out.println("2.Comprar ingresso");
        System.out.println("3.Exibir relatório de ocupação");
        System.out.println("4.Sair");
        opcao = sc.nextInt();//define a opção que o usuário vai selecionar no sistema
        //opção 1
        if (opcao == 1){
            System.out.println("MAPEAMENTO DE ACENTOS");
            for (int linha[] : acentos){
                for (int acento : linha){
                    System.out.println(acento+"");
                }
                System.out.println("");
            }
        //opção 2
        } else if(opcao == 2){
            System.out.println("Digite o numero da fileira 0 a 9");
            int fileira = sc.nextInt();
            System.out.println("Digite o numero do assento");
            int assento = sc.nextInt();
            System.out.println("Confirme a compra (se você cometeu um engano e deseja cancelar !!NÃO CONFIRME A COMPRA!!)");    
            String confirma = sc.next();
            if (confirma.equals("Sim")|| confirma.equals("sim")|| confirma.equals("SIM")){
            if (acentos[fileira][assento] != 0){
                acentos [fileira][assento] = 0;
                System.out.println("Compra realizada om sucesso");
            }else {
                System.out.println("Assento já ocupado");
            }
            }else {
                System.out.println("Compra cancelada");
            }
        }
        }while(opcao != 4);
        }
    }
}