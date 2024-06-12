package day35_inheritance.computer;

public class Windows extends Computer{

    String edgeVersion;



    public Windows(String os, int memory) {
        //super();
        super(os, memory);//debo usar esto porque ya tengo un nuevo constructor, porque debo hacerlo explicitamente.
        //this.os = os;
        //this.memory = memory;
    }


    // new Windows ("Windows", 512, "3.4")
    public Windows (String os, int memory, String edgeVersion){
        //super(os, memory);
        this(os, memory); // this("Windows", 512)
        this.edgeVersion = edgeVersion;
    }



}
/*TODAS LAS SIGUIENTE ACOTACIONES SON PARA CONSTRUCTORS.
when your children has the same instance avriables que el padre.
ENtonces si thengo this, hace referencia a la de mi clase actual, pero si uso el super instead of this, me refiero a la del padre.
Ahora bien si no tengo las mismas variables en hijo y padre declaradas, es decir que solo esta en la del padre, puedo usar el this, sin ningun problema
lo mismo para los metodos instanciados del padre y el hijo.(solo en el caso que este presente en ambos. )
si yo no lo tengo en el children no tengo que usar el super. es decir, siempre que use el super es porque tengo lo mismo designado en children y padre.
 */
/*
*
* el 2 constructyor, esta llamando al 1 de arriba con this(), y en el primero yo ya tengo mi super(con los mismos valores) porque este llama a los papas y lo asigna.
*
*
* NO IMPORTA QUE TIPO DE CONSTRUCTOR TENGA EN MI CLASE PARA QUE PUEDA FUNCIONAR, PERO ESO ES PORQUE YA TENGO MI CONSTRUCTOR EN EL PARENT Y QUE NO ES DEFAULT ONE.
* */