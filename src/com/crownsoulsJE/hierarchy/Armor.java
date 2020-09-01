package com.crownsoulsJE.hierarchy;

public interface Armor extends InventoryItem{
  public void setPhysicalDef(int physicalDef);
  public void setMagicalDef(int magicalDef);
  public void setBalance(int balance);

  public int getPhysicalDef();
  public int getMagicalDef();
  public int getBalance();

  double getTotalDef();
}
