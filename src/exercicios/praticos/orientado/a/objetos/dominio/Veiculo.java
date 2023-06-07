package exercicios.praticos.orientado.a.objetos.dominio;


public class Veiculo {
    private double km1;
    private double km2;
    private double litros;

    public Double calculaKmTotal() {
        return this.km2 - this.km1;
    }
    public Double calculaMediaKmLitro() {
        return  (this.km2-this.km1) / this.litros;
    }
    public Double calculaMediaLitroKm() {
        return  this.litros / (this.km2-this.km1);
    }

    public Double calculaMlLitroKm() {
        if (calculaMediaLitroKm() < 1) {
            return calculaMediaLitroKm() * 1000;
        } else {
            return calculaMediaLitroKm();
        }
    }
        public String imprimeMlouLitro() {
            if (calculaMediaLitroKm() < 1) {
                return " ml por km";
            }
            return " litro por km";
        }
    public void imprimirResultados(){
         System.out.print("O total percorrido foi de " + calculaKmTotal() +" Km\n");
         System.out.print("Autonomia : "+ calculaMediaKmLitro() + " Km / litro\n");
         System.out.println("A Taxa media de consumo é de "+ calculaMlLitroKm() + imprimeMlouLitro());
        }
    public Veiculo() {
    }

    public double getKm1() {
        return km1;
    }

    public void setKm1(double km1) {
        this.km1 = km1;
    }

    public double getKm2() {
        return km2;
    }

    public void setKm2(double km2) {
        this.km2 = km2;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}