tablero = [9]

def main():
    pos = 0;
    op = 0;
    while 3:
        menu()
        op = input()
        match op:
            case 1:




def menu():
    print(f"introduce lo que quieras hacer: ")
    print(f"1). Jugar ")
    print(f"2). Estadisticas ")
    print(f"3). Salir ")

def muevejugador1(pos):
    if(movientoValido()):
        tablero[pos] = 'x'

def muevejujugador2(pos):
    if(movientoValido()):
        tablero[pos] = 'o'

def movientoValido(pos):
    if(pos >=1 and pos <=9):
        if(quedanCasillas()):
            return True
    return False

def iniciar():
    for i in range(9):
        tablero[i] = ' '


def quedanCasillas():
    for i in range(9):
        if(tablero[i] == ' '):
            return True
    return False

def DibujarTablero():
    print(f"---------------------")
    print(f"|"+tablero[0]+"|"+tablero[1]+"|"+tablero[2]+"|")
    print(f"---------------------")
    print(f"|" + tablero[3] + "|" + tablero[4] + "|" + tablero[5] + "|")
    print(f"---------------------")
    print(f"|" + tablero[6] + "|" + tablero[7] + "|" + tablero[8] + "|")
    print(f"---------------------")

def ganarJugador1():
    if(tablero[0]=='x' and tablero[1]=='x'and tablero[2]=='x'):
        return True
    if(tablero[3]=='x' and tablero[4]=='x'and tablero[5]=='x'):
        return True
    if(tablero[6]=='x' and tablero[7]=='x'and tablero[8]=='x'):
        return True
    if(tablero[0]=='x' and tablero[4]=='x'and tablero[8]=='x'):
        return True
    if(tablero[2]=='x' and tablero[4]=='x'and tablero[6]=='x'):
        return True
    if(tablero[0]=='x' and tablero[3]=='x'and tablero[6]=='x'):
        return True
    if(tablero[1]=='x' and tablero[4]=='x'and tablero[7]=='x'):
        return True
    if(tablero[2]=='x' and tablero[5]=='x'and tablero[8]=='x'):
        return True
    return False

def ganarJugador2():
    if(tablero[0]=='o' and tablero[1]=='o'and tablero[2]=='o'):
        return True
    if(tablero[3]=='o' and tablero[4]=='o'and tablero[5]=='o'):
        return True
    if(tablero[6]=='o' and tablero[7]=='o'and tablero[8]=='o'):
        return True
    if(tablero[0]=='o' and tablero[4]=='o'and tablero[8]=='o'):
        return True
    if(tablero[2]=='o' and tablero[4]=='o'and tablero[6]=='o'):
        return True
    if(tablero[0]=='o' and tablero[3]=='o'and tablero[6]=='o'):
        return True
    if(tablero[1]=='o' and tablero[4]=='o'and tablero[7]=='o'):
        return True
    if(tablero[2]=='o' and tablero[5]=='o'and tablero[8]=='o'):
        return True
    return False