/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoPoo;
import java.util.ArrayList;
/**
 *
 * @author Guilherme Henrique Moreira
 */
public class ProjetoPoo {
    public static void main(String[] args) {
        
        World w = new World();
        ArrayList<Car> c = new ArrayList<>(); 
        ArrayList<Motorcycle> m = new ArrayList<>(); 
        ArrayList<Truck> t = new ArrayList<>(); 
        ArrayList<Bicycle> b = new ArrayList<>();

        
        
        w.standardWorld(); //inicia o mundo vazio
        w.printWorld(); //Printa o mundo
        w.startVehicles(b,m, c, t, 10); //Inicia 10 veiculos de cada
        w.setAllWorld(b,m, c, t, 10); //Inclui os veiculos criados no mundo
        w.printWorld(); //Printa o mundo
        
        
        //Looping até que m(array de motos) ou c(array de carros) esteja vazio
        while (!m.isEmpty() | !c.isEmpty()) { 
          
            
          
            for (int i = 0; i < b.size(); i++) {
                b.get(i).move(b,m, c, t, 0); //realiza o movimento da bicileta no mundo
            }
            
          
            for (int i = 0; i < m.size(); i++) {
                m.get(i).move(b,m, c, t, 3);  //realiza o movimento da moto no mundo
            }
           
            for (int i = 0; i < c.size(); i++) {
                c.get(i).move(b,m, c, t, 2);  //realiza o movimento do carro no mundo
            }
           
            for (int i = 0; i < t.size(); i++) {
                t.get(i).move(b,m, c, t, 1);  //realiza o movimento do caminhao no mundo
            }
       

            w.standardWorld();  //Inicia o mundo sem veiculos
            w.setMWorld(m);     //Atualiza as motos no mundo
            w.setCarWorld(c);   //Atualiza os carros no mundo
            w.setTWorld(t);     //Atualiza os caminhoes no mundo
            w.setBWorld(b);     //Atualiza as bicicletas no mundo
            w.printWorld();     //Printa o mundo
            
            
            System.out.println("\nVeiculos contidos no mundo:");
            System.out.printf("\nNumero de bicicletas(%%): %d", b.size());
            System.out.printf("\nNumero de motos($): %d", m.size());
            System.out.printf("\nNumero de carros(#): %d", c.size());
            System.out.printf("\nNumero de caminhoes(&): %d\n", t.size());
            int tot = b.size() + m.size() + c.size() + t.size();
            System.out.println("\nO total de veiculos eh:"+ tot);
            
        }
    
        
    //Remove todos objetos instanciados apos o fim do While
        for (int i = 0; i < t.size(); i++) {
            t.remove(i);
        }
        for (int i = 0; i < c.size(); i++) {
            c.remove(i);
        }
        for (int i = 0; i < m.size(); i++) {
            m.remove(i);
        }
        for (int i = 0; i < b.size(); i++) {
            b.remove(i);
        }

    }  
}
