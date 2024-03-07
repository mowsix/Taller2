public interface Punto2D {



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

