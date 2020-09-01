package com.crownsoulsJE.hierarchy;

public class DefenseShield implements Shield{
  private String name;
  private int itemLevel;
  private String description;

  private int physicalRed;
  private int magicalRed;

  public DefenseShield(String name, int itemLevel, String description,
                       int physicalRed, int magicalRed) {
    this.setName(name);
    this.setItemLevel(itemLevel);
    this.setDescription(description);
    this.setPhysicalRed(physicalRed);
    this.setMagicalRed(magicalRed);
  }

  @Override
  public void setPhysicalRed(int physicalRed) {
    if(physicalRed > 0 && physicalRed < 100)
      this.physicalRed = physicalRed;
    else
      this.physicalRed = 0;
  }

  @Override
  public void setMagicalRed(int magicalRed) {
    if(magicalRed > 0 && magicalRed < 100)
      this.magicalRed = magicalRed;
    else
      this.magicalRed = 0;
  }

  @Override
  public int getPhysicalRed() {
    return physicalRed;
  }

  @Override
  public int getMagicalRed() {
    return magicalRed;
  }

  @Override
  public int getTotalRed() {
    return magicalRed+physicalRed;
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
    return "shield";
  }
}
