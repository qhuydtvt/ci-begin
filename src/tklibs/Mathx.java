package tklibs;

/**
 * Created by huynq on 5/20/17.
 */
public class Mathx {
    public static double lerp(double a, double b, double f) {
        return a + f * (b - a);
    }

    public static float clamp(float value, float min, float max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }
}
