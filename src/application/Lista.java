package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lista {

	public static void main(String[] args) {


/* 1- Crie uma lista e adicione sete notas
		
	List<Double> notas = new ArrayList<>();
	
	notas.add(3.5);
	notas.add(4.8);
	notas.add(5.3);
	notas.add(7.7);
	notas.add(9.0);
	notas.add(2.5);
	notas.add(8.1);
	
	System.out.print(notas);

		
// Outra forma:
/*
		List<Double> notas2 = new ArrayList<>(Arrays.asList(5.6 , 3.4 , 5.5));
		System.out.println(notas2);
		notas2.add(7.7);
		notas2.add(5.56);
		System.out.println(notas2);
		notas2.remove(0);
		
		
		System.out.println(notas2);
*/		
// Uma terceira maneira de criar uma lista é possivel, porém não permite manipular 
//		( inserir ou extrair elementos com métodos notas.add() e notas.remove() 
//		Este tipo de lista é chamada de Lista Imutável ( ImmutaBLEcOLLECTIONS)
//		List<Double> notas3 = Arrays.asList(5.6 , 3.4 , 5.5);
//		System.out.println(notas3);
//		notas3.add(9.0);
		
//      TAMBÉM É IMUTÁVEL :		
//		List<Double> notas3 = List.of(5.6 , 3.4 , 5.5);
//		System.out.println(notas3);
//		notas3.add(9.0);
//
//		Para inserir um itém na lista em uma posição específica, usamos a notação:
//		notas.add( int index, double value)
		
		List<Double> notas = new ArrayList<>();
		
		notas.add(3.5);
		notas.add(4.8);
		notas.add(5.3);
		notas.add(7.7);
		notas.add(9.0);
		notas.add(2.5);
		notas.add(0d);
		
	System.out.println(notas);
	
	/*	// 2 - Para adicionar um elemento na lista em uma posição determinada :
	 * 
		notas.add(3, 0.5);
		
		System.out.println(notas);
		
		
//       3 - Exiba a posição da  nota 9.0
		
		System.out.println(notas.indexOf(9.0));
		
//       4 - Substitua a nota 9.0 pela nota 9.5 nesta posição.
		
		notas.set(notas.indexOf(9.0), 9.5);
		
		System.out.println(notas);
		
//       5 - Confira se a nota 2.5 esta presente na coleção:
		
		System.out.println (notas.contains(2.5));
		
//       6- Impressão dos itens da lista na vertical:
		
		for ( Double nota :  notas) {
			System.out.println(nota);
		}
		
*/		
	
//      7 - Obtenha o Quarto elemento da lista.
	
//	System.out.println(notas.get(3));
	
//     8 - Exiba a maior e a menor nota da lista:
	
//System.out.println("A maior nota é: " + Collections.max(notas));
//System.out.println("A menor nota é: " + Collections.min(notas));

//     9 - Determine a média das notas:
// A - fazendo a soma dos elementos:
/*
Iterator<Double> iterator = notas.iterator();
Double soma = 0d;
	while (iterator.hasNext()) {
		Double next = iterator.next();
		soma += next;
	}
	
	
// B - Obtendo o número de elementos:
Integer qtd = notas.size();
Double quantidade = (double)qtd;

// C - Obtendo a média aritimética:

Double mediaAritmetica = soma / quantidade;

System.out.println("A média Aritimética é:" + mediaAritmetica);

	
//     10 - Executar um método para ordenar em ordem crescente a lista:
//		Collections.sort(notas);
//		System.out.println(notas);
 */
 
 
 //      11 - Removendo um elemento em uma determinada posição:
 
 		notas.remove(0);
 		System.out.println(notas);
 		
 		//12 - Removendo um elemento da lista :
 		
 			notas.remove(0d);
 		System.out.println(notas);
	}

}
