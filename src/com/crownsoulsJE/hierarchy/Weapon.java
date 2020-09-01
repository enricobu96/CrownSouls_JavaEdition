package com.crownsoulsJE.hierarchy;

public interface Weapon extends InventoryItem {
  public void setPhysicalDmg(int physicalDmg);
  public void setMagicalDmg(int magicalDmg);

  public int getPhysicalDmg();
  public int getMagicalDmg();
  public int getLevelDmg();

  int calculateLevelDmg();
  double getTotalDmg();
}
