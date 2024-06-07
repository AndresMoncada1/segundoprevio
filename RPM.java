public class RPM extends RegimenPensional {
    
    @Override
    public double calcularAporte(double salario) {
        return salario * 0.16;
    }

    @Override
    public double proyectarPension(Trabajador trabajador) {
        double IBL = trabajador.getSalario();
        int semanas = trabajador.getSemanasCotizadas();

        double P;
        if (semanas < 1300) {
            P = 0.65;
        } else {
            P = 0.65 + ((semanas - 1300) / 50) * 0.015;
            if (P > 0.8) {
                P = 0.8;
            }
        }

        return IBL * P;
    }
}

