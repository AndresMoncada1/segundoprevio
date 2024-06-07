import java.util.ArrayList;

public class SistemaPensiones {
    private ArrayList<Trabajador> trabajadores;

    public SistemaPensiones() {
        trabajadores = new ArrayList<>();
    }

    public Trabajador afiliarTrabajador(String nombre, String identificacion, String tipoTrabajador, double salario, String tipoRegimen) {
        RegimenPensional regimen = null;

        if (tipoRegimen.equalsIgnoreCase("RPM")) {
            regimen = new RPM();
        } else if (tipoRegimen.equalsIgnoreCase("RAIS")) {
            regimen = new RAIS();
        } else {
            throw new IllegalArgumentException("Tipo de régimen no válido");
        }

        Trabajador trabajador = new Trabajador(nombre, identificacion, tipoTrabajador, salario, regimen);
        trabajadores.add(trabajador);
        return trabajador;
    }

    public double calcularAporteMensual(Trabajador trabajador) {
        return trabajador.getRegimenPensional().calcularAporte(trabajador.getSalario());
    }

    public double simularPension(Trabajador trabajador) {
        return trabajador.getRegimenPensional().proyectarPension(trabajador);
    }

    public void imprimirInformacionTrabajadores() {
        for (Trabajador trabajador : trabajadores) {
            System.out.println("----------------------------------------------------");
            System.out.println("Nombre: " + trabajador.getNombre());
            System.out.println("Identificación: " + trabajador.getIdentificacion());
            System.out.println("Tipo de Trabajador: " + trabajador.getTipoTrabajador());
            System.out.println("Salario: " + trabajador.getSalario());
            System.out.println("Aportes Mensuales: " + calcularAporteMensual(trabajador));
            System.out.println("Pensión Proyectada: " + simularPension(trabajador));
            System.out.println("----------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        SistemaPensiones sistema = new SistemaPensiones();

        // Afiliar trabajadores
        Trabajador trabajadorRpm = sistema.afiliarTrabajador("Juan Perez", "12345678", "dependiente", 2000000, "RPM");
        Trabajador trabajadorRais = sistema.afiliarTrabajador("Maria Gomez", "87654321", "independiente", 3000000, "RAIS");

        // Simular aportes y pensiones
        trabajadorRpm.setSemanasCotizadas(1500);
        trabajadorRais.setAportesAcumulados(50000000);

        // Imprimir información de trabajadores
        sistema.imprimirInformacionTrabajadores();
    }
}
