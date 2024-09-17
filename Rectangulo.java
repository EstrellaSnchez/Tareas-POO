public class Rectangulo {
   
        public Double Largo;
        public Double Ancho;
    
        public Rectangulo(Double Largo, Double Ancho) {
    
            this.Largo = Largo;
            this.Ancho = Ancho;  }
    
        public Double CalcularArea() {
            return (this.Largo * this.Ancho); }
    
        public int CalcularArea(int largo, int ancho) {
            return largo * ancho;
        }
    
        public Double CalcularPerimetro() {
            return 2*(this.Largo + this.Ancho);
        }
    
        public int CalcularPerimetro(int largo, int ancho) {
            int perimetro = 2 * largo + 2 * ancho; return perimetro;}
    }

