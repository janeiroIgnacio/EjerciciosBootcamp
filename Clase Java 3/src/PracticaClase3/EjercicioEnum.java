package PracticaClase3;

import PracticaClase3.EjercicioFactory;

public enum EjercicioEnum {

        EJERCICIO1{
            @Override
            public Ejercicio getEjercicio() {
                return ejercicioFactory.ejercicio1();
            }
        };

        EjercicioFactory ejercicioFactory = new PracticaClase3.EjercicioFactory();
        public abstract Ejercicio getEjercicio();

}
