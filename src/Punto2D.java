public interface Punto2D {

    /**
     *
     * @return La coordenada X del punto
     */
    double getX();

    /**
     *
     * @return La coordenada Y del punto
     */
    double getY();

    /**
     *
     * @return La distancia euclideana entre 'this' y 'punto'
     */
    double distancia(Punto2D punto);
}

