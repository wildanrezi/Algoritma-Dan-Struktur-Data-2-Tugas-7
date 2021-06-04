package tugas7;

public class antrianapp {
    public static void main(String[] args){
        antrian antrian = new antrian(10);
        antrian.enqueue(40);
        antrian.display();
        antrian.enqueue(33);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        antrian.enqueue(60);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        antrian.enqueue(54);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        
    }
}
