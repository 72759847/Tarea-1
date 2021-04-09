
public class Gato
{
    // Atributos
    private String Nombre;
    private double Tamaño;
    private int Edad;
    private String Color;
    // Constructor
    public Gato( String Nombre, double Tamaño, int Edad, String Color ){
        this.Nombre = Nombre;
        this.Tamaño = Tamaño;
        this.Edad = Edad;
        this.Color = Color;
    }
    // Metodo 1
    public  String Jugar(){
        String Jugar;
        Jugar = "gato"+Nombre+Tamaño+Edad+Color+" esta jugando con la pelota";
        return Jugar;    
    }
    // Metodo 2
    public String Dormir(){
        String Dormir;
        Dormir = "gato"+Nombre+Tamaño+Edad+Color+"esta durmiendo en la cama";
        return Dormir;

    }
    // Metodos get, set.

    public String getNombre(){
        return Nombre;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public double getTamaño(){
        return Tamaño;
    }

    public void setTamaño(int Tamaño){
        this.Tamaño = Tamaño;
    }

    public int getEdad(){
        return Edad;
    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public String getColor(){
        return Color;
    }

    public void setColor(String Color){
        this.Color = Color;
    }
}
