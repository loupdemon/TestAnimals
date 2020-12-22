class Homme extends Mammifère
{
  public Homme(String nom)
  {
    this.nom = nom;
  }

  public Homme()
  {};

  public String getType()
  {
    return super.getType() + " Je suis un homme.";
  }
}
