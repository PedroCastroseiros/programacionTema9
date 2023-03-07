package Tema9.Pedido;

public class Cliente {
    private String NIF;
    private String razonSocial;

    public Cliente(String NIF, String razonSocial) {
        this.NIF = NIF;
        this.razonSocial = razonSocial;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Override
    public String toString() {
        return "Cliente{" + "NIF=" + NIF + ", razonSocial=" + razonSocial + '}';
    }
}

