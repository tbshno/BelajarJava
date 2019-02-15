package bangundatar;

// Created on Feb 16, 2019 4:59:43 AM

public class Lingkaran implements BangunDatar {
  
  private double pi = Math.PI;
  
  Lingkaran(){}
  
  @Override
  public double luas(double s1, double s2) {
    return 0;
  }
  
  @Override
  public double keliling(double s1, double s2) {
    return 0;
  }
  
  public double luas(double r){ //metode overload
    return (pi * r * r);
  }
  
  public double keliling(double r){ //methode overload
    return (2 * pi * r);
  }
}
