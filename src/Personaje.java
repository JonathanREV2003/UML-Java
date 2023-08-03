public abstract class Personaje {

    private String nombre;
    private String descripccion;
    private Long tamaño;
    private int poder;
    private int vida;

    public void desplazarce(){System.out.println("desplazarce");};
    public int mostrarVida(){return 3;}
    public void mostarPoder(){System.out.println("poder 1");};


}
