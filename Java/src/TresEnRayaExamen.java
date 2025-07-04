package src;

public class TresEnRayaExamen {
    private final int[][] tablero = new int[3][3];
    private int fichaJugador1;
    private int fichaJugador2;

    public TresEnRayaExamen() {
        iniciar();
    }

    public void eligeFichero1(int fichaEliegida) {
        if (fichaEliegida == 1) {
            fichaJugador1 = 1;
        }
        if (fichaEliegida == 2) {
            fichaJugador1 = 2;
        }
    }

    public void eligeFichero2(int fichaJugador1) {
        if (fichaJugador1 == 1) {
            fichaJugador2 = 2;
        }
        if (fichaJugador1 == 2) {
            fichaJugador2 = 1;
        }
    }

    public void mueveJugador1(int pos) {
        while (movimientoValido(pos)) {
            tablero[(pos - 1) / 3][(pos - 1) % 3] = fichaJugador1;
            DibujaTablero();

        }
    }

    public void mueveJugador2(int pos) {
        if (movimientoValido(pos)) {
            tablero[(pos - 1) / 3][(pos - 1) % 3] = fichaJugador2;
            DibujaTablero();
        } else {
            System.out.println("numero no valido escribre otro");
        }
    }

    public void mueveOrdenador1(int pos) {
        if (movimientoValido(pos)) {
            tablero[(pos - 1) / 3][(pos - 1) % 3] = 1;
            DibujaTablero();
        } else {
            System.out.println("numero no valido escribre otro");
        }
    }

    public void mueveOrdenador2(int pos) {
        if (movimientoValido(pos)) {
            tablero[(pos - 1) / 3][(pos - 1) % 3] = 2;
            DibujaTablero();
        } else {
            System.out.println("numero no valido escribre otro");
        }
    }

    public boolean movimientoValido(int pos) {//averiguar si quedan movimiento válido...
        if (pos >= 1 && pos <= 9) {
            return tablero[(pos - 1) / 3][(pos - 1) % 3] == 0;
        }
        return false;
    }

    public boolean quedanMovimientos() {
        for (int[] ints : tablero) {
            for (int j = 0; j < tablero.length; j++) {
                if (ints[j] == 0) {
                    return true;
                }

            }
        }
        return false;
    }

    public boolean ganaJugador1() {
        if (tablero[0][0] == fichaJugador1 && tablero[0][1] == fichaJugador1 && tablero[0][2] == fichaJugador1) {
            return true;
        }
        if (tablero[1][0] == fichaJugador1 && tablero[1][1] == fichaJugador1 && tablero[1][2] == fichaJugador1) {
            return true;
        }
        if (tablero[2][0] == fichaJugador1 && tablero[2][1] == fichaJugador1 && tablero[2][2] == fichaJugador1) {
            return true;
        }
        if (tablero[0][0] == fichaJugador1 && tablero[1][1] == fichaJugador1 && tablero[2][2] == fichaJugador1) {
            return true;
        }
        if (tablero[0][2] == fichaJugador1 && tablero[1][1] == fichaJugador1 && tablero[2][0] == fichaJugador1) {
            return true;
        }
        if (tablero[0][0] == fichaJugador1 && tablero[1][0] == fichaJugador1 && tablero[2][0] == fichaJugador1) {
            return true;
        }
        if (tablero[0][1] == fichaJugador1 && tablero[1][1] == fichaJugador1 && tablero[2][1] == fichaJugador1) {
            return true;
        }
        return tablero[0][2] == fichaJugador1 && tablero[1][2] == fichaJugador1 && tablero[2][2] == fichaJugador1;

    }

    public boolean ganaJugador2() {
        if (tablero[0][0] == fichaJugador2 && tablero[0][1] == fichaJugador2 && tablero[0][2] == fichaJugador2) {
            return true;
        }
        if (tablero[1][0] == fichaJugador2 && tablero[1][1] == fichaJugador2 && tablero[1][2] == fichaJugador2) {
            return true;
        }
        if (tablero[2][0] == fichaJugador2 && tablero[2][1] == fichaJugador2 && tablero[2][2] == fichaJugador2) {
            return true;
        }
        if (tablero[0][0] == fichaJugador2 && tablero[1][1] == fichaJugador2 && tablero[2][2] == fichaJugador2) {
            return true;
        }
        if (tablero[0][2] == fichaJugador2 && tablero[1][1] == fichaJugador2 && tablero[2][0] == fichaJugador2) {
            return true;
        }
        if (tablero[0][0] == fichaJugador2 && tablero[1][0] == fichaJugador2 && tablero[2][0] == fichaJugador2) {
            return true;
        }
        if (tablero[0][1] == fichaJugador2 && tablero[1][1] == fichaJugador2 && tablero[2][1] == fichaJugador2) {
            return true;
        }
        return tablero[0][2] == fichaJugador2 && tablero[1][2] == fichaJugador2 && tablero[2][2] == fichaJugador2;
    }

    public boolean ganaMaquina1() {
        if (tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1) {
            return true;
        }
        if (tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1) {
            return true;
        }
        if (tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1) {
            return true;
        }
        if (tablero[0][0] == 1 && tablero[1][1] == 1 && tablero[2][2] == 1) {
            return true;
        }
        if (tablero[0][2] == 1 && tablero[1][1] == 1 && tablero[2][0] == 1) {
            return true;
        }
        if (tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1) {
            return true;
        }
        return tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1;

    }

    public boolean ganaMaquina2() {
        if (tablero[0][0] == 2 && tablero[0][1] == 2 && tablero[0][2] == 2) {
            return true;
        }
        if (tablero[1][0] == 2 && tablero[1][1] == 2 && tablero[1][2] == 2) {
            return true;
        }
        if (tablero[2][0] == 2 && tablero[2][1] == 2 && tablero[2][2] == 2) {
            return true;
        }
        if (tablero[0][0] == 2 && tablero[1][1] == 2 && tablero[2][2] == 2) {
            return true;
        }
        if (tablero[0][2] == 2 && tablero[1][1] == 2 && tablero[2][0] == 2) {
            return true;
        }
        if (tablero[0][0] == 2 && tablero[1][0] == 2 && tablero[2][0] == 2) {
            return true;
        }
        return tablero[0][1] == 2 && tablero[1][1] == 2 && tablero[2][1] == 2;
    }


    public void DibujaTablero() {//mostramos el tablero
        System.out.println("-------------------");
        char simbolo;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 1) {
                    simbolo = 'X';
                    System.out.print("| " + simbolo + " ");
                } else if (tablero[i][j] == 2) {
                    simbolo = 'O';
                    System.out.print("| " + simbolo + " ");
                } else if (tablero[i][j] == 0) {
                    simbolo = ' ';
                    System.out.print("| " + simbolo + " ");
                }
            }
            System.out.println("|");
            System.out.println("-----------------");
        }
    }

    //inicalizar el tablero
    public void iniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }

    }

}
