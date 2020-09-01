package com.crownsoulsJE.hierarchy;

public class Ring implements InventoryItem {
  private double statsIncreasing;

  private String name;
  private int itemLevel;
  private String description;

  public Ring(String name, int itemLevel, String description,
              double statsIncreasing) {
    this.setName(name);
    this.setItemLevel(itemLevel);
    this.setDescription(description);
    this.setStatsIncreasing(statsIncreasing);
  }

  public void setStatsIncreasing(double statsIncreasing) {
    if(statsIncreasing > 0 && statsIncreasing < 3)
      this.statsIncreasing = statsIncreasing;
    else
      this.statsIncreasing = 0;
  }

  public double getStatsIncreasing() {
    return statsIncreasing;
  }

  @Override
  public void setName(String name) {
    if(name.length() > 100)
      this.name = "";
    else
      this.name = name;
  }

  @Override
  public void setItemLevel(int itemLevel) {
    if(itemLevel > 99)
      this.itemLevel = 0;
    else
      this.itemLevel = itemLevel;
  }

  @Override
  public void setDescription(String description) {
    if(description.length() > 5000)
      this.description = "";
    else
      this.description = description;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getItemLevel() {
    return this.itemLevel;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public String getType() {
    return "ring";
  }
}
