interface IPlayer {
    // void walk();        // public abstract void walk();
    // void run();
    // void jump();
    void kick();
    void punch();
    // static void walk() {

    // }
    default void walk() {

    }
    default void run() {

    }
    default void jump() {

    }
}

// abstract class CommonUtils implements IPlayer {
//     @Override
//     public void walk() {

//     }
//     @Override
//     public void run() {
        
//     }
//     @Override
//     public void jump() {
        
//     }
// }

class King implements IPlayer {
    @Override
    public void punch() {
        
    }
    @Override
    public void kick() {
        
    }
}
class Paul implements IPlayer {
    @Override
    public void punch() {
        
    }
    @Override
    public void kick() {
        
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        King king = new King();
        king.walk();
        king.punch();
        // IPlayer player = new Paul();
    }
}
