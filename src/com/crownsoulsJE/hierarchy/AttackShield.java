package com.crownsoulsJE.hierarchy;

public class AttackShield implements Weapon, Shield {
  private String name;
  private int itemLevel;
  private String description;

  private int physicalDmg;
  private int magicalDmg;
  private int levelDmg;

  private int physicalRed;
  private int magicalRed;

  private int dexScaling;

  public AttackShield(String name, int itemLevel, String description,
                      int physicalDmg, int magicalDmg,
                      int physicalRed, int magicalRed,
                      int dexScaling) {
    this.setName(name);
    this.setItemLevel(itemLevel);
    this.setDescription(description);
    this.setPhysicalDmg(physicalDmg);
    this.setMagicalDmg(magicalDmg);
    this.levelDmg = calculateLevelDmg();
    this.setPhysicalRed(physicalRed);
    this.setMagicalRed(magicalRed);
    this.setDexScaling(dexScaling);
  }

  public void setDexScaling(int dexScaling) {
    if(dexScaling > 0 && dexScaling < 5)
      this.dexScaling = dexScaling;
    else
      this.dexScaling = 0;
  }

  public int getDexScaling() {
    return dexScaling;
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
  public void setPhysicalDmg(int physicalDmg) {
    if(physicalDmg > 0 && physicalDmg < 500)
      this.physicalDmg = physicalDmg;
    else
      this.physicalDmg = 0;
  }

  @Override
  public void setMagicalDmg(int magicalDmg) {
    if(magicalDmg > 0 && magicalDmg < 500)
      this.magicalDmg = magicalDmg;
    else
      this.magicalDmg = 0;
  }

  @Override
  public int getPhysicalDmg() {
    return physicalDmg;
  }

  @Override
  public int getMagicalDmg() {
    return magicalDmg;
  }

  @Override
  public int getLevelDmg() {
    return levelDmg;
  }

  @Override
  public int calculateLevelDmg() {
    return getItemLevel()*3;
  }

  @Override
  public double getTotalDmg() {
    return physicalDmg+magicalDmg+levelDmg;
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
    return "weaponshield";
  }
}
