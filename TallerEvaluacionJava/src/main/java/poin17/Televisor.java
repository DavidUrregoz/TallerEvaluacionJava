package poin17;

public class Televisor extends Electrodomestico{
    private double resolucion =20 ;
    private boolean sintonizadorTDT=false;

    public Televisor() {
        prcioFinal();
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
        prcioFinal();
    }

    public Televisor(double precioBase, String color,
                     char consumo, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        prcioFinal();
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public void prcioFinal() {
        super.prcioFinal();
        if(this.resolucion>40){
            this.precioTotal+=this.precioBase*0.3;
        }
        if(this.sintonizadorTDT) {
            this.precioTotal += 50;
        }
    }
}
