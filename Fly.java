public interface Fly {

    void takeOff();

    int ascend(int meters);

    default void glide() {
        System.out.println("glides into the air");
    }

    void descend(int meters);

    void land();
}