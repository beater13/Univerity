public class Box {

    float height;
    float width;
    float depth;

    Box() {
        height = 1f;
        width = 1f;
        depth = 1f;
    }

    Box(float a) {
        height = a;
        width = a;
        depth = a;
    }

    Box(float width, float height, float depth) {
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    public float calculateSurface() {
        return 2 * width * height + 2 * depth * height + 2 * width * depth;
    }

    public float calculateVolume() {
        return depth * width * height;
    }
}
