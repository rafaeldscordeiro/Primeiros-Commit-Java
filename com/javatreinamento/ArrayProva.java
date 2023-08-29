package com.javatreinamento;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

/*O método `Arrays.sort()` em Java oferece várias opções para personalizar a ordenação de arrays. Você pode usar diferentes formas de sobrecargas do método para atender às suas necessidades. Algumas opções incluem:
1. **Ordenação em Ordem Alfabética (Padrão):**
   ```java
   Arrays.sort(array);
   ```
2. **Ordenação com Comparador Personalizado:**
   Você pode passar um objeto `Comparator` como argumento para definir uma lógica de comparação personalizada.
   ```java
   Arrays.sort(array, comparator);
   ```
3. **Ordenação de Intervalos Específicos:**
   Você pode especificar um intervalo dentro do array a ser ordenado.
   ```java
   Arrays.sort(array, startIndex, endIndex);
   ```
4. **Ordenação em Ordem Reversa:**
   Você pode usar a classe `Collections` para inverter a ordem de classificação após a ordenação.
   ```java
   Arrays.sort(array, Collections.reverseOrder());
   ```
5. **Ordenação com Expressões Lambda:**
   A partir do Java 8, você pode usar expressões lambda para definir um comparador personalizado.
   ```java
   Arrays.sort(array, (a, b) -> a.compareTo(b)); // Ordem crescente
   Arrays.sort(array, (a, b) -> b.compareTo(a)); // Ordem decrescente
   ```
Lembre-se de importar a classe `Arrays` e, se necessário, a classe `Collections` e a interface `Comparator` para usar essas funcionalidades. A escolha da opção depende das suas necessidades específicas de ordenação.
*/

public class ArrayProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new java.util.Scanner(System.in);

        int i;
        String[] lista = new String[5];

        System.out.println("Informe 5 cores: ");
        for (i = 0; i < 5; i++) {
            lista[i] = scan.next();
        }

        //Arrays.sort(lista, (a, b) -> b.compareTo(a));// Ordena de trás para frente*
        
        //Arrays.sort(lista); // Ordena em ordem alfabética
        
        Arrays.sort(lista, Collections.reverseOrder());

        System.out.println("Cores ordenadas de trás para frente:");
        for (String cor : lista) {
            System.out.println(cor);
        }
    }
}