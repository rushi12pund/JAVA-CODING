package multi;

class tempalrun extends Thread {
    public void run() {
        startgame();
    }

    void startgame() {
        System.out.println("Game is starting");
    }
}

class bhulbhulaiya extends Thread {
    public void run() {
        entering();
    }

    void entering() {
        System.out.println("Entering to the bhoolbhulaiya");
    }
}

class goinwater extends Thread {
    public void run() {
        go();
    }

    void go() {
        System.out.println("Going to the water");
    }
}

public class NEW {
    public static void main(String[] args) {
        tempalrun t1 = new tempalrun();
        t1.start();

        bhulbhulaiya b1 = new bhulbhulaiya();
        b1.start();

        goinwater g1 = new goinwater();
        g1.start();
    }
}
