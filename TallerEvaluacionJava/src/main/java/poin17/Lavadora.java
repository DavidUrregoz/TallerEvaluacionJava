package poin17;

public class Lavadora extends Electrodomestico{
    private double carga =5;

    public Lavadora(){

    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public void prcioFinal() {
        super.prcioFinal();
        if(this.carga>50){
            this.precioTotal+=50;
        }
    }

}

