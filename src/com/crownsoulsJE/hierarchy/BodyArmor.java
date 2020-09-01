package com.crownsoulsJE.hierarchy;

public class BodyArmor implements Armor {
  private int physicalDef;
  private int magicalDef;
  private int balance;

  private String name;
  private int itemLevel;
  private String description;

  private int fallingDef;
  private int stabbingDef;

  public BodyArmor(int physicalDef, int magicalDef, int balance,
                   String name, int itemLevel, String description,
                   int fallingDef, int stabbingDef) {
    this.setPhysicalDef(physicalDef);
    this.setMagicalDef(magicalDef);
    this.setBalance(balance);
    this.setName(name);
    this.setItemLevel(itemLevel);
    this.setDescription(description);
    this.setFallingDef(fallingDef);
    this.setStabbingDef(stabbingDef);
  }

  public void setFallingDef(int fallingDef) {
    if(fallingDef > 0 && fallingDef < 100)
      this.fallingDef = fallingDef;
    else
      this.fallingDef = 0;
  }

  public void setStabbingDef(int stabbingDef) {
    if(stabbingDef > 0 && stabbingDef < 100)
      this.stabbingDef = stabbingDef;
    else
      this.stabbingDef = 0;
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
    return physicalDef+magicalDef+balance+fallingDef+stabbingDef;
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
    return "armor";
  }
}
