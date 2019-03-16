package teste001;

import java.util.Scanner;

public class AloMundo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o codigo do pedido:");
		int valorA = scanner.nextInt();
		
        Pedido pedido = new Pedido();
        pedido.setCodigo(valorA);
        
        System.out.println(pedido.getCodigo());
        
		}
		
	}
	
