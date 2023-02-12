
import java.util.Arrays;

/**
 * @Author ETOUMI Aristide
 */
public class ArrayProcessorClass {
    public static final ArrayProcessor max = (array) -> {
        return Arrays.stream(array).max().getAsDouble();
    };
    public static final ArrayProcessor min = (array) -> {
        return Arrays.stream(array).min().getAsDouble();
    };
    public static final ArrayProcessor sum = (array) -> {
        return Arrays.stream(array).sum();
    };
    public static final ArrayProcessor average = (array) -> {
        return Arrays.stream(array).average().getAsDouble();
    };

    public static ArrayProcessor counter(double value) {
        return (array) -> {
            return Arrays.stream(array).filter(data -> data == value).count();
        };

    }
}
