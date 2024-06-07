public class Trabajador extends Persona {
    private double salario;
    private RegimenPensional regimenPensional;
    private double aportesAcumulados;
    private int semanasCotizadas;
    public String nombre;
    public String identificacion;
    public String tipoTrabajador;
    
    
    public Trabajador(String nombre, String identificacion, String tipoTrabajador, double salario, RegimenPensional regimenPensional) {
        super(nombre, identificacion, tipoTrabajador);
        this.salario = salario;
        this.regimenPensional = regimenPensional;
        this.aportesAcumulados = 0;
        this.semanasCotizadas = 0;
    }



/**GET Method Propertie nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**SET Method Propertie nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**GET Method Propertie identificacion*/
    public String getIdentificacion(){
        return this.identificacion;
    }//end method getIdentificacion

    /**SET Method Propertie identificacion*/
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }//end method setIdentificacion

    /**GET Method Propertie tipoTrabajador*/
    public String getTipoTrabajador(){
        return this.tipoTrabajador;
    }//end method getTipoTrabajador

    /**SET Method Propertie tipoTrabajador*/
    public void setTipoTrabajador(String tipoTrabajador){
        this.tipoTrabajador = tipoTrabajador;
    }//end method setTipoTrabajador


    /**GET Method Propertie salario*/
    public double getSalario(){
        return this.salario;
    }//end method getSalario

    /**SET Method Propertie salario*/
    public void setSalario(double salario){
        this.salario = salario;
    }//end method setSalario

    /**GET Method Propertie regimenPensional*/
    public RegimenPensional getRegimenPensional(){
        return this.regimenPensional;
    }//end method getRegimenPensional

    /**SET Method Propertie regimenPensional*/
    public void setRegimenPensional(RegimenPensional regimenPensional){
        this.regimenPensional = regimenPensional;
    }//end method setRegimenPensional

    /**GET Method Propertie aportesAcumulados*/
    public double getAportesAcumulados(){
        return this.aportesAcumulados;
    }//end method getAportesAcumulados

    /**SET Method Propertie aportesAcumulados*/
    public void setAportesAcumulados(double aportesAcumulados){
        this.aportesAcumulados = aportesAcumulados;
    }//end method setAportesAcumulados

    /**GET Method Propertie semanasCotizadas*/
    public int getSemanasCotizadas(){
        return this.semanasCotizadas;
    }//end method getSemanasCotizadas

    /**SET Method Propertie semanasCotizadas*/
    public void setSemanasCotizadas(int semanasCotizadas){
        this.semanasCotizadas = semanasCotizadas;
    }//end method setSemanasCotizadas

//End GetterSetterExtension Source Code


}//End class