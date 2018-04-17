/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import static java.lang.System.in;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author leomara
 */
public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaração de variáveis
        int valor1, valor2, soma, sub, divisao,
        faixa, primos, mudanca, menu, opcao;
        
        //Métódo para ler escolha do usuário
        Scanner escolha = new Scanner (System.in);
        
        //Apresenta as opções do menu para o usuário
        System.out.println("___ESCOLHA UMA DAS OPÇÕES__");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Faixa etária");
        System.out.println("5 - Números primos");
        System.out.println("6 - Mudança de base");
        System.out.println("7 - Sair");        
        //Lê a opção que o usuário escolheu 
        opcao = escolha.nextInt();
        
        //Se o usuário escolher a opção 1, o sistema executará os comandos abaixo
        if(opcao == 1){
            //Apresenta na tela a mensagem para o usuário informar o primeiro valor 
            System.out.println("Informe o 1º valor: ");
            //Lê o primeiro valor digitado pelo usuário
            valor1 = escolha.nextInt();
            //Apresenta na tela a mensagem para o usuário informar o segundo valor
            System.out.println("Informe o 2º valor: ");
            //Lê o segundo o valor digitado pelo usuário
            valor2 = escolha.nextInt();
            //Soma o valor1 com o valor2
            soma = valor1 + valor2;
            //Apresenta o resultado da soma do valor1 com o valor2
            System.out.println("A soma dos valores é: "+soma);
        }
        //Se o usuário escolher a opção 2, o sistema executará os comandos abaixo
        if(opcao == 2){
            //Apresenta na tela a mensagem para o usuário informar o primeiro valor
            System.out.println("Informe o 1º valor: ");
            //Lê o primeiro valor digitado pelo usuário
            valor1 = escolha.nextInt();
            //Apresenta na tela a mensagem para o usuário informar o segundo valor
            System.out.println("Informe o 2º valor: ");
            //Lê o segundo valor digitado pelo usuário
            valor2 = escolha.nextInt();
            //Faz a subtração do valor1 e valor2
            sub = valor1 - valor2;
            //Apresenta o resultado da subtração
            System.out.println("A subtração dos valores é: "+sub);
        }
        //Se o usuário escolher a opção 3, o sistema executará os comandos abaixo
        if(opcao == 3){
            //Apresenta na tela a mensagem para o usuário informar o primeiro valor
            System.out.println("Informe o 1º valor: ");
            //Lê o primeiro valor digitado pelo usuário
            valor1 = escolha.nextInt();
            //Apresenta na tela a mensagem para o usuário informar o segundo valor
            System.out.println("Informe o 2º valor: ");
            //Lê o segundo valor digitado pelo usuário
            valor2 = escolha.nextInt();
            //Faz a divisão do valor1 pelo valor2
            divisao = valor1 / valor2;
            //Apresenta o resultado da divisão do valor1 pelo valor2
            System.out.println("A divisão dos valores é: "+divisao);
        }
        //Se o usuário escolher a opção 4, o sistema executará os comandos abaixo
        if(opcao == 4){
            //Declaração de variáveis
            int mediapessoas = 0;
            int mediaF = 0;
            int mediaM = 0;
            int num;
            int idade = 0;
            int contador = 0;            
            int contador1 = 0;
            int contador2 = 0;
            //Método para ler a quantidade de pessoas informada pelo usuário
            Scanner entrada = new Scanner(System.in);
                //Apresenta na tela a mensagem para o usuário informar o primeiro valor
                System.out.println("Informe a quantidade de pessoas: ");  
                //Lê o valor digitado pelo usuário
                num = entrada.nextInt();  
            for(int cont = 0;cont != num; cont++){              
                //Se o número informado for maior do que zero, executa
                if(num > 0){
                //Apresenta na tela a mensagem para o usuário informar a idade da pessoa  
                System.out.println("Informe a idade da pessoa: ");
                //Lê a idade informada
                idade = entrada.nextInt();  
                //Contador para ajudar a calcular a média de todas as idades digitadas
                contador = contador + 1;
                //Recebe todas as idades informadas a cada loop para no final calcular a media
                mediapessoas = mediapessoas + idade;
            }
            //Se o número for diferente de zero
            if(num > 0){
                //É apresentado na tela a mensagem para informar o sexo da pessoa
                System.out.println("Informe o sexo (F) ou (M): ");
                //Lê o sexo informado
                String sexo = entrada.next();
                //Se o sexo informado for igual a F
                if (sexo.equals("F")){
                    //O sistema calcula a média da idade das pessoas do sexo Feminino  
                    mediaF = mediaF + idade;  
                    //Contador para ajudar a calcular a média das idades do sexo feminino digitadas
                    contador1 = contador1 + 1;
                }
                //O sistema calcula a média da idade das pessoas do sexo Masculino
                if (sexo.equals("M")){
                    //O sistema calcula a média da idade das pessoas do sexo Feminino
                    mediaM = mediaM + idade;
                    //Contador para ajudar a calcular a média das idades do sexo feminino digitadas
                    contador2 = contador2 + 1;
                }
              }
              //Se o número informado for menor do que 0, o sistema apresenta a mensagem abaixo
              else if (num <= 0){
                  System.out.println("Não é uma quantidade válida de pessoas!");
                  //Sai do loop
                  break;
              }
            }
            //Cálculo da média que é a soma de todas as idades digitadas dividida pela quantidade de idades digitadas
            mediapessoas = mediapessoas / contador;
            //Apresenta o resultado da média de todas as idades digitadas
            System.out.println("A média de todas as idades é: "+mediapessoas);
            //Mostra a média de todas as idades do sexo Feminino, dividido pela quantidade de vezes que apareceu o sexo feminino
            mediaF = mediaF / contador1;
            //Apresenta o resultado da soma de todas as idades do sexo Feminino
            System.out.println("A média de todas as idades do sexo Feminino é: "+mediaF);
            //Mostra a média de todas as idades do sexo Masculino, dividido pela quantidade de vezes que apareceu o sexo mascilino
            mediaM = mediaM / contador2;
            //Apresenta o resultado da doma de todas as idades do sexo Masculino
            System.out.println("A média de todas as idades do sexo Masculino é: "+mediaM);
        }
        if (opcao == 5){
            int somar1 = 0;
            int numero;
            
            Scanner entrada = new Scanner(System.in);
                // Entrada de dados
                System.out.println("Informe um número inteiro: ");
                numero = entrada.nextInt();
            //O núemro será incrementado para aumentar
            for (int k = 1; k <= numero; k++) {  
                int contador = 0;
                for (int i = 1; i <= numero; i++) { 
                    if (k % i == 0) {
                    // Contador das divisões com resto 0
                        contador++;  
                    }
                }                       
                if (contador == 2) {
                    //Soma os números primos
                    somar1 = somar1 + k; 
                }
            }
            //Saída de Dados
            System.out.println("A soma dos números primos é: "+somar1);
                 
               
        }
        if (opcao == 6){
            Scanner entrada = new Scanner(System.in);
            System.out.println(" Digite '1' para informar um número binário e o '2' para informar um número decimal: ");
            int binoudec = entrada.nextInt();

            switch (binoudec){
                case 1:
                    System.out.println("Digite um valor em formato binário: ");
                    String inicio = entrada.next();
                    int potencia = 0;
                    int decimal = 0;

                    for (int j = inicio.length() - 1; j >= 0; j--) {
                        decimal += Math.pow(2, potencia) * Character.getNumericValue(inicio.charAt(j));
                        potencia++;

                    }
                    System.out.println("O número informado em decimal é: " +decimal);
                    break;

                case 2:
                    int dec,
                    mod;
                    String binario = "";
                    System.out.println("Digite um número decimal: ");
                    dec = entrada.nextInt();

                        while (dec > 0) {
                            mod = (dec % 2);
                            binario = mod + binario;
                            dec = dec / 2;
                        }
                        System.out.println("O número informado em binário é: " +binario);

                   
            } 
         
        }
        if (opcao == 7){
            //Sai do programa 
            System.exit(0); 
         
        }
        
    }
}
