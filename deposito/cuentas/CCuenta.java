package cuentas;
/**
 * La clase CCuenta implementa los atributos y metodos necesarios para la gention 
 * de una cuenta bancaria. Ademas de los metodos getters y setters para obtener y
 * actualizar, respectivamente, los atributos, tenemos los metodos ingresar y retirar
 * que permiten modificar el saldo de una cuenta bancaria. 
 * @author carov
 * @version 1.0
 */
public class CCuenta {


	/*
	 * A continuacion se declaran los atributos de la clase
	 */
	/**
	 * Nombre del titular
	 */
    public String nombre;
    /**
     * Numero de cuenta
     */
    public String cuenta;
    /**
     * Saldo de la cuenta
     */
    public double saldo;
    /**
     * Tipo de interes de remuneracion de la cuenta
     */
    public double tipoInteres;

    /*
     * Constructores de objetos de tipo CCuenta
     */
    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }

    /**
     * Constructor a partir de los atributos
     * @param nom Nombre del titular
     * @param cue Numero de cuenta
     * @param sal Saldo de la cuenta
     * @param tipo Tipo de interes de remuneracion
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /*
     * Metodos getters y setters para la consulta y asignacion de los atributos
     */
    
    /**
	 * Metodo para obtener el nombre del titular
	 * @return el nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para asignar el nombre del titular
	 * @param nombre el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo para obtener el numero de cuenta
	 * @return el numero de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Metodo para asignar el numero de cuenta
	 * @param cuenta el numero de cuenta a establecer
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	//El siguiente metodo ya estaba incluido en el codigo, por lo que no se implementa el metodo getSaldo
	/**
	 * Metodo para obtener el saldo de la cuenta
	 * @return el saldo de la cuenta
	 */
	public double estado()
    {
        return saldo;
    }

	/**
	 * Metodo para asignar el saldo de la cuenta
	 * @param saldo el saldo a establecer
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metodo para obtener el tipo de interes de remuneracion
	 * @return el tipo de interes de remuneracion
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Metodo para asignar el tipo de interes de remuneracion
	 * @param tipoInteres el tipo de interes de remuneracion a establecer
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	

	/*
	 * Metodos para dotar de funcionalidad a la clase
	 */
	/**
	 * Metodo para ingresar una cantidad en una cuenta. Si la cantidad es positiva, el saldo de la cuenta es
	 * actualizado, sumando a su valor la cantidad
	 * @param cantidad cantidad a ingresar
	 * @throws Exception lanza una excepcion cuando la cantidad es negativa
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Metodo para retirar una cantidad en una cuenta. Si la cantidad es positiva y el saldo de la cuenta es
	 * mayor o igual que la cantidad, se actualiza el saldo restando a su valor la cantidad
	 * @param cantidad cantidad a retirar
	 * @throws Exception lanza una excepcion cuando la cantidad no es positiva o cuaando el saldo es inferior 
	 * que la cantidad a retirar 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
