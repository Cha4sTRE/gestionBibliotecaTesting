package cj.projects.biblioteca.mocks;

public class DataBaseMock {
    public class DatabaseMock {

        /**
         * Simula que los libros con ID par están disponibles.
         */
        public boolean libroDisponible(int libroId) {
            return libroId % 2 == 0;
        }

        /**
         * Simula registrar un préstamo en la "base de datos".
         */
        public boolean registrarPrestamo(int usuarioId, int libroId) {
            System.out.println("[MOCK] Préstamo registrado: User=" + usuarioId + ", Book=" + libroId);
            return true;
        }
    }
}
