public abstract class user {

    protected int id;

    private static int counter = 1000;

    public static int getCounter() {
        return counter;
    }

    {
        id =+counter;
    }

    public int getId() {
        return id;
    }
}
