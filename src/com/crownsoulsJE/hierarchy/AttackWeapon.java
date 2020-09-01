package com.crownsoulsJE.hierarchy;

public class AttackWeapon implements Weapon {
  private String name;
  private int itemLevel;
  private String description;

  private int physicalDmg;
  private int magicalDmg;
  private int levelDmg;

  private int strScaling;
  private int dexScaling;

  public void AttackWeapon(String name, int itemLevel, String description,
                           int physicalDmg, int magicalDmg,
                           int strScaling, int dexScaling) {
    this.setName(name);
    this.setItemLevel(itemLevel);
    this.setDescription(description);
    this.setPhysicalDmg(physicalDmg);
    this.setMagicalDmg(magicalDmg);
    this.levelDmg = calculateLevelDmg();
    this.setStrScaling(strScaling);
    this.setDexScaling(dexScaling);
  }

  public void setStrScaling(int strScaling) {
    if(strScaling > 0 && strScaling < 5)
      this.strScaling = strScaling;
    else
      this.strScaling = 0;
  }

  public void setDexScaling(int dexScaling) {
    if(dexScaling > 0 && dexScaling < 5)
      this.dexScaling = dexScaling;
    else
      this.dexScaling = 0;
  }

  public int getStrScaling() {
    return strScaling;
  }

  public int getDexScaling() {
    return dexScaling;
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
    return "weapon";
  }
}
