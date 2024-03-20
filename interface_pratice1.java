/**
 * interface_pratice1
 */



interface Vechile{
    void changegrear(int newgear);
    void speedup(int newspeed);
    void applybreak(int newbreak);
}

 
class Bicycle implements Vechile{
    int speed;
    int gear;
    @Override
    public void changegrear(int newgear){
            gear=newgear;
    }
    @Override
    public void speedup(int newspeed){
            speed=newspeed;
}
@Override
public void applybreak(int newbreak){
    speed=speed-newbreak;
}
public void printStates(){
    System.out.println("speed: "+speed+", gear : "+gear);
}
}
class Bike implements Vechile{
    int speed;
    int gear;
    @Override
    public void changegrear(int newgear){
            gear=newgear;
    }
    @Override
    public void speedup(int newspeed){
            speed=newspeed;
}
@Override
public void applybreak(int newbreak){
    speed=speed-newbreak;
}
public void printStates(){
    System.out.println("speed: "+speed+", gear : "+gear);
}
}
public class interface_pratice1 {

    public static void main(String[] args) {
        Bicycle b1=new Bicycle();
        b1.applybreak(1);
        b1.changegrear(5);
        b1.speedup(4);
    System.out.println("bicycle data is above");
    b1.printStates();
    Bike c1=new Bike();
    c1.applybreak(10);
    c1.changegrear(4);
    c1.speedup(2);
    System.out.println("bike data is above");
        c1.printStates();

}
}