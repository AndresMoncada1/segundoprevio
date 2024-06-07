public class RAIS extends RegimenPensional {
    @Override
    public double calcularAporte(double salario) {
        return salario * 0.16;
    }

    @Override
    public double proyectarPension(Trabajador trabajador) {
        double expectativaVida = 20;
        return trabajador.getAportesAcumulados() / expectativaVida;
    }
}
