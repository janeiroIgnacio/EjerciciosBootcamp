package Practica;

public enum EjercicioEnum {

        EJERCICIO1{
            @Override
            public EjercicioAbstract getEjercicio() {
                return ejercicioFactory.ejercicio1();
            }
        },
        EJERCICIO2{
            @Override
            public EjercicioAbstract getEjercicio() {
                return ejercicioFactory.ejercicio2();
            }
        },
        EJERCICIO3{
            @Override
            public EjercicioAbstract getEjercicio() {
                return ejercicioFactory.ejercicio3();
            }
        },
        EJERCICIO4{
            @Override
            public EjercicioAbstract getEjercicio() {
                return ejercicioFactory.ejercicio4();
            }
        },
        EJERCICIO5{
            @Override
            public EjercicioAbstract getEjercicio() {
                return ejercicioFactory.ejercicio5();
            }
        };

        EjercicioFactory ejercicioFactory = new EjercicioFactory();
        public abstract EjercicioAbstract getEjercicio();

}
