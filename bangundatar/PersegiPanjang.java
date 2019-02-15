package bangundatar;

// Created on Feb 16, 2019 4:54:11 AM

public class PersegiPanjang implements BangunDatar{
  
  PersegiPanjang(){}
  
  
  @Override
  public double luas(double s1, double s2) {
    return (s1 * s2);
  }
  
  @Override
  public double keliling(double s1, double s2) {
    return (2.0 * (s1 + s2));
  }
}
