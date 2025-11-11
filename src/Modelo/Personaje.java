
package Modelo;

/**
 *
 * @author artor
 */
public abstract class Personaje {
    protected String Nombre;
    protected int ataque,defensa,hp,especial, inteligencia, costoEspecial;
    protected boolean guardiaActiva;
    
    public abstract void atacarFisico(Personaje objetivo);
    
    public abstract void enGuardia();
    
    public abstract boolean ataqueEspecial(Personaje objetivo);
    
    
    protected int calculateDamage(int atk, int def) {
        int base = atk - (def / 2);
        if (base < 1) base = 1;
        double factor = 0.85 + Math.random() * 0.3;
        return (int) Math.round(base * factor); //redondea
    } // metodo auxiliar para calcular daño
    
    protected int calcularDañoEspecial( int inteligencia, int inteligenciaobjetivo){
        int base = inteligencia - (inteligenciaobjetivo/2);
        if (base < 1 ) base = 1;
        double factor = 0.85 + Math.random() * 0.3;
        return (int)Math.round(base * factor);
    }

    public Personaje() {
    }

    public Personaje(String Nombre, int ataque, int defensa, int hp, int especial, int inteligencia, int costoEspecial, boolean guardiaActiva) {
        this.Nombre = Nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.hp = hp;
        this.especial = especial;
        this.inteligencia = inteligencia;
        this.costoEspecial = costoEspecial;
        this.guardiaActiva = guardiaActiva;
    }

    

   

  

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public boolean isGuardiaActiva() {
        return guardiaActiva;
    }

    public void setGuardiaActiva(boolean guardiaActiva) {
        this.guardiaActiva = guardiaActiva;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getCostoEspecial() {
        return costoEspecial;
    }

    public void setCostoEspecial(int costoEspecial) {
        this.costoEspecial = costoEspecial;
    }
    
    
}
