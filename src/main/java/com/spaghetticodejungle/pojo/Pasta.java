package com.spaghetticodejungle.pojo;

public sealed class Pasta permits LongAndMediumLength, ShortCut, Stretched, Soup, WithFilling, Gnocchi {

  private Enum pastaSize;
  private String type;
  private String description;
  private String translation;
  private String synonyms;
  private String origin;

  public Pasta(Enum pastaSize, String type, String description, String translation,
      String synonyms, String origin) {
    this.pastaSize = pastaSize;
    this.type = type;
    this.description = description;
    this.translation = translation;
    this.synonyms = synonyms;
    this.origin = origin;
  }

  public Enum getPastaSize() {
    return pastaSize;
  }

  public void setPastaSize(Enum pastaSize) {
    this.pastaSize = pastaSize;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getTranslation() {
    return translation;
  }

  public void setTranslation(String translation) {
    this.translation = translation;
  }

  public String getSynonyms() {
    return synonyms;
  }

  public void setSynonyms(String synonyms) {
    this.synonyms = synonyms;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  @Override
  public String toString() {
    return "Pasta{" +
        "pastaSize=" + pastaSize +
        ", type='" + type + '\'' +
        ", description='" + description + '\'' +
        ", translation='" + translation + '\'' +
        ", synonyms='" + synonyms + '\'' +
        ", origin='" + origin + '\'' +
        '}';
  }
}
