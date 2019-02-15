package bangundatar;

// Created on Feb 16, 2019 4:59:43 AM

public class Lingkaran implements BangunDatar {
  
  private double pi = Math.PI;
  
  Lingkaran(){}
  
  @Override
  public double luas(int s1, int s2) {
    return 0;
  }
  
  @Override
  public double keliling(int s1, int s2) {
    return 0;
  }
  
  public double luas(int r){ //metode overload
    return (pi * r * r);
  }
  
  public double keliling(int r){ //methode overload
    return (2 * pi * r);
  }
}
