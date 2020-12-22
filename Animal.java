public class Animal
{
  protected String nom = "";

  public Animal(String nom)
  {
    this.nom = nom;
  }

  public Animal(){};

  public String getType()
  {
    if (this.nom.equals(""))
    {
      return "Je suis un animal.";
    }
    else
    {
      return "Je suis un animal" + " de nom " + this.nom + ".";
    }
  }
}
