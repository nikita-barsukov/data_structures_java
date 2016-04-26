package recursion;

public class TowerOfHanoi {
    public void move(int numberOfDisks, char from, char to, char inter) {

        if(numberOfDisks == 1){
            System.out.println("Moving disc " + numberOfDisks + " from " + from + " to " + to);
        } else {
            move(numberOfDisks - 1, from, inter, to);
            System.out.println("Moving disc " + numberOfDisks + " from " + from + " to " + to);
            move(numberOfDisks - 1, inter, to, from);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi toh = new TowerOfHanoi();
        toh.move(5, 'A', 'C', 'B');
    }
}
