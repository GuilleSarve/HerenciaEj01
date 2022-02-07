

package herenciaejercicio01;

/**
 *
 * @author Guille
 */
public class HerenciaEjercicio01 {

   
    public static void main(String[] args) {
        Animal perro = new Perro("Jager","Carne",5,"Labrador");
        perro.alimentoAnimal();
        Perro perro1 = new Perro("Coki","Pollo",15,"Salchicha");
        perro1.alimentoAnimal();
        Animal gato = new Gato("Catriel","Atun",14,"Gordo");
        gato.alimentoAnimal();
        Animal caballo = new Caballo("Speak","Pasto",25,"Fino");
        caballo.alimentoAnimal();
     
    }

}
