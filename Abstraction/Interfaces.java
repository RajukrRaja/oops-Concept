// Interfaces help to implement Multiple inheritance 
// To Achieve 100% abstraction
// Interfaces are implements not extends 
//  variables in the interfaces are final , public and static.


package OopsConcept.Abstraction;

public class Interfaces {
    public static void main(String[] args) {
        ChessPlayer q = new Queen();
        q.Moves();
    }
}

interface ChessPlayer {
    void Moves();
}

class Queen implements ChessPlayer {
    public void Moves() {
        System.out.println("up, down, left, right, diagonal (in all four directions)");
    }
}

class Rook implements ChessPlayer {
    public void Moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void Moves() {
        System.out.println("up, down, left, right, and diagonal (by 1 step)");
    }
}
