//importando as bibliotecas
import java.util.Scanner;
import java.util.Arrays;
public class cineDev {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int idade;
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
        System.out.println("4.Créditos dos criadores");
        System.out.println("5.Sair");
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
            System.out.println("Selecione um filme que está em cartaz.");
            System.out.println("=== Filmes em cartaz ===");
            String[] filmes =new String [5];
            filmes[0] = "1.Demon Slayer (+18)";
            filmes[1] = "2.Invocação do Mal 4 (+16)";
            filmes[2] = "3.Super Wings (Livre)";
            filmes[3] = "4.Bad Boys 4 (+16) ";
            filmes[4] = "5.Os mercenários 2 (+16)";
                System.out.println("Qual filme você deseja assistir?(Digite o nome completo do filme)");
                for (String filme : filmes) {
                    System.out.println(""+filme);
                } int escolhaFilme = sc.nextInt();
                    if (escolhaFilme == 1){
                        System.out.println("Qual é a sua idade? (!!!!Se a sua idade for menor que a classificação indicativa a compra será cancelada!!!!)");
                        idade = sc.nextInt();
                        if (idade >= 18){
            System.out.println("Digite o numero da fileira 0 a 1");
            int fileira = sc.nextInt();
            System.out.println("Digite o numero do assento 0 a 19");
            int assento = sc.nextInt();
            System.out.println("Confirme a compra (se vocometeu um engano e deseja cancelar !!NÃO CONFIRME A COMPRA!!)");    
            String confirma = sc.next();
            if (confirma.equals("Sim")|| confirma.equals("sim")|| confirma.equals("SIM")){
            if (acentos[fileira][assento] != 0){
                acentos [fileira][assento] = 0;
                System.out.println("Compra realizada com sucesso");
            }else {
                System.out.println("Assento já ocupado");
            }
            }
            }else {
                System.out.println("Compra cancelada");
            }                        
                    } else if (escolhaFilme == 2){
                        System.out.println("Qual é a sua idade? (!!!!Se a sua idade for menor que a classificação indicativa a compra será cancelada!!!!)");
                        idade = sc.nextInt();
                        if (idade >= 16)
            System.out.println("Digite o numero da fileira 2 a 3");
            int fileira = sc.nextInt();
            System.out.println("Digite o numero do assento 0 a 19");
            int assento = sc.nextInt();
            System.out.println("Confirme a compra (se você cometeu um engano e deseja cancelar !!NÃO CONFIRME A COMPRA!!)");    
            String confirma = sc.next();
            if (confirma.equals("Sim")|| confirma.equals("sim")|| confirma.equals("SIM")){
            if (acentos[fileira][assento] != 0){
                acentos [fileira][assento] = 0;
                System.out.println("Compra realizada com sucesso");
            }else {
                System.out.println("Assento já ocupado");
            }
            }else {
                System.out.println("Compra cancelada");
            }                        
                    } else if (escolhaFilme == 3){
                        idade = sc.nextInt();
            System.out.println("Digite o numero da fileira 4 a 5");
            int fileira = sc.nextInt();
            System.out.println("Digite o numero do assento 0 a 19");
            int assento = sc.nextInt();
            System.out.println("Confirme a compra (se você cometeu um engano e deseja cancelar !!NÃO CONFIRME A COMPRA!!)");    
            String confirma = sc.next();
            if (confirma.equals("Sim")|| confirma.equals("sim")|| confirma.equals("SIM")){
            if (acentos[fileira][assento] != 0){
                acentos [fileira][assento] = 0;
                System.out.println("Compra realizada com sucesso");
            }else {
                System.out.println("Assento já ocupado");
            }
            }else {
                System.out.println("Compra cancelada");
            }                        
                    
                } else if (escolhaFilme == 4)  {
                    System.out.println("Qual é a sua idade? (!!!!Se a sua idade for menor que a classificação indicativa a compra será cancelada!!!!)");
                    idade = sc.nextInt();
                    if (idade >= 16){
            System.out.println("Digite o numero da fileira 6 a 7");
            int fileira = sc.nextInt();
            System.out.println("Digite o numero do assento 0 a 19");
            int assento = sc.nextInt();
            System.out.println("Confirme a compra (se você cometeu um engano e deseja cancelar !!NÃO CONFIRME A COMPRA!!)");    
            String confirma = sc.next();
            if (confirma.equals("Sim")|| confirma.equals("sim")|| confirma.equals("SIM")){
            if (acentos[fileira][assento] != 0){
                acentos [fileira][assento] = 0;
                System.out.println("Compra realizada com sucesso");
            }else {
                System.out.println("Assento já ocupado");
            }
            }
            }else {
                System.out.println("Compra cancelada");
            }                        
                    
                    
                } else if (escolhaFilme == 5) {
                    System.out.println("Qual é a sua idade? (!!!!Se a sua idade for menor que a classificação indicativa a compra será cancelada!!!!)");
                    idade = sc.nextInt();
                    if (idade >= 16){
                    System.out.println("Digite o numero da fileira 8 a 9");
            int fileira = sc.nextInt();
                if (fileira > 9){
                    System.out.println("Fileira inexistente");
                }
            System.out.println("Digite o numero do assento 0 a 19");
            int assento = sc.nextInt();
                if (assento > 19) {
                    System.out.println("Assento inesistente ");
                }
            System.out.println("Confirme a compra (se você cometeu um engano e deseja cancelar !!NÃO CONFIRME A COMPRA!!)");    
            String confirma = sc.next();
            if (confirma.equals("Sim")|| confirma.equals("sim")|| confirma.equals("SIM")){
            if (acentos[fileira][assento] != 0){
                acentos [fileira][assento] = 0;
                System.out.println("Compra realizada om sucesso");
            }else {
                System.out.println("Assento já ocupado");
            }
            }
            }else {
                System.out.println("Compra cancelada");
            }                        
                    

                }
            //opção 3
        } else if (opcao == 3){
            //definindo variáveis para os assentos ocupados e o total de assentos 
            int total = 200;
            int ocupados = 0;
            //comparando os ocupados com o total de assentos
            for (int[] linha : acentos){
                for (int assentos : linha ){
                    if (assentos == 0){
                        ocupados++;
                    }
                }
            }   
            //definindo a média de assentos e a porcentagem.
        int livres = total - ocupados;
        double porcentagem = (ocupados *100) / total;
        System.out.println("=== RELATÓRIO DE OCUPAÇÃO ===");
        System.out.println("Total de assentos: " + total);
        System.out.println("Assentos ocupados: " + ocupados);
        System.out.println("Assentos livres: " + livres);
        System.out.printf("A porcentagem de acentos ocupados ; %.2f",porcentagem);
        System.out.println("");
        }
            //A opção 5 está  abaixo da 4 por que os créditos foram colocados de ultima hora com um tempo restante que havia em aula.
        else if (opcao == 4){
            System.out.println("Criação e Desenvolvimento: "
                    + "Brayan Gabriel Bitencourt de Oliveira"
                    + "Vitor da Silva Coelho");
        }
        }while(opcao != 5);
            System.out.println("Você saiu do sistema");
        }
    }
}