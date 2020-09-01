package com.crownsoulsJE.hierarchy;

public class Gloves implements Armor, Weapon {
  private int physicalDef;
  private int magicalDef;
  private int balance;

  private String name;
  private int itemLevel;
  private String description;

  private int physicalDmg;
  private int magicalDmg;
  private int levelDmg;

  private int strScaling;

  public Gloves(String name, int itemLevel, String description,
                int physicalDef, int magicalDef, int balance,
                int physicalDmg, int magicalDmg,
                int strScaling) {
    this.setName(name);
    this.setItemLevel(itemLevel);
    this.setDescription(description);
    this.setPhysicalDef(physicalDef);
    this.setMagicalDef(magicalDef);
    this.setBalance(balance);
    this.setPhysicalDmg(physicalDmg);
    this.setMagicalDmg(magicalDmg);
    this.levelDmg = calculateLevelDmg();
    this.setStrScaling(strScaling);
  }

  @Override
  public void setPhysicalDef(int physicalDef) {
    if(physicalDef > 0 && physicalDef < 200)
      this.physicalDef = physicalDef;
    else
      this.physicalDef = 0;
  }

  @Override
  public void setMagicalDef(int magicalDef) {
    if(magicalDef > 0 && magicalDef < 200)
      this.magicalDef = magicalDef;
    else
      this.magicalDef = 0;
  }

  @Override
  public void setBalance(int balance) {
    if(balance > 0 && balance < 30)
      this.balance = balance;
    else
      this.balance = 0;
  }

  public void setStrScaling(int strScaling) {
    if(strScaling > 0 && strScaling < 5)
      this.strScaling = strScaling;
    else
      this.strScaling = 0;
  }

  @Override
  public int getPhysicalDef() {
    return physicalDef;
  }

  @Override
  public int getMagicalDef() {
    return magicalDef;
  }

  @Override
  public int getBalance() {
    return balance;
  }

  @Override
  public double getTotalDef() {
    return physicalDef+magicalDef+balance;
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
  public int getLevelDmg() { return levelDmg; }

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
    return "weaponarmor";
  }
}
