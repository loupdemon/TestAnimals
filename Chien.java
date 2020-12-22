class Chien extends Mammifère
{
  public Chien(String nom)
  {
    this.nom = nom;
  }

  public String getType()
  {
    return super.getType() + " Je suis un chien.";
  }
}
