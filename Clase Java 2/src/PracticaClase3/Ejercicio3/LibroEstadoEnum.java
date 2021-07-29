package PracticaClase3.Ejercicio3;

public enum LibroEstadoEnum {

        PRESTAMO{
            @Override
            public String getString() { return LibroConst.PRESTAMO;}
        },
        DEVOLUCION{
            @Override
            public String getString() {
                return LibroConst.DEVOLUCION;
            }
        };

        public abstract String getString();

}
