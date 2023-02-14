# 02-01-02-if-bool

Ezeknél a feladatoknál az elágazásban csak igaz ágat használjon!
Legyen adott a következő kódrészlet. Egészítse ki ezt a kódot úgy, hogy csak akkor legyen a program felhasználóbarát, ha a „userFrendly” változó értéke true! Felnőttkorúnak számít valaki, ha legalább 18 éves
```
  public static void metodus(boolean userFrendly) {
    System.out.println("Felnottkor meghatarozas!");
    System.out.print("Adja meg hany eves:");
    Scanner in=new Scanner(System.in);
    int year=in.nextInt();
    System.out.println("On felnottkoru!");
  }
```
