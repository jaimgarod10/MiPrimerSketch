// importamos la libreria principal
import processing.core.PApplet;

/**
 * Esta será nuestra clase principal
 * Hererda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Formas extends PApplet {

        // definimos atributos para todoa la clase
        // es la ventana de salida de la aplicacion
        // en Processing las aplicaciones se llaman sketchs
        int viewport_w = 500; // ancho en pixels
        int viewport_h = 340; // alto en pixels

        // truco para poder ejecutar nuestro código
        // en el entorno gráfico ya creado
        public static void main(String args[]) {
            PApplet.main("Formas");
        }

        // método que tiene las configuraciones iniciales
        @Override
        public void settings() {
            size(viewport_w, viewport_h, P2D);
            smooth(8);
        }

        // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch
        @Override
        public void setup() {
                // le damos un color al fondo
                background(250,250,250);
        }

        // método principal. Aqui estará el grueso de nuestro código
        // sería equivalente a un 'main'
        // la DIFERENCIA principal es que se ejecuta en bucle
        // es decir, se repite el código infinitamente
        @Override
        public void draw() {
                fill(209,0,0);//le damos un color rojo al rectángulo
                rect(0,0,500,100);//creamos el rectángulo con cierto tamaño
                fill(250,250,0); //le damos un color amarillo al rectángulo
                rect(0,100,500,100);//creamos el rectángulo con cierto tamaño
                fill(209,0,0);//le damos un color rojo al rectángulo
                rect(0,200,500,100);//creamos el rectángulo con cierto tamaño
                text("Bandera de Espana",0,330);
        }

}
