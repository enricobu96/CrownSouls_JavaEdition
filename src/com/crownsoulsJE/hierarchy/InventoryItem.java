package com.crownsoulsJE.hierarchy;

public interface InventoryItem {
  public void setName(String name);
  public void setItemLevel(int itemLevel);
  public void setDescription(String description);
  public String getName();
  public int getItemLevel();
  public String getDescription();
  public String getType();
}