import processing.core.PImage;
// importamos la libreria principal
import processing.core.PApplet;

/** Hereda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Imagenes extends PApplet {
        // definimos atributos para todoa la clase
        // es la ventana de salida de la aplicacion
        // en Processing las aplicaciones se llaman sketchs
        int viewport_w = 800; // ancho en pixels
        int viewport_h = 600; // alto en pixels

        // truco para poder ejecutar nuestro código
        // en el entorno gráfico ya creado
        public static void main(String args[]) {
            PApplet.main("Imagenes");
        }

        // método que tiene las configuraciones iniciales
        @Override
        public void settings() {
            size(viewport_w, viewport_h, P2D);
            smooth(8);
        }
        // declaramos el objeto para poder tener acceso en toda la clase
        PImage theKing;
        // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
        @Override
        public void setup() {
            // fondo de la ventana
            background(0);
            // Necesitamos darle la ruta absoluta
            // la función dataPath nos crea la ruta al directorio
            // data en la raíz del proyecto
            // inicializamos el objeto con la imagen del directorio 'data'
            theKing = loadImage(dataPath("LeoMessi.jpg"));
        }

        // método principal.
        // ACUERDATE: esto se repite en bucle indefinidamente
        @Override
        public void draw() {
            // cargamos la imagen en la ventana en cada iteración del bucle
            // posicionamos la imagen segun el movimiento del raton
            image(theKing,0,0,mouseX,mouseY);
            tint(255,mouseY,mouseX);
        }

}
