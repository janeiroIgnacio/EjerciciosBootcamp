package PracticaClase3;

public enum EjercicioEnum {

        EJERCICIO1{
            @Override
            public Ejercicio getEjercicio() {
                return ejercicioFactory.ejercicio1();
            }
        },
        EJERCICIO2{
            @Override
            public Ejercicio getEjercicio() {
                return ejercicioFactory.ejercicio2();
            }
        },
        EJERCICIO3{
            @Override
            public Ejercicio getEjercicio() {
                return ejercicioFactory.ejercicio3();
            }
        },
        EJERCICIO4{
            @Override
            public Ejercicio getEjercicio() {
                return ejercicioFactory.ejercicio4();
            }
        },
        EJERCICIO5{
            @Override
            public Ejercicio getEjercicio() {
                return ejercicioFactory.ejercicio5();
            }
        },
        EJERCICIO7{
        @Override
        public Ejercicio getEjercicio() {
            return ejercicioFactory.ejercicio7();
        }
    },
    EJERCICIO8{
        @Override
        public Ejercicio getEjercicio() {
            return ejercicioFactory.ejercicio8();
        }
    };

        EjercicioFactory ejercicioFactory = new EjercicioFactory();
        public abstract Ejercicio getEjercicio();

}
