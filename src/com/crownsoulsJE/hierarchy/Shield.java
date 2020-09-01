package com.crownsoulsJE.hierarchy;

public interface Shield extends InventoryItem {
  void setPhysicalRed(int physicalRed);
  void setMagicalRed(int magicalRed);

  int getPhysicalRed();
  int getMagicalRed();

  int getTotalRed();
}
