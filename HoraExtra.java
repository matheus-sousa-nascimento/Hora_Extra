/*
 * HoraExtra.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;

public class HoraExtra {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double horasTrabalhadasMes  = 0;
		double salPorHora			= 0;
		
		
		System.out.print("Digite quantas horas voce trabalhou por mes: ");
		horasTrabalhadasMes = entrada.nextDouble();
		
		System.out.print("Digite quanto voce ganha por hora: ");
		salPorHora = entrada.nextDouble();
		
		double salTotal = (horasTrabalhadasMes > 160 ?((horasTrabalhadasMes * 1.5) * salPorHora) : (horasTrabalhadasMes * salPorHora) );
		
		System.out.print("Salario total: "+ salTotal);
	}
}

