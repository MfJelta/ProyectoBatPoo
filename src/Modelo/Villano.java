
package Modelo;

/**
 *
 * @author artor
 */
public class Villano extends Personaje {

    private String indiceDificultad;
    public Villano() {
    }

    public Villano(String indiceDificultad, String Nombre, int ataque, int defensa, int hp, int especial, int inteligencia, int costoEspecial, boolean guardiaActiva) {
        super(Nombre, ataque, defensa, hp, especial, inteligencia, costoEspecial, guardiaActiva);
        this.indiceDificultad = indiceDificultad;
    }

    

    

    public String getIndiceDificultad() {
        return indiceDificultad;
    }

    public void setIndiceDificultad(String indiceDificultad) {
        this.indiceDificultad = indiceDificultad;
    }

    @Override
    public void atacarFisico(Personaje objetivo) {
        int daño = calculateDamage(this.ataque, objetivo.getDefensa());
        objetivo.setHp(Math.max(0,objetivo.getHp() - daño));
        
        if(objetivo.isGuardiaActiva())
        {objetivo.setGuardiaActiva(false);
        }
    }

    @Override
    public void enGuardia() {
        if(!this.isGuardiaActiva())
        {this.setGuardiaActiva(true);
        }
    }

    @Override
    public boolean ataqueEspecial(Personaje objetivo) {
        if(this.getEspecial() < this.costoEspecial )
        {return false;}
        int dannio = calcularDañoEspecial(this.inteligencia, objetivo.getInteligencia());
        objetivo.setHp(Math.max(0, objetivo.getHp()-dannio));
        
        if(objetivo.isGuardiaActiva())
        {objetivo.setGuardiaActiva(false);
        
        }
        return true;
        
    
    
   
    
    
    
}
}
