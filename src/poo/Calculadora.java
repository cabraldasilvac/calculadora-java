package poo;

public class Calculadora {
  private Double x; // Retorna o resultado

  // Generate Getters e Setters
  private Double getX() {
    return x;
  }

  private void setX(Double x) {
    this.x = x;
  }

  // cria funções da calculadora
  // Soma
  public Double soma(double x, double y) {
    setX(x + y);

    return getX();
  }

  // subtração
  public Double subtracao(double x, double y) {
    setX(x - y);

    return getX();
  }

  // multiplicação
  public Double multiplicacao(double x, double y) {
    setX(x * y);

    return getX();
  }

  // Divisão
  public Double divisao(double x, double y) {
    setX(x / y);

    return getX();
  }

}