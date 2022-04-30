abstract class Animal {
    abstract void run();
}

class Tiger extends Animal {
    void run() {
        System.out.println("running safely..");
    }

    public static void main(String args[]) {
        Tiger obj = new Tiger();
        obj.run();
    }
}
