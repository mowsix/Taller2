public class Estacion implements Punto2D {
    private double x;
    private double y;

    public Estacion(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double distancia(Punto2D punto) {
        return 0;
    }
}
