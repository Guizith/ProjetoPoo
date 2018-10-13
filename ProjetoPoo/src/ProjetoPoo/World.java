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
public class World {
    
    
    
    //Função para iniciar o mundo vazio
    public void standardWorld() {
        int i, j;
        for (i = 0; i < 30; i++) {
            for (j = 0; j < 60; j++) {
                world[i][j] = '0';
                world[i][0] = '1';
                world[i][59] = '1';
                world[0][j] = '1';
                world[29][j] = '1';

                if (i == 4 && ((j > 5 && j < 11) || (j > 48 && j < 54))) {
                    world[i][j] = '2';
                } else if (i == 5 && ((j > 5 && j < 11) || (j > 48 && j < 54))) {
                    world[i][j] = '2';
                } else if (i == 6 && ((j > 5 && j < 11) || (j > 48 && j < 54))) {
                    world[i][j] = '2';
                } else if (i == 13 && ((j > 25 && j < 31))) {
                    world[i][j] = '2';
                } else if (i == 14 && ((j > 25 && j < 31))) {
                    world[i][j] = '2';
                } else if (i == 15 && ((j > 25 && j < 31))) {
                    world[i][j] = '2';
                } else if (i == 23 && ((j > 5 && j < 11) || (j > 48 && j < 54))) {
                    world[i][j] = '2';
                } else if (i == 24 && ((j > 5 && j < 11) || (j > 48 && j < 54))) {
                    world[i][j] = '2';
                } else if (i == 25 && ((j > 5 && j < 11) || (j > 48 && j < 54))) {
                    world[i][j] = '2';
                }
            }
        }

    }
    
    
    //Funçao para printar o world
    public void printWorld() {
        for (int i = 0; i < 30; i++) {
            System.out.println("");
            for (int j = 0; j < 60; j++) {
                System.out.printf("%c", world[i][j]);
            }
        }
        System.out.println();
    }
    
    
    //Função para definir aonde cada objeto esta no mundo, usando a velocity
    public void setVWorld(int x, int y, int velocity) {
        switch (velocity) {
            case 0:
                world[x][y] = '%';
                break;
            case 2:
                world[x][y] = '#';
                break;
            case 1:
                world[x][y] = '&';
                break;
            case 3:
                world[x][y] = '$';
                break;
            default:
               break;
        }
        
    }
        //Função para atualizar a moto no mundo
    public void setMWorld(ArrayList<Motorcycle> m) {
        for (int i = 0; i < m.size(); i++) {
            setVWorld(m.get(i).getX(), m.get(i).getY(), 3);
        }
    }
   
    //Função para atualizar o carro no mundo
    public void setCarWorld(ArrayList<Car> c) {
        for (int i = 0; i < c.size(); i++) {
            setVWorld(c.get(i).getX(), c.get(i).getY(), 2);
        }
    }
  

    //Função para atualizar o caminhao no mundo
    public void setTWorld(ArrayList<Truck> t) {
        for (int i = 0; i < t.size(); i++) {
            setVWorld(t.get(i).getX(), t.get(i).getY(), 1);
        }
    }
    //Função para atualizar a bicicleta no mundo
     public void setBWorld(ArrayList<Bicycle> b) {
        for (int i = 0; i < b.size(); i++) {
            setVWorld(b.get(i).getX(), b.get(i).getY(), 0);
        }
    }
   
    //Atualiza todos objetos no mundo
    public void setAllWorld(ArrayList<Bicycle> b,ArrayList<Motorcycle> m, ArrayList<Car> c, ArrayList<Truck> t, int amount) {
        for (int i = 0; i < amount; i++) {
            setVWorld(b.get(i).getX(), b.get(i).getY(), 0);
            setVWorld(c.get(i).getX(), c.get(i).getY(), 2);
            setVWorld(m.get(i).getX(), m.get(i).getY(), 3);
            setVWorld(t.get(i).getX(), t.get(i).getY(), 1);
        }
    }

    //Função que inicia 10 objetos de cada, em posição aleatoria no mundo
    public void startVehicles(ArrayList<Bicycle> b,ArrayList<Motorcycle> m, ArrayList<Car> c, ArrayList<Truck> t, int amount) {
        for (int i = 0; i < amount; i++) {
            
            int xb = (int) (Math.random() * 30);
            int yb = (int) (Math.random() * 60); 
            
            int xcar = (int) (Math.random() * 30);
            int ycar = (int) (Math.random() * 60);
            
            int xm = (int) (Math.random() * 30);
            int ym = (int) (Math.random() * 60);
            
            int xcam = (int) (Math.random() * 30);
            int ycam = (int) (Math.random() * 60);

            b.add(new Bicycle(xb,yb,0,false));
            c.add(new Car(xcar, ycar, 2, false));
            m.add(new Motorcycle(xm, ym, 3, false));
            t.add(new Truck(xcam, ycam, 1, false));
        }
    }

    private char[][] world = new char[30][60];
}
