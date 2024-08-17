
package com.mycompany.principal;

import com.mycompany.Principal.Memoria;
import com.mycompany.Principal.Processador;

public class Principal {

    public static void main(String[] args) {
        Memoria memoria1 = new Memoria("2Tb", "32Hz", "Asus", "26656");
        
        Processador processador1 = new Processador("24Hz", "Asus", "21145");
                
        PlacaMae placamae1 = new PlacaMae("PGA", "Terabyte", "323121");
        
        DispositivoDeArmazenamento  dispositivodearmazenamento1 = new DispositivoDeArmazenamento("1Tb", "USB", "Asus", "858788");
        
        System.out.println("\nDados da Memória: " );
        System.out.println("Capacidade de Armazenamento: " + memoria1.getCapacidaDeArmazenamento());
        System.out.println("Frequência: " + memoria1.getFrequencia());
        System.out.println("Marca: " + memoria1.getMarca());
        System.out.println("Modelo: " + memoria1.getModelo());
        
        System.out.println("\nDados do Processador: " );
        System.out.println("Frequencia: " +processador1.getFrequencia() );
        System.out.println("Marca: " + processador1.getMarca());
        System.out.println("Modelo: " + processador1.getModelo());
        
        System.out.println("\nDados da Placa Mãe: ");
        System.out.println("Soquete: " + placamae1.getSoquete());
        System.out.println("Marca: " + placamae1.getMarca());
        System.out.println("Modelo: " + placamae1.getModelo());
        
        System.out.println("\nDados do Dispositivo de Armazenamento: ");
        System.out.println("Capacidade de Armazenamento: " + dispositivodearmazenamento1.getCapacidaDeArmazenamento());
        System.out.println("Tipo de Conexão: " + dispositivodearmazenamento1.getTipoDeConexao());
        System.out.println("Marca: " + dispositivodearmazenamento1.getMarca());
        System.out.println("Modelo: " + dispositivodearmazenamento1.getModelo());
        
    }

}