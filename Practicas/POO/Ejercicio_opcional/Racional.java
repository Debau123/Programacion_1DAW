package Ejercicio_opcional;

public class Racional {


        private int numerador;
        private int denominador;

        public Racional(int numerador, int denominador) {
            this.numerador = numerador;
            if (denominador != 0) {
                this.denominador = denominador;
            } else {
                System.out.println("El denominador no puede ser 0");
            }
        }

        public void assignaNumerador(int x) {
            this.numerador = x;
        }

        public void assignaDenominador(int i) {
            if (i != 0) {
                this.denominador = i;
            } else {
                System.out.println("El denominador no puede ser 0");
            }
        }

        public void imprimir() {
            System.out.println("El valor del número racional es " + this.numerador + "/" + this.denominador);
        }

        public Racional suma(Racional other) {
            int nuevoNumerador = 0;
            int nuevoDenominador = 0;
            if (this.denominador == other.denominador) {
                nuevoNumerador = this.numerador + other.numerador;
                nuevoDenominador = this.denominador;
            } else {
                // Encontrar el mínimo común múltiplo de los denominadores
                int mcm = mcm(this.denominador, other.denominador);
                // Calcular los nuevos numeradores
                int factorThis = mcm / this.denominador;
                int factorOther = mcm / other.denominador;
                nuevoNumerador = this.numerador * factorThis + other.numerador * factorOther;
                nuevoDenominador = mcm;
            }
            return new Racional(nuevoNumerador, nuevoDenominador);
        }

        public Racional resta(Racional other) {
            int nuevoNumerador = 0;
            int nuevoDenominador = 0;
            if (this.denominador == other.denominador) {
                nuevoNumerador = this.numerador - other.numerador;
                nuevoDenominador = this.denominador;
            } else {
                int mcm = mcm(this.denominador, other.denominador);
                int factorThis = mcm / this.denominador;
                int factorOther = mcm / other.denominador;
                nuevoNumerador = this.numerador * factorThis - other.numerador * factorOther;
                nuevoDenominador = mcm;
            }
            return new Racional(nuevoNumerador, nuevoDenominador);
        }

        public Racional producte(Racional other) {
            int nuevoNumerador = this.numerador * other.numerador;
            int nuevoDenominador = this.denominador * other.denominador;
            return new Racional(nuevoNumerador, nuevoDenominador);
        }

        public Racional divisio(Racional other) {
            int nuevoNumerador = this.numerador * other.denominador;
            int nuevoDenominador = this.denominador * other.numerador;
            return new Racional(nuevoNumerador, nuevoDenominador);
        }

        public boolean esIgual(Racional other) {
            return this.numerador * other.denominador == this.denominador * other.numerador;
        }


        private int mcm(int a, int b) {
            return a * b / mcd(a, b);
        }

        private int mcd(int a, int b) {
            while (b != 0) {
                int t = b;
                b = a % b;
                a = t;
            }
            return a;
        }
    }
