package Interface;

import java.util.Date;

public interface IAssinante {
    void imprimirFatura(int mes);
    void fazerChamada(Date data, int duracao);
}
