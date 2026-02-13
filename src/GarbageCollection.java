@SuppressWarnings("removal")
public class GarbageCollection {
    @Override
    protected void finalize() throws Throwable {
            System.out.println("Garbage Collected");
            super.finalize();
    }

    public static void main(String[] args) {
        // TODO: Create an object of GarbageCollection class
        GarbageCollection gc = new GarbageCollection();

        // TODO: Make the object eligible for garbage collection (e.g., assign null)
        gc = null;

        // TODO: Request Garbage Collectioni using System.gc()
        System.gc();

        // Tip: You might need a small delay or simply exiting might trigger it in some JVMs, 
        // but System.gc() is the standard call.
    }
}
