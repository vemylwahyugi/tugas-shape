/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package shape;

/**
 *
 * @author Lukman
 */
public class Circle extends Shape {
    public int jari2;
    public Circle(String n){
        nama=n;
    }
    public String getName(){
        return nama;
    }
    public void setArea(int r){
        jari2=r;
        Area=(3.14*jari2*jari2);
    }
    public double getArea(){
        return Area;
    }

    public static void main(String []args){
        Circle x = new Circle("Lingkaran Satu");
        x.setArea(7);
        System.out.println("Nama : "+x.getName());
        System.out.println("Luas : "+x.getArea());
    }
}
