package com.company;

/*
public class Main {

    public static void main(String[] args) {
        String planeta = "plutão";
        System.out.println("o nome do planeta é " + planeta);
    }
} */
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome);
        scanner.close();
    }
} */

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Olá " + nome + ", sua idade é " + idade);
        scanner.close();
    }
    } */

//CALCULAR ÁREAS DE FIGURAS PLANAS
/*
import java.util.Scanner;

// RETANGULO

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base do retangulo");
        double base = scanner.nextInt();
        System.out.println("Digite o valor da altura do retangulo");
        double altura = scanner.nextInt();
        double resultado = base * altura;
        System.out.println("o área do retangulo é :" + resultado);
    }
} */
/*
import java.util.Scanner;

// QUADRADO

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado");
        double lado = scanner.nextInt();
        double resultado = lado * lado;
        System.out.println("o área do quadrado é :" + resultado);
    }
} */
/*
import java.util.Scanner;

// LOSANGO

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da diagonal maior");
        double dmaior = scanner.nextInt();
        System.out.println("Digite o valor da diagonal menor");
        double dmenor = scanner.nextInt();
        double multi = dmaior * dmenor;
        double resultado = multi / 2;
        System.out.println("o área do retangulo é :" + resultado);
    }
} */
/*
import java.util.Scanner;

// TRAPÉZIO

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base maior");
        double bmaior = scanner.nextInt();
        System.out.println("Digite o valor da base menor");
        double bmenor = scanner.nextInt();
        System.out.println("digite o valor da altura");
        double altura = scanner.nextInt();
        double multi = bmaior * bmenor;
        double multia = multi * altura;
        double resultado = multia / 2;
        System.out.println("o área do retangulo é :" + resultado);
    }
} */
/*
import java.util.Scanner;

// PARALELOGRAMO

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base do paralelogramo");
        double base = scanner.nextInt();
        System.out.println("Digite o valor da altura do paralelogramo");
        double altura = scanner.nextInt();
        double resultado = base * altura;
        System.out.println("o área do paralelogramo é :" + resultado);
    }
} */
/*
import java.util.Scanner;

// TRIANGULO

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base do triangulo");
        double base = scanner.nextInt();
        System.out.println("Digite o valor da altura do triangulo");
        double altura = scanner.nextInt();
        double multi = base * altura;
        double resultado = multi / 2;
        System.out.println("o área do triangulo é :" + resultado);
    }
} */
/*
import java.util.Scanner;

// CIRCULO

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base do raio do circulo");
        double raio = scanner.nextInt();
        double quadrado = raio * raio;
        double resultado = quadrado * 3.14;
        System.out.println("o área do circulo é :" + resultado);
    }
} */

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero");
    int numero = scanner.nextInt();
    if (numero > 0)
        System.out.println("o numero é positivo");
    else if (numero < 0)
        System.out.println("o numero é negativo");
    else {
        System.out.println("o numero é neutro");
    }
    }
} */
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int primeiro = scanner.nextInt();
        System.out.println("digite o segundo numero");
        int segundo = scanner.nextInt();
        System.out.println("digite o terceiro numero");
        int terceiro = scanner.nextInt();
        if (primeiro > segundo && primeiro > terceiro) {
            System.out.println("O maior numero é " + primeiro);
        } else if (segundo > primeiro && segundo > terceiro) {
            System.out.println("O maior numero é " + segundo);
        } else if (terceiro > primeiro && terceiro > segundo) {
            System.out.println("O maior numero é " + terceiro);
        } else {
            System.out.println("Algo deu errado, digite ");
        }
        scanner.close();
    }
} */
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();
        System.out.println("Digite o quarto numero: ");
        int numero4 = scanner.nextInt();
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4) {
            System.out.println("O maior numero é " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4) {
            System.out.println("O maior numero é " + numero2);
        } else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4) {
            System.out.println("O maior numero é " + numero3);
        } else {
            System.out.println("O maior numero é " + numero4);
        }
        scanner.close();
    }
} */

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();
        if (numero1 > numero2 && numero2 > numero3) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero2));
        } else if (numero1 > numero2 && numero3 > numero2) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero3));
        } else if (numero2 > numero3 && numero3 > numero1) {
            System.out.println("A soma dos dois maiores numeros é " + (numero2 + numero3));
        } else {
            System.out.println("algo deu errado");
        }
        scanner.close();
    }
} */

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();
        System.out.println("Digite o quarto numero: ");
        int numero4 = scanner.nextInt();
        System.out.println("Digite o quinto numero: ");
        int numero5 = scanner.nextInt();
        if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero2));
        } else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero2 + numero3));
        } else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero3));
        } else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5) {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero4));
        } else {
            System.out.println("A soma dos dois maiores numeros é " + (numero1 + numero5));
        }
    }

} */

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();
        if (numero2 <= 0) {
            System.out.println("Digite o segundo numero: ");
            numero2 = scanner.nextInt();
        }
        System.out.println("A divisão dos dois numeros é " + (numero1 / numero2));
    }

} */
/*
import java.util.Scanner;

public class Main {

    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero1 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero2 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero3 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero4 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero5 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero6 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero7 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero8 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero9 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero10 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;
        int media = soma / 10;

        System.out.println("a soma dos numeros é " + soma + " a media é " + media);

    }
}
*/
/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero1 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero2 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero3 = scanner.nextInt();
        System.out.println("digite um numero");
        int numero4 = scanner.nextInt();
        int soma = numero1 + numero2 + numero3 + numero4;
        int media = soma / 4;
        if (media > 5) {
            System.out.println("PARABÉNS!!! você passou, vamuuu !!");
        } else if (media < 5) {
            System.out.println("IIIIII, não passou, infelizmente");
        } else { System.out.println("erro");
        }
    }
} */

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("EXPLOSÃO!!!!");
    }
} */

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}*/
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();
        double media = (primeiroNumero + segundoNumero) / 2.0;
        System.out.println("A média aritmética dos dois números é: " + media);
        int somaDosNumeros = 0;
        int quantidadeDeNumeros = 0;
        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            somaDosNumeros += i;
            quantidadeDeNumeros++;
        }
        double mediaEntreNumeros = (double) somaDosNumeros / quantidadeDeNumeros;
        System.out.println("A média aritmética dos números entre " + primeiroNumero + " e " + segundoNumero + " é: " + mediaEntreNumeros);

    }
} */
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeAlunosAprovados = 0;
        do {double somaNotas = 0;
            for (int i = 1; i <= 6; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double nota = scanner.nextDouble();
                somaNotas += nota;
            }
            double mediaFinal = somaNotas / 6;
            if (mediaFinal >= 6.5) {
                quantidadeAlunosAprovados++;
                System.out.println("Aluno Aprovado! Média Final: " + mediaFinal);
            } else {
                System.out.println("Aluno Reprovado. Média Final: " + mediaFinal);
            }
            System.out.print("Calcular a média de outro aluno? (S/N): ");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("S")) {
                break;
            }
        } while (true);
        System.out.println("Quantidade de alunos aprovados: " + quantidadeAlunosAprovados);
        scanner.close();
    }
} */
















