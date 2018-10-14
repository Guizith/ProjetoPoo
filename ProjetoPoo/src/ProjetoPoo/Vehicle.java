/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoPoo;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Guilherme Henrique Moreira
 */
public class Vehicle {
    
    protected int y;
    protected int x;
    protected int velocity;
    private boolean factory;
    int i, j;
    
    //Construtor para Vehicle
    public Vehicle(int x, int y, int velocity, boolean factory) {
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.factory = factory;
    }
    //Getters e Setters
    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public boolean isFactory() {
        return factory;
    }

    public void setFactory(boolean factory) {
        this.factory = factory;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

 
    
    
    
    //Faz a movimentação dos objetos 
    public void move(ArrayList<Bicycle> b,ArrayList<Motorcycle> m, ArrayList<Car> c, ArrayList<Truck> t, int velocity) {
        
        Random aleat = new Random();
        int ch = aleat.nextInt(4);
        switch (ch) {
            case 0:
                y = (y + velocity+1) % 60;
                break;
            case 1:
                y = (y - velocity+1) % 60;
                if (y < 0) {
                    y = 60 - Math.abs(y);
                }   break;
            case 2:
                x = (x + velocity+1) % 30;
                break;
            case 3:
                x = (x - velocity+1) % 30;
                if (x < 0) {
                    x = 30 - Math.abs(x);
                }   break;
            default:
                break;
        }
        
        
        inFactory(b,m, c, t, velocity);
        
        collision(b,m, c, t);
        
    }
    
    //Função para duplicar o veiculo caso esteja na fabrica
    
    public void inFactory(ArrayList<Bicycle> b,ArrayList<Motorcycle> m, ArrayList<Car> c, ArrayList<Truck> t, int velocity) {
        int xRandom = (int) (Math.random() * 30);
        int yRandom = (int) (Math.random() * 60);
        if (x == 4 && ((y > 5 && y < 11) || (y > 48 && y < 54))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }

            }
        } else if (x == 5 && ((y > 5 && y < 11) || (y > 48 && y < 54))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }
            }
        } else if (x == 6 && ((y > 5 && y < 11) || (y > 48 && y < 54))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }
            }
        } else if (x == 13 && ((y > 25 && y < 31))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }   
            }
        } else if (x == 14 && ((y > 25 && y < 31))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }
            }
        } else if (x == 14 && ((y > 25 && y < 31))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }
            }
        } else if (x == 15 && ((y > 25 && y < 31))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }
            }
        } else if (x == 23 && ((y > 5 && y < 11) || (y > 48 && y < 54))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }
            }
        } else if (x == 24 && ((y > 5 && y < 11) || (y > 48 && y < 54))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }
            }
        } else if (x == 25 && ((y > 5 && y < 11) || (y > 48 && y < 54))) {
            if (factory == false) {
                if (velocity == 3) {
                    m.add(new Motorcycle(xRandom, yRandom, 3, false));
                    factory = true;
                }
                if (velocity == 2) {
                    c.add(new Car(xRandom, yRandom, 2, false));
                    factory = true;
                }
                if (velocity == 1) {
                    t.add(new Truck(xRandom, yRandom, 1, false));
                    factory = true;
                }
                if (velocity == 0) {
                    b.add(new Bicycle(xRandom, yRandom, 0, false));
                    factory = true;
                }
            }
        }
    }

    
    
    
    
    //Função para remover o objeto casa haja colisão
    public void collision(ArrayList<Bicycle> b,ArrayList<Motorcycle> m, ArrayList<Car> c, ArrayList<Truck> t) {
        int i , j;
        
         for (i  = 0; i  < m.size(); i ++) {  //Colisão bike com moto
            for (j = 0; j < b.size(); j++) {
                if (m.get(i ).getX() == b.get(j).getX() & m.get(i ).getY() == b.get(j).getY()) {
                    b.remove(j);
                    if (i  > 0) {
                        i --;
                    }
                    if (j > 0) {
                        j--;
                    }

                }
            }
        }
         

        for (i  = 0; i  < c.size(); i ++) {  //Colisão bike com carro
            for (j = 0; j < b.size(); j++) {
                if (c.get(i ).getX() == b.get(j).getX() & c.get(i ).getY() == b.get(j).getY()) {
                    b.remove(j);
                    if (i  > 0) {
                        i --;
                    }
                    if (j > 0) {
                        j--;
                    }

                }
            }
        }       
        
            for (i = 0; i < c.size(); i++) {  //Colisão moto com carro
            for (j = 0; j < m.size(); j++) {
                if (c.get(i).getX() == m.get(j).getX() & c.get(i).getY() == m.get(j).getY()) {
                    m.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }

                }
            }
        }
        for (i = 0; i < t.size(); i++) { //Colisão moto com caminhao
            for (j = 0; j < m.size(); j++) {
                if (t.get(i).getX() == m.get(j).getX() & t.get(i).getY() == m.get(j).getY()) {
                    m.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }
        for (i = 0; i < m.size(); i++) { //Colisão moto com moto
            for (j = i + 1; j < m.size() - 1; j++) {
                if (m.get(i).getX() == m.get(j).getX() & m.get(i).getY() == m.get(j).getY()) {
                    m.remove(i);
                    m.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }

        for (i = 0; i < c.size(); i++) { //Colisão carro com carro
            for (j = i + 1; j < c.size() - 1; j++) {
                if (c.get(i).getX() == c.get(j).getX() & c.get(i).getY() == c.get(j).getY()) {
                    c.remove(i);
                    c.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }

        for (i = 0; i < t.size(); i++) { //Colisão carro com caminhao
            for (j = 0; j < c.size(); j++) {
                if (t.get(i).getX() == c.get(j).getX() & t.get(i).getY() == c.get(j).getY()) {
                    c.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }

        for (i = 0; i < t.size(); i++) { //Colisão caminhao com caminhao
            for (j = i + 1; j < t.size() - 1; j++) {
                if (t.get(i).getX() == t.get(j).getX() & t.get(i).getY() == t.get(j).getY()) {
                    t.remove(i);
                    t.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }
        for (i = 0; i < b.size(); i++) { //Colisão bike com bike
            for (j = i + 1; j < b.size() - 1; j++) {
                if (b.get(i).getX() == b.get(j).getX() & b.get(i).getY() == b.get(j).getY()) {
                    b.remove(i);
                    b.remove(j);
                    if (i > 0) {
                        i--;
                    }
                    if (j > 0) {
                        j--;
                    }
                }
            }
        }


    }

}
