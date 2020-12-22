public class TestAnimal
{
  public static void main(String[] args)
  {
    Animal[] animaux = new Animal[6];
    animaux[0] = new Animal("Truc");
    animaux[1] = new Animal();
    animaux[2] = new Chien("Medor");
    animaux[3] = new Homme("Aghiles");
    animaux[4] = new Homme();
    animaux[5] = new Poisson();
   
    for (int i = 0; i<6; i++)
    {
      System.out.println(animaux[i].getType());
    }
  }
}
