import java.util.Map;

public class Api {
    public static int cpu() {
        return Runtime.getRuntime().availableProcessors();
    }

    public static Map<String, String> env() {
        return System.getenv();
    }
}
