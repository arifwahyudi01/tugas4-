import java.util.LinkedList;
import java.util.Queue;

public class tugas4 {
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<String>();

        queue.add("Arif");     // Insert `A` into the queue
        queue.add("Badru");     // Insert `B` into the queue
        System.out.println("Queue awal:" + queue);

        queue.add("Caca");     // Insert `C` into the queue
        queue.add("Didi");     // Insert `D` into the queue
        queue.add("Elan");     // Insert `E` into the queue
        queue.add("Farhan");     // Insert `F` into the queue
        System.out.println("Queue Setelah Ditambah beberapa karakter:" + queue);


        System.out.println("Elemen Pertamanya yaitu " + queue.peek());

        queue.remove();     // removing the front element (`A`)
        queue.remove();     // removing the front element (`B`)

        queue.add("Gita");     // Insert `G` into the queue
        queue.add("Hamzah");     // Insert `H` into the queue
        System.out.println("Queue Setelah di Remove Beberapa Karakter:" + queue);


        System.out.println("Elemen Pertamanya yaitu " + queue.peek());

        // Returns the total number of elements present in the queue
        System.out.println("Ukuran queue itu adalah " + queue.size());

        // check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("Queue ini kosong");
        }
        else {
            System.out.println("Queue ini tidak kosong");
        }
    }
}