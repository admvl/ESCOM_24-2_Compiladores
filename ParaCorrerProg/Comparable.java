// Interface para comparar objectos, definido en java.lang
package java.lang;

public interface Comparable {
  public int compareTo(Object o);
}

public class String extends Object
implements Comparable {
  // cuerpo de la class omitido
}

public class Date extends Object
implements Comparable {
  // cuerpo de la class omitido
}

//Ejercicios de instanceof

s instanceof String
s instanceof Object
s instanceof Comparable

d instanceof java.util.Date
d instanceof Object
d instanceof Comparable


// Max.java: Encuentra un objeto mayor
public class Max {
  /** Return el maximo de dos objetos */
  public static Comparable max
      ( Comparable o1, Comparable o2 ) {
    if (o1.compareTo(o2) > 0)
      return o1;
    else
      return o2;
  }
}

// Max.java: Encuentra un objeto mayor
public class Max {
  /** Return el maximo de dos objetos */
  public static Object max
    ( Object o1, Object o2 ) {
  if (( (Comparable)o1 ).compareTo(o2) > 0)
    return o1;
  else
    return o2;
  }
}

public class TestComparar {
  public static void main(String[] args) {
    Max.max(anyObject1, anyObject2);
  }
}

String s1 = "abcdef" ;
String s2 = "abcdee" ;
String s3 = (String)Max.max(s1, s2);

Date d1 = new Date();
Date d2 = new Date();
Date d3 = (Date)Max.max(d1, d2);


