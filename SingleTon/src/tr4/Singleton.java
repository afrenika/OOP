package tr4;

public enum Singleton {
    UNIQUE_INSTANCE;

    public class SingletonClient {
        public static void main(String[] args) {
            Singleton singleton = Singleton.UNIQUE_INSTANCE;
    // здесь используется Одиночка
        }
    }
}
